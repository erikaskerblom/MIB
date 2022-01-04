/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package StartRaket;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author erika
 */
public class AdminRegistreraAgent extends javax.swing.JFrame {
    InfDB idb;

    /**
     * Creates new form AdminRegistreraAgent
     */
    public AdminRegistreraAgent(InfDB idb) {
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

        lblText = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        txtLosen = new javax.swing.JPasswordField();
        lblLosen = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        lblAdmin = new javax.swing.JLabel();
        cbAdmin = new javax.swing.JComboBox<>();
        lblOmråde = new javax.swing.JLabel();
        cbOmråde = new javax.swing.JComboBox<>();
        btnRegistrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblText.setText("Registrera ny agent");

        lblNamn.setText("Namn");

        lblTelefon.setText("Telefon");

        txtLosen.setColumns(8);
        txtLosen.setText("jPasswordField1");
        txtLosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLosenMouseClicked(evt);
            }
        });

        lblLosen.setText("Lösenord");

        txtNamn.setColumns(8);

        txtTelefon.setColumns(8);

        lblAdmin.setText("Administratör");

        cbAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj ett alternativ", "J", "N" }));

        lblOmråde.setText("Område");

        cbOmråde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj ett alternativ", "1", "2", "4" }));

        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrera)
                    .addComponent(lblText)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblLosen)
                                .addComponent(lblNamn)
                                .addComponent(lblTelefon))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdmin)
                            .addComponent(lblOmråde))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblText)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLosen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdmin)
                    .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmråde)
                    .addComponent(cbOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnRegistrera)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
       
        
         if (Validering.textFaltHarVarde(txtNamn) && Validering.textFaltHarVarde(txtTelefon) && Validering.textFaltHarVarde(txtLosen) &&
            Validering.rattLangd(txtLosen) && Validering.rattIndexComboBox(cbAdmin) && Validering.rattIndexComboBox(cbOmråde))

            
        try 
        {
            String maxID = "SELECT max(Agent_ID) FROM Agent";
            String ID = idb.fetchSingle(maxID);
            int nyttID = Integer.parseInt(ID) + 1;
            
            Date ettDatum = new Date();
            SimpleDateFormat datumet = new SimpleDateFormat("yyyyMMdd");
            String datum = datumet.format(ettDatum);
            
            String nyttLosen = new String(txtLosen.getPassword());
            
            String arAdmin = (String) cbAdmin.getSelectedItem();
            
            String område = (String) cbOmråde.getSelectedItem();

            String fraga = "INSERT INTO Agent values(" + nyttID + ", '" + txtNamn.getText() + "', '" + txtTelefon.getText() + "', '" + datum + "', '" + arAdmin + "', '" +nyttLosen + "', " + område + ")";
            

            idb.insert(fraga);
            
                
      
            
            JOptionPane.showMessageDialog(null, "En ny agent har registrerats");
            this.setVisible(false);
        


        } 
        catch (InfException e) 
        {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void txtLosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLosenMouseClicked
        txtLosen.setText("");
    }//GEN-LAST:event_txtLosenMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JComboBox<String> cbAdmin;
    private javax.swing.JComboBox<String> cbOmråde;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblLosen;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblText;
    private javax.swing.JPasswordField txtLosen;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
