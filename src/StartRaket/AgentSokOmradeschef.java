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
public class AgentSokOmradeschef extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form AgentSokOmradeschef
     */
    public AgentSokOmradeschef(InfDB idb) {
        this.idb = idb;
        initComponents();
        MetoderFyllaCB.laggTillOmrade(cbOmråde);
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
        lblOmrade = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblTelNr = new javax.swing.JLabel();
        btnHamtaInfo = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        cbOmråde = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblText.setText("Sök områdeschef");

        lblOmrade.setText("Område");

        lblNamn.setText("Namn");

        lblTelNr.setText("Telefonnummer");

        btnHamtaInfo.setText("Hämta info");
        btnHamtaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHamtaInfoActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        cbOmråde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj ett område" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblText)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNamn)
                                    .addComponent(lblTelNr)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblOmrade)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnHamtaInfo)
                                            .addComponent(cbOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblText)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmrade)
                    .addComponent(cbOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnHamtaInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lblNamn)
                .addGap(18, 18, 18)
                .addComponent(lblTelNr)
                .addGap(72, 72, 72)
                .addComponent(btnTillbaka)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHamtaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHamtaInfoActionPerformed
        Validering.rattIndexComboBox(cbOmråde);
        try {
            int omradesID = 0;
            String omradet = (String) cbOmråde.getSelectedItem();
            if (omradet.equals("Svealand")) {
                omradesID = 1;
            } else if (omradet.equals("Götaland")) {
                omradesID = 2;
            } else if (omradet.equals("Norrland")) {
                omradesID = 4;
            }

            String query = "SELECT Namn FROM agent where agent_ID = (SELECT Agent_ID from omradeschef where omrade = " + omradesID + ")";
            String namn = idb.fetchSingle(query);

            String query2 = "SELECT Telefon FROM agent where agent_ID = (SELECT Agent_ID from omradeschef where omrade = " + omradesID + ")";
            String telNr = idb.fetchSingle(query2);

            lblNamn.setVisible(true);
            lblTelNr.setVisible(true);

            lblNamn.setText("Områdeschef: " + namn);
            lblTelNr.setText("Telefonnummer: " + telNr);

        } catch (InfException undantaget) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + undantaget.getMessage());
        }
    }//GEN-LAST:event_btnHamtaInfoActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnTillbakaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHamtaInfo;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbOmråde;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblTelNr;
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables
}
