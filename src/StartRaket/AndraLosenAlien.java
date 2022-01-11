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
public class AndraLosenAlien extends javax.swing.JFrame {

    InfDB idb;
    private String alienNamn;
    private int alienID;

    /**
     * Creates new form AndraLosenAlien
     */
    public AndraLosenAlien(InfDB idb, String alienNamn, int alienID) {
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
        txtNuvarandeLosen = new javax.swing.JPasswordField();
        txtNyttLosen = new javax.swing.JPasswordField();
        btnByt = new javax.swing.JButton();
        lblNuvarande = new javax.swing.JLabel();
        lblNyttLosen = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblText.setText("Ändra ditt lösenord");

        txtNuvarandeLosen.setText("jPasswordField1");
        txtNuvarandeLosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNuvarandeLosenMouseClicked(evt);
            }
        });
        txtNuvarandeLosen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNuvarandeLosenKeyPressed(evt);
            }
        });

        txtNyttLosen.setText("jPasswordField2");
        txtNyttLosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNyttLosenMouseClicked(evt);
            }
        });
        txtNyttLosen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNyttLosenKeyPressed(evt);
            }
        });

        btnByt.setText("Byt lösenord");
        btnByt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBytActionPerformed(evt);
            }
        });

        lblNuvarande.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblNuvarande.setText("Ditt nuvarande lösenord");

        lblNyttLosen.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblNyttLosen.setText("Nytt lösenord");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblText)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNuvarandeLosen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNyttLosen)
                                    .addComponent(lblNuvarande)))
                            .addComponent(btnByt)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblText)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuvarandeLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuvarande))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNyttLosen))
                .addGap(29, 29, 29)
                .addComponent(btnByt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Denna metod låter inloggad alien ändra sitt lösenord
    private void txtNuvarandeLosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuvarandeLosenMouseClicked
        txtNuvarandeLosen.setText("");
    }//GEN-LAST:event_txtNuvarandeLosenMouseClicked

    private void txtNyttLosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNyttLosenMouseClicked
        txtNyttLosen.setText("");
    }//GEN-LAST:event_txtNyttLosenMouseClicked

    private void btnBytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBytActionPerformed
        if (Validering.rattLangd(txtNyttLosen))
try {
            String nuvarandeLosen = new String(txtNuvarandeLosen.getPassword());
            String nyttLosen = new String(txtNyttLosen.getPassword());

            String query = "Select Losenord from Alien where Alien_ID = " + alienID;
            String rattLosen = idb.fetchSingle(query);

            if (nuvarandeLosen.equals(rattLosen)) {
                idb.update("UPDATE Alien SET Losenord = '" + nyttLosen + "' where Alien_ID = " + alienID);

                JOptionPane.showMessageDialog(null, "Ditt lösenord har ändrats");
            } else {
                JOptionPane.showMessageDialog(null, "fel lösenord råtta");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "strul");
        }
    }//GEN-LAST:event_btnBytActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void txtNyttLosenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNyttLosenKeyPressed
        if(evt.getKeyCode()== java.awt.event.KeyEvent.VK_ENTER){
        this.btnByt.doClick();
      }
    }//GEN-LAST:event_txtNyttLosenKeyPressed

    private void txtNuvarandeLosenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuvarandeLosenKeyPressed

       if(evt.getKeyCode()== java.awt.event.KeyEvent.VK_ENTER){
         this.btnByt.doClick();

         if(evt.getKeyCode()== java.awt.event.KeyEvent.VK_TAB){
         this.txtNyttLosen.requestFocus();
      }
     }
    }//GEN-LAST:event_txtNuvarandeLosenKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnByt;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblNuvarande;
    private javax.swing.JLabel lblNyttLosen;
    private javax.swing.JLabel lblText;
    private javax.swing.JPasswordField txtNuvarandeLosen;
    private javax.swing.JPasswordField txtNyttLosen;
    // End of variables declaration//GEN-END:variables
}
