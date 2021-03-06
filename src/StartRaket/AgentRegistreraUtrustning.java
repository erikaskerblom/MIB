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
public class AgentRegistreraUtrustning extends javax.swing.JFrame {

    InfDB idb;

    /**
     * Creates new form AgentRegistreraUtrustning
     */
    public AgentRegistreraUtrustning(InfDB idb) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnLaggTill = new javax.swing.JButton();
        lblBenämning = new javax.swing.JLabel();
        lblTyp = new javax.swing.JLabel();
        cbTyp = new javax.swing.JComboBox<>();
        txtBenämning = new javax.swing.JTextField();
        lblEgenskap = new javax.swing.JLabel();
        txtEgenskap = new javax.swing.JTextField();
        lblText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLaggTill.setText("Lägg till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        lblBenämning.setText("Benämning");

        lblTyp.setText("Typ");

        cbTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj en typ", "Vapen", "Kommunikation", "Teknik" }));

        txtBenämning.setColumns(8);
        txtBenämning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBenämningMouseClicked(evt);
            }
        });
        txtBenämning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBenämningActionPerformed(evt);
            }
        });

        lblEgenskap.setText("Egenskap");

        txtEgenskap.setColumns(8);
        txtEgenskap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEgenskapMouseClicked(evt);
            }
        });
        txtEgenskap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEgenskapActionPerformed(evt);
            }
        });
        txtEgenskap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEgenskapKeyPressed(evt);
            }
        });

        lblText.setText("Registrera ny utrustning");

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(lblText)
                    .addComponent(btnLaggTill)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTyp)
                            .addComponent(lblBenämning)
                            .addComponent(lblEgenskap))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTyp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBenämning)
                            .addComponent(txtEgenskap))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(lblText)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTyp)
                    .addComponent(cbTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBenämning)
                    .addComponent(txtBenämning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEgenskap)
                    .addComponent(txtEgenskap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnLaggTill)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Denna metod låter en agent registrera utrustning
    private void txtBenämningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBenämningMouseClicked
        txtBenämning.setText("");
    }//GEN-LAST:event_txtBenämningMouseClicked

    private void txtEgenskapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEgenskapMouseClicked
        txtEgenskap.setText("");
    }//GEN-LAST:event_txtEgenskapMouseClicked

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed
        if (Validering.rattIndexComboBox(cbTyp) && Validering.textFaltHarVarde(txtBenämning) && Validering.textFaltHarVarde(txtEgenskap))
             try {
            String quary = "SELECT max(Utrustnings_ID) FROM utrustning";
            String id = idb.fetchSingle(quary);
            int nyttID = Integer.parseInt(id) + 1;

            idb.insert("INSERT into Utrustning values(" + nyttID + ", '" + txtBenämning.getText() + "')");

            if (cbTyp.getSelectedItem().equals("Vapen")) {

                Validering.ogiltigtVarde(txtEgenskap);
                String kaliber = txtEgenskap.getText();
                idb.insert("Insert into Vapen values (" + nyttID + "," + kaliber + ")");
                JOptionPane.showMessageDialog(null, "En ny utrustning har registrerats som vapen");
                txtBenämning.setText("");
                txtEgenskap.setText("");

            } else if (cbTyp.getSelectedItem().equals("Teknik")) {
                idb.insert("Insert into Teknik values (" + nyttID + ",'" + txtEgenskap.getText() + "')");
                JOptionPane.showMessageDialog(null, "En ny utrustning har registrerats som teknik");
                txtBenämning.setText("");
                txtEgenskap.setText("");
            } else if (cbTyp.getSelectedItem().equals("Kommunikation")) {
                idb.insert("Insert into Kommunikation values (" + nyttID + ",'" + txtEgenskap.getText() + "')");
                JOptionPane.showMessageDialog(null, "En ny utrustning har registrerats som kommunikation");
                txtBenämning.setText("");
                txtEgenskap.setText("");
            }

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_btnLaggTillActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEgenskapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEgenskapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEgenskapActionPerformed

    private void txtEgenskapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEgenskapKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            this.btnLaggTill.doClick();
        }
    }//GEN-LAST:event_txtEgenskapKeyPressed

    private void txtBenämningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBenämningActionPerformed

    }//GEN-LAST:event_txtBenämningActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JComboBox<String> cbTyp;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBenämning;
    private javax.swing.JLabel lblEgenskap;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTyp;
    private javax.swing.JTextField txtBenämning;
    private javax.swing.JTextField txtEgenskap;
    // End of variables declaration//GEN-END:variables
}
