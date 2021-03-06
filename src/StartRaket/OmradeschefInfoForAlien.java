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
    public class OmradeschefInfoForAlien extends javax.swing.JFrame {
    private InfDB idb;
    private String alienNamn;
    private int alienID;

    /**
     * Creates new form OmradeschefInfoForAlien
     */
    public OmradeschefInfoForAlien(InfDB idb, String alienNamn, int alienID) {
        initComponents();
        this.idb = idb;
        this.alienNamn = alienNamn;
        this.alienID = alienID;
        
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
        lblSeChef = new javax.swing.JLabel();
        lblTelNr = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblText.setText("Information om din områdeschef");

        lblSeChef.setText("Namn");

        lblTelNr.setText("Telefonnummer");

        btnInfo.setText("Hämta info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblText)
                        .addComponent(lblTelNr)
                        .addComponent(lblSeChef))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInfo)
                        .addGap(91, 91, 91)))
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblText)
                .addGap(40, 40, 40)
                .addComponent(lblSeChef)
                .addGap(26, 26, 26)
                .addComponent(lblTelNr)
                .addGap(33, 33, 33)
                .addComponent(btnInfo)
                .addGap(28, 28, 28)
                .addComponent(btnTillbaka)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Klass som tar reda på vem som är områdeschef för inloggad alien
    
    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
  try {
            
            

            String query = "SELECT Namn FROM agent WHERE Agent_ID = (SELECT Ansvarig_Agent FROM alien WHERE Alien_ID = " + alienID + ")";
            String namn = idb.fetchSingle(query);

            String query2 = "SELECT Telefon FROM agent WHERE Agent_ID = (SELECT Ansvarig_Agent FROM alien WHERE Alien_ID = " + alienID + ")";
            String telNr = idb.fetchSingle(query2);
            
        

            lblSeChef.setText("Områdeschef: " + namn);
            lblTelNr.setText("Telefonnummer: " + telNr);
           
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblSeChef;
    private javax.swing.JLabel lblTelNr;
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables
}
