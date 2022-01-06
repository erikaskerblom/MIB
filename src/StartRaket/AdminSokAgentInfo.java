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
public class AdminSokAgentInfo extends javax.swing.JFrame {

    InfDB idb;

    /**
     * Creates new form sokAgentInfo
     *
     * @param idb
     */
    public AdminSokAgentInfo(InfDB idb) {
        initComponents();
        this.idb = idb;
        MetoderFyllaCB.laggTillAgent(cbAgent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbAgent = new javax.swing.JComboBox<>();
        btnSok = new javax.swing.JButton();
        lblTelefon = new javax.swing.JLabel();
        lblAnstDatum = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        lblOmrade = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj en agent" }));

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        lblTelefon.setText("Telefon");

        lblAnstDatum.setText("Anställningsdatum");

        lblAdmin.setText("Admin");

        lblOmrade.setText("Område");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblID.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(cbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnSok))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblAnstDatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblOmrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lblID)
                .addGap(18, 18, 18)
                .addComponent(lblTelefon)
                .addGap(18, 18, 18)
                .addComponent(lblAnstDatum)
                .addGap(18, 18, 18)
                .addComponent(lblAdmin)
                .addGap(18, 18, 18)
                .addComponent(lblOmrade)
                .addGap(4, 4, 4)
                .addComponent(btnTillbaka)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        try {

            String namn = (String) cbAgent.getSelectedItem();   
            String query = "Select agent_id from agent where namn = '" + namn + "'";
            String id = idb.fetchSingle(query);

            String query3 = "Select telefon from agent where namn = '" + namn + "'";
            String telefon = idb.fetchSingle(query3);

            String query2 = "Select anstallningsdatum from agent where namn = '" + namn + "'";
            String regDatum = idb.fetchSingle(query2);

            String query4;
            query4 = "Select administrator from agent where namn = '" + namn + "'";
            String arAdmin = idb.fetchSingle(query4);
            if(arAdmin.equals("J")){
            arAdmin = "Ja";
            }
            else{
            arAdmin = "Nej";
            }
            
            String query5 = "Select omrade from agent where namn = '" + namn + "'";
            String omradesID = idb.fetchSingle(query5);
            
            String getOmradesNamn = "Select benamning from omrade where omrades_id = " + omradesID;
            String omradesNamn = idb.fetchSingle(getOmradesNamn);

            lblID.setText("AgentID: " + id);
            lblTelefon.setText("Tel.Nr: " + telefon);
            lblAnstDatum.setText("Anställd: " + regDatum);
            lblAdmin.setText("Är Admin: " + arAdmin);
            lblOmrade.setText("Verkar i: " + omradesNamn);
            
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }//GEN-LAST:event_btnSokActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbAgent;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAnstDatum;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblTelefon;
    // End of variables declaration//GEN-END:variables
}