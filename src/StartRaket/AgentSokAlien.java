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
public class AgentSokAlien extends javax.swing.JFrame {
        private InfDB idb;
    /**
     * Creates new form AgentSokAlien
     * @param idb
     */
    public AgentSokAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        MetoderFyllaCB.laggTillAlien(cbAliens);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTillbaka = new javax.swing.JButton();
        cbAliens = new javax.swing.JComboBox<>();
        lblInfoOmAliens = new javax.swing.JLabel();
        lblAlienID = new javax.swing.JLabel();
        lblRegDatum = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblPlats = new javax.swing.JLabel();
        lblAnsvarigAgent = new javax.swing.JLabel();
        btnSok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        cbAliens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj en Alien" }));

        lblInfoOmAliens.setText("Information om Aliens");
        lblInfoOmAliens.setAlignmentY(0.0F);

        lblAlienID.setText("Alien ID");

        lblRegDatum.setText("Registreringsdatum");

        lblTelefon.setText("Telefon");

        lblPlats.setText("Plats");

        lblAnsvarigAgent.setText("Ansvarig Agent");

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegDatum)
                    .addComponent(lblAlienID)
                    .addComponent(lblTelefon)
                    .addComponent(lblPlats)
                    .addComponent(lblAnsvarigAgent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbAliens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnSok)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblInfoOmAliens)
                            .addGap(189, 189, 189))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnTillbaka)
                            .addGap(41, 41, 41)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblInfoOmAliens)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAliens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addGap(5, 5, 5)
                .addComponent(lblAlienID)
                .addGap(18, 18, 18)
                .addComponent(lblRegDatum)
                .addGap(18, 18, 18)
                .addComponent(lblTelefon)
                .addGap(18, 18, 18)
                .addComponent(lblPlats)
                .addGap(18, 18, 18)
                .addComponent(lblAnsvarigAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        try {
            String query = "Select alien_id from alien where namn = '" + cbAliens.getSelectedItem() + "'";
            String id = idb.fetchSingle(query);
            
            String query2 = "Select registreringsdatum from alien where namn = '" + cbAliens.getSelectedItem() + "'";
            String regDatum = idb.fetchSingle(query2);

            String query3 = "Select telefon from alien where namn = '" + cbAliens.getSelectedItem() + "'";
            String telefon = idb.fetchSingle(query3);

            String query4 = "Select plats from alien where namn = '" + cbAliens.getSelectedItem() + "'";
            String platsID = idb.fetchSingle(query4);
            String getBenamning = "select benamning from plats where plats_id = " + platsID;
            String benamning = idb.fetchSingle(getBenamning);
            
            String query5 = "Select ansvarig_agent from alien where namn = '" + cbAliens.getSelectedItem() + "'";
            String agentID = idb.fetchSingle(query5);
            String getAgentNamn = "Select namn from agent where agent_id = " + agentID;
            String agentNamn = idb.fetchSingle(getAgentNamn);

            lblAlienID.setText("AlienID: " + id);
            lblRegDatum.setText("Registrerad: " + regDatum);
            lblTelefon.setText("Tel.Nr: " + telefon);
            lblPlats.setText("Finns i: " + benamning);
            lblAnsvarigAgent.setText("Ansvarig Agent: " + agentNamn);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }//GEN-LAST:event_btnSokActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbAliens;
    private javax.swing.JLabel lblAlienID;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblInfoOmAliens;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRegDatum;
    private javax.swing.JLabel lblTelefon;
    // End of variables declaration//GEN-END:variables
}
