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
public class LoggaInAgent extends javax.swing.JFrame {
    private InfDB idb;

    /** Creates new form LoggaInAgent */
    public LoggaInAgent(InfDB db) {
        initComponents();
        idb = db;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVälkommen = new javax.swing.JLabel();
        txtAnvandarNamn = new javax.swing.JTextField();
        txtLosen = new javax.swing.JPasswordField();
        btnLoggaIn = new javax.swing.JButton();
        lblTips = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVälkommen.setText("Välkommen ");

        txtAnvandarNamn.setText("Användarnamn");
        txtAnvandarNamn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnvandarNamnMouseClicked(evt);
            }
        });
        txtAnvandarNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnvandarNamnActionPerformed(evt);
            }
        });
        txtAnvandarNamn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnvandarNamnKeyPressed(evt);
            }
        });

        txtLosen.setText("jPasswordField1");
        txtLosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLosenMouseClicked(evt);
            }
        });
        txtLosen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLosenKeyPressed(evt);
            }
        });

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });
        btnLoggaIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoggaInKeyPressed(evt);
            }
        });

        lblTips.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        lblTips.setText("Användarnamn är ditt ID");

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
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVälkommen)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLoggaIn)
                            .addComponent(txtAnvandarNamn)
                            .addComponent(txtLosen))
                        .addGap(18, 18, 18)
                        .addComponent(lblTips, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnTillbaka)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblVälkommen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnvandarNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTips))
                .addGap(18, 18, 18)
                .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoggaIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnTillbaka))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    //Denna metod låter agenter logga in 
    private void txtAnvandarNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnvandarNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnvandarNamnActionPerformed

    private void txtAnvandarNamnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnvandarNamnMouseClicked
        txtAnvandarNamn.setText("");
    }//GEN-LAST:event_txtAnvandarNamnMouseClicked

    private void txtLosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLosenMouseClicked
        txtLosen.setText("");
    }//GEN-LAST:event_txtLosenMouseClicked

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        
        
        try {
            Validering.ogiltigtAnvandarNamn(txtAnvandarNamn);
            Validering.textFaltHarVarde(txtAnvandarNamn);
            txtAnvandarNamn.requestFocus();
            String anvandarNamn = txtAnvandarNamn.getText();
            String query = "SELECT Losenord FROM Agent WHERE Agent_ID = " + anvandarNamn;
            String query2 = "SELECT Namn from Agent Where Agent_ID = " + anvandarNamn;
            String losenText = new String(txtLosen.getPassword());
            String namn = idb.fetchSingle(query2);
            String lösen = idb.fetchSingle(query);
            if(losenText.equals(lösen))
            {
            new InloggadAgent(idb, namn, Integer.parseInt(anvandarNamn)).setVisible(true);
            this.setVisible(false);
            
            }
            else JOptionPane.showMessageDialog(null, "Fel lösenord");
            
         
        } catch (InfException undantag) {
                JOptionPane.showMessageDialog(null, "Ett fel uppstod");
                //System.out.println(undantag.getMessage());
        }
        
    }//GEN-LAST:event_btnLoggaInActionPerformed

    private void btnLoggaInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoggaInKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoggaInKeyPressed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.setVisible(false);
        new MainMenu(idb).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void txtLosenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLosenKeyPressed
         if(evt.getKeyCode()== java.awt.event.KeyEvent.VK_ENTER){
        this.btnLoggaIn.doClick();
      }
    }//GEN-LAST:event_txtLosenKeyPressed

    private void txtAnvandarNamnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnvandarNamnKeyPressed
        if(evt.getKeyCode()== java.awt.event.KeyEvent.VK_ENTER){
        this.btnLoggaIn.doClick();
      }
    }//GEN-LAST:event_txtAnvandarNamnKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblTips;
    private javax.swing.JLabel lblVälkommen;
    private javax.swing.JTextField txtAnvandarNamn;
    private javax.swing.JPasswordField txtLosen;
    // End of variables declaration//GEN-END:variables

}
