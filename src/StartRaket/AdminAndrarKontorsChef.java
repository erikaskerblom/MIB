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
 * @author majahawia
 */
public class AdminAndrarKontorsChef extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form AdminAndrarKontorsChef
     */
    public AdminAndrarKontorsChef(InfDB idb) {
        initComponents();
        this.idb = idb;
        MetoderFyllaCB.laggTillAgent(cbChef);
        
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
        cbChef = new javax.swing.JComboBox<>();
        btnAndraChef = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vänligen välj den agent som ska bli kontorschef!");

        cbChef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj agent. " }));

        btnAndraChef.setText("Ändra kontorschef");
        btnAndraChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraChefActionPerformed(evt);
            }
        });

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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAndraChef)
                    .addComponent(jLabel1)
                    .addComponent(cbChef, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbChef, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnAndraChef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Denna metod ändrar vem som är kontorschef
    private void btnAndraChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraChefActionPerformed
    
    if (Validering.rattIndexComboBox(cbChef))

    try{
    String agent = (String) cbChef.getSelectedItem();
    String dbAgent = "Select Agent_ID from agent where namn= '" + agent + "'";
    String id = idb.fetchSingle(dbAgent);



    String uppdateraKontorsChef = "Update Kontorschef set Agent_ID = " + id + " where Kontorsbeteckning ='Örebrokontoret' ";
    idb.update(uppdateraKontorsChef);
           
    JOptionPane.showMessageDialog(null, "Kontorschefen har nu ändrats!");
   
    }
    catch (InfException e) {

    JOptionPane.showMessageDialog(null, "Ett fel har uppstått");
    System.out.println(e.getMessage());
   
    }
    }//GEN-LAST:event_btnAndraChefActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new AdminHanteraAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraChef;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbChef;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
