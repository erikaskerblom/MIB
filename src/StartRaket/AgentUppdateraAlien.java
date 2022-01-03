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
 * @author filip
 */
public class AgentUppdateraAlien extends javax.swing.JFrame {

    InfDB idb;

    /**
     * Creates new form AgentUppdateraAlien
     */
    public AgentUppdateraAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnUppdatera = new javax.swing.JButton();
        txtNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtPlats = new javax.swing.JTextField();
        txtAnsvarigAgent = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAlienID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Namn");

        jLabel2.setText("Telefon");

        jLabel3.setText("Plats");

        jLabel4.setText("Ansvarig Agent");

        btnUppdatera.setText("Uppdatera");
        btnUppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraActionPerformed(evt);
            }
        });

        txtNamn.setColumns(8);
        txtNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamnActionPerformed(evt);
            }
        });

        txtTelefon.setColumns(8);

        txtPlats.setColumns(8);

        txtAnsvarigAgent.setColumns(8);
        txtAnsvarigAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnsvarigAgentActionPerformed(evt);
            }
        });

        jLabel5.setText("ID på Alien du vill ändra");

        txtAlienID.setColumns(8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnUppdatera)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnUppdatera)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraActionPerformed
        if (Validering.textFaltHarVarde(txtNamn) && Validering.textFaltHarVarde(txtTelefon) && Validering.textFaltHarVarde(txtPlats)
                && Validering.textFaltHarVarde(txtAnsvarigAgent) && Validering.ogiltigtVarde(txtPlats) && Validering.ogiltigtVarde(txtAnsvarigAgent))
        
        try {
            String Namn = txtNamn.getText();
            String Telefon = txtTelefon.getText();
            int PlatsID = Integer.parseInt(txtPlats.getText());
            int AgentID = Integer.parseInt(txtAnsvarigAgent.getText());
            int AlienID = Integer.parseInt(txtAlienID.getText());
            idb.update("Update alien set Namn = '"+Namn+"', Telefon = '"+Telefon+"', Plats = '"+PlatsID+"', Ansvarig_Agent = '"+AgentID+"' where AlienID = '"+AlienID+"'");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel.");
        }
    }//GEN-LAST:event_btnUppdateraActionPerformed

    private void txtNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamnActionPerformed

    private void txtAnsvarigAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnsvarigAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnsvarigAgentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUppdatera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAlienID;
    private javax.swing.JTextField txtAnsvarigAgent;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtPlats;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}