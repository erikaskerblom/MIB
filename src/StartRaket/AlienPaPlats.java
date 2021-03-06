/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StartRaket;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author erika
 */
public class AlienPaPlats extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form AlienIOmrade
     */
    public AlienPaPlats(InfDB idb) {
        initComponents();
        this.idb=idb;
        MetoderFyllaCB.laggTillPlats(cbPlats);
        lblNamn.setVisible(false);
        lblTelefon.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbPlats = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        lblNamn = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj en plats" }));
        cbPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPlatsActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        lblNamn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblNamn.setText("Namn");

        lblTelefon.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblTelefon.setText("Telefon");

        lblText.setText("Sök alien på angiven plats");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNamn)
                        .addGap(76, 76, 76)
                        .addComponent(lblTelefon))
                    .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblText)
                .addGap(40, 40, 40)
                .addComponent(cbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(lblTelefon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTillbaka)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metod som låter användaren söka efter en alien på viss plats
    private void cbPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPlatsActionPerformed
        if (Validering.rattIndexComboBox(cbPlats)) {
            txtArea.setText("");
        }

        ArrayList<HashMap<String, String>> aliensIPlats;
        try {
            String valdPlats = (String) cbPlats.getSelectedItem();
            String query
                    = "SELECT * FROM Alien "
                    + "JOIN PLATS ON ALIEN.PLATS = PLATS.PLATS_ID "
                    + "WHERE BENAMNING = '" + valdPlats + "'";
           
            aliensIPlats = idb.fetchRows(query);

            for (HashMap <String, String> alien : aliensIPlats)
            {
            txtArea.append(alien.get("Namn") + "\t");
            txtArea.append(alien.get("Telefon") + "\n");
            }
            lblNamn.setVisible(true);
            lblTelefon.setVisible(true);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_cbPlatsActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbPlats;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblText;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
