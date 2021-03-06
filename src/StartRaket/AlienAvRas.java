/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StartRaket;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author erika
 */
public class AlienAvRas extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form AlienAvRas
     */
    public AlienAvRas(InfDB idb) {
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

        lblRas = new javax.swing.JLabel();
        cbRas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRas.setText("Sök efter ras");

        cbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj en ras", "Boglodite", "Squid", "Worm" }));
        cbRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRasActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

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
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRas))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblRas)
                .addGap(39, 39, 39)
                .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Metod som låter användaren söka efter en alien av viss ras
    private void cbRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRasActionPerformed
        if (Validering.rattIndexComboBox(cbRas)) {
            txtArea.setText("");
        }
        cbRas.setSelectedItem("Välj plats");

        int i = cbRas.getSelectedIndex();

        switch (i) {
            case 1: {
                try {
                    txtArea.append("Namn på alien av vald ras: \t" + ("\n"));
                    ArrayList<String> boglodite = idb.fetchColumn("SELECT NAMN FROM ALIEN "
                            + "JOIN BOGLODITE ON ALIEN.ALIEN_ID = BOGLODITE.ALIEN_ID");
                    for (String namn : boglodite) {
                        txtArea.append(namn + ("\n"));

                    }

                } catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, ex);

                }
                break;
            }
            case 2: {
                try {
                    txtArea.append("Namn på alien av vald ras: \t" + ("\n"));
                    ArrayList<String> squid = idb.fetchColumn("SELECT NAMN FROM ALIEN "
                            + "JOIN SQUID ON ALIEN.ALIEN_ID = SQUID.ALIEN_ID");
                    for (String namn : squid) {
                        txtArea.append(namn + ("\n"));

                    }
                } catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, ex);

                }
                break;
            }
            case 3: {
                txtArea.append("Namn på alien av vald ras: \t" + ("\n"));
                try {
                    ArrayList<String> worm = idb.fetchColumn("SELECT NAMN FROM ALIEN "
                            + "JOIN WORM ON ALIEN.ALIEN_ID = WORM.ALIEN_ID");
                    for (String namn : worm) {
                        txtArea.append(namn + ("\n"));
                    }

                } catch (InfException ex) {
                    JOptionPane.showMessageDialog(null, ex);

                }
                break;

            }
       }
    }//GEN-LAST:event_cbRasActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new AgentSokaAlltAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbRas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRas;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
