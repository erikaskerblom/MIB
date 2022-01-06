/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StartRaket;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author erika
 */
public class AdminTaBortUtrustning extends javax.swing.JFrame {
    InfDB idb;
    /**
     * Creates new form AdminTaBortUtrustning
     */
    public AdminTaBortUtrustning(InfDB idb) {
        initComponents();
        this.idb=idb;
        MetoderFyllaCB.laggTillUtrustning(cbUtrustning);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblText = new javax.swing.JLabel();
        btnTaBort = new javax.swing.JButton();
        cbUtrustning = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblText.setText("Vilken utrustning vill du ta bort?");

        btnTaBort.setText("Ta bort");
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        cbUtrustning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj utrustning" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblText))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaBort))))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblText)
                .addGap(36, 36, 36)
                .addComponent(cbUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnTaBort)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
       if(Validering.rattIndexComboBox(cbUtrustning))
      
     try{
        String namnet = (String) cbUtrustning.getSelectedItem();
        String query = "Select Utrustnings_ID from utrustning where Benamning = '" + namnet + "'";
        String id = idb.fetchSingle(query);

        String taBortUtrustning = "DELETE FROM Utrustning where Utrustnings_ID = " + id;
        String taBortVapen = "DELETE FROM vapen where Utrustnings_ID = " + id;
        String taBortKommunikation = "DELETE FROM kommunikation where Utrustnings_ID = " + id;
        String taBortTekik = "DELETE FROM teknik where Utrustnings_ID = " + id;
        String taBortInnehar = "DELETE FROM innehar_utrustning where Utrustnings_ID = " + id;

        idb.delete(taBortUtrustning);
        idb.delete(taBortVapen);
        idb.delete(taBortKommunikation);
        idb.delete(taBortTekik);
        idb.delete(taBortInnehar);

        JOptionPane.showMessageDialog(null, "Utrustningen har tagits borts ur systemet");
        dispose();
        }
       catch(InfException e)
        {
        JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_btnTaBortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBort;
    private javax.swing.JComboBox<String> cbUtrustning;
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables
}
