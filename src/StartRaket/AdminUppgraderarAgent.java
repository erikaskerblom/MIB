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
 * @author majahawia
 */
public class AdminUppgraderarAgent extends javax.swing.JFrame {
 private InfDB idb;

    /**
     * Creates new form AdminUppgraderarAlien
     * @param idb
     */
    public AdminUppgraderarAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        MetoderFyllaCB.laggTillAgent(cbNamn);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnUppgradera = new javax.swing.JButton();
        cbNamn = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hej Admin! Vänligen välj den agent som ska uppgraderas till Admin.");

        btnUppgradera.setText("Uppgradera");
        btnUppgradera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppgraderaActionPerformed(evt);
            }
        });

        cbNamn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj den agent som ska uppgraderas!" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUppgradera))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(cbNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnUppgradera)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUppgraderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppgraderaActionPerformed

        if (Validering.rattIndexComboBox(cbNamn))
        try {

            String namnPaAgent = (String) cbNamn.getSelectedItem();
            String dbNamn = "Select Agent_ID from Agent where namn = '" + namnPaAgent + "'";
            String id = idb.fetchSingle(dbNamn);

            String uppdatering = "update Agent set Administrator= 'J' where Agent_ID = " + id;

            idb.update(uppdatering);
            JOptionPane.showMessageDialog(null, "Agenten har uppgraderats");

        } catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Ett fel har uppstått");
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_btnUppgraderaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUppgradera;
    private javax.swing.JComboBox<String> cbNamn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
