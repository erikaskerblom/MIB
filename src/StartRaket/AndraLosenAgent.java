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
public class AndraLosenAgent extends javax.swing.JFrame {
    private InfDB idb;
    private String agentNamn;
    private int agentID;

    /**
     * Creates new form AndraLosenAgent
     */
    public AndraLosenAgent(InfDB idb, String agentNamn, int agentID) {
    this.idb=idb;
    this.agentNamn=agentNamn;
    this.agentID=agentID;
        initComponents();
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
        txtNuvarandeLosen = new javax.swing.JPasswordField();
        txtNyttLosen = new javax.swing.JPasswordField();
        btnByt = new javax.swing.JButton();
        lblNuvarande = new javax.swing.JLabel();
        lblNyttLosen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblText.setText("Ändra ditt lösenord");

        txtNuvarandeLosen.setText("jPasswordField1");
        txtNuvarandeLosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNuvarandeLosenMouseClicked(evt);
            }
        });

        txtNyttLosen.setText("jPasswordField2");
        txtNyttLosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNyttLosenMouseClicked(evt);
            }
        });

        btnByt.setText("Byt lösenord");
        btnByt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytActionPerformed(evt);
            }
        });

        lblNuvarande.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblNuvarande.setText("Nuvarande lösenord");

        lblNyttLosen.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblNyttLosen.setText("Nytt lösenord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnByt)
                    .addComponent(lblText)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNuvarandeLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNyttLosen)
                            .addComponent(lblNuvarande))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblText)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNuvarandeLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNuvarande))
                        .addGap(29, 29, 29)
                        .addComponent(txtNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNyttLosen))
                .addGap(31, 31, 31)
                .addComponent(btnByt)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNuvarandeLosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuvarandeLosenMouseClicked
        txtNuvarandeLosen.setText("");
    }//GEN-LAST:event_txtNuvarandeLosenMouseClicked

    private void txtNyttLosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNyttLosenMouseClicked
        txtNyttLosen.setText("");
    }//GEN-LAST:event_txtNyttLosenMouseClicked

    private void btnBytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytActionPerformed
        try {
            String nuvarandeLosen = new String(txtNuvarandeLosen.getPassword());
            String nyttLosen = new String(txtNyttLosen.getPassword());

            String query = "Select Losenord from Agent where Agent_ID = " + agentID;
            String rattLosen = idb.fetchSingle(query);

            if (nuvarandeLosen.equals(rattLosen)) {
                idb.update("UPDATE Agent SET Losenord = '" + nyttLosen + "' where Agent_ID = " + agentID);
                

                JOptionPane.showMessageDialog(null, "Ditt lösenord har ändrats");
            } else {
                JOptionPane.showMessageDialog(null, "fel lösenord råtta");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "strul");
        }
    }//GEN-LAST:event_btnBytActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnByt;
    private javax.swing.JLabel lblNuvarande;
    private javax.swing.JLabel lblNyttLosen;
    private javax.swing.JLabel lblText;
    private javax.swing.JPasswordField txtNuvarandeLosen;
    private javax.swing.JPasswordField txtNyttLosen;
    // End of variables declaration//GEN-END:variables
}