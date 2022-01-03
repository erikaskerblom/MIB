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
public class LoggaInAdmin extends javax.swing.JFrame {
    private InfDB idb;

    /**
     * Creates new form LoggaInAdmin
     */
    public LoggaInAdmin(InfDB db) {
        initComponents();
        idb = db;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVälkommen = new javax.swing.JLabel();
        txtAnvandarNamn = new javax.swing.JTextField();
        txtLosen = new javax.swing.JPasswordField();
        btnLoggaIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVälkommen.setText("Välkommen");

        txtAnvandarNamn.setText("Användarnamn");
        txtAnvandarNamn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAnvandarNamnMouseClicked(evt);
            }
        });

        txtLosen.setText("jPasswordField1");
        txtLosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLosenMouseClicked(evt);
            }
        });

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLoggaIn)
                    .addComponent(txtAnvandarNamn)
                    .addComponent(lblVälkommen)
                    .addComponent(txtLosen))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblVälkommen)
                .addGap(44, 44, 44)
                .addComponent(txtAnvandarNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnLoggaIn)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        if( Validering.ogiltigtAnvandarNamn(txtAnvandarNamn) && Validering.textFaltHarVarde(txtAnvandarNamn))
        
        try{ 
        
        String anvandarNamn = txtAnvandarNamn.getText();
        String losen = "Select Losenord from Agent where Agent_ID = " + anvandarNamn;
        String hittaLosen = idb.fetchSingle(losen);
        String hittaNamn = "Select Namn from Agent where Agent_ID = " + anvandarNamn;
        String namn = idb.fetchSingle(hittaNamn);
        String passText = new String(txtLosen.getPassword());
        if(passText.equals(hittaLosen))
        
        /*if else
        {
        JOptionPane.showMessageDialog(null, "Fel lösenord");
        }
        */

        {
        String fraga = "Select Administrator FROM Agent where Agent_ID = " + anvandarNamn;
        String arAdmin=idb.fetchSingle(fraga);
        
        if(arAdmin.equals("J"))
        
        new InloggadAdmin(idb, namn, Integer.parseInt(anvandarNamn)).setVisible(true);
        this.setVisible(false); 
        
        if(arAdmin.equals("N"))
        
        JOptionPane.showMessageDialog(null, "Du har inte behörighet att logga in som admin" );
        }
        }
        catch (InfException undantag) 
        {
                JOptionPane.showMessageDialog(null, "råtta");
                System.out.println(undantag.getMessage());
        }      
    }//GEN-LAST:event_btnLoggaInActionPerformed

    private void txtAnvandarNamnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAnvandarNamnMouseClicked
        txtAnvandarNamn.setText("");
    }//GEN-LAST:event_txtAnvandarNamnMouseClicked

    private void txtLosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLosenMouseClicked
        txtLosen.setText("");
    }//GEN-LAST:event_txtLosenMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JLabel lblVälkommen;
    private javax.swing.JTextField txtAnvandarNamn;
    private javax.swing.JPasswordField txtLosen;
    // End of variables declaration//GEN-END:variables
}
