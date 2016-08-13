/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesandinventory;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class frm_AddSupOrMan extends javax.swing.JFrame {
SalesAndInventory sai = new SalesAndInventory();
dataForTableBuilding hatsune = new dataForTableBuilding();
RNG_Sama rngSama = new RNG_Sama();
    /**
     * Creates new form frm_AddSupOrMan
     */
    public frm_AddSupOrMan() {
        initComponents();
        setResizable(false);
        txtID.setText(Integer.toString(rngSama.RNGmaker()));
    }

    
    public void resultSetDoer(String sql){
        try{
        PreparedStatement pStmt = sai.chainSmokersConnection().prepareStatement(sql);
                //NEED TO MODIFY THIS THING AGAIN!!
                pStmt.setString (1, txtID.getText());
                pStmt.setString (2, txtName.getText());
                pStmt.execute();
                pStmt.close();
                sai.chainSmokersConnection().close();
                JOptionPane.showMessageDialog(null,"Successfully Registered");
                
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAddSupplier = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnAddManufacturer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        txtName.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtName);
        txtName.setBounds(210, 220, 270, 40);

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setText("jTextField2");
        getContentPane().add(txtID);
        txtID.setBounds(210, 130, 270, 40);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 100, 80, 30);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 190, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel3.setText("Add a New Supplier or Manufacturer");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 20, 640, 60);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        btnAddSupplier.setBackground(new java.awt.Color(255, 255, 204));
        btnAddSupplier.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        btnAddSupplier.setText("Add a Supplier");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddSupplier, java.awt.BorderLayout.LINE_START);

        btnClearAll.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        btnClearAll.setText("Clear");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });
        jPanel1.add(btnClearAll, java.awt.BorderLayout.PAGE_START);

        btnCancel.setBackground(new java.awt.Color(255, 204, 204));
        btnCancel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, java.awt.BorderLayout.PAGE_END);

        btnAddManufacturer.setBackground(new java.awt.Color(204, 255, 204));
        btnAddManufacturer.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        btnAddManufacturer.setText("Add a Manufacturer");
        btnAddManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddManufacturerActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddManufacturer, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 290, 370, 150);

        setSize(new java.awt.Dimension(697, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        frm_mainmenu openThis = new frm_mainmenu();
        openThis.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddManufacturerActionPerformed
        // TODO add your handling code here:
        sai.sql = "INSERT INTO `manufacturer_list`(`manufacturer_id`, `manufacturer_name`) VALUES (?,?)";
        resultSetDoer(sai.sql);
        txtID.setText(Integer.toString(rngSama.RNGmaker()));
        txtName.setText(null);
    }//GEN-LAST:event_btnAddManufacturerActionPerformed

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed
        // TODO add your handling code here:
        sai.sql = "INSERT INTO `supplier_list`(`supplier_id`, `supplier_name`) VALUES (?,?)";
        resultSetDoer(sai.sql);
        txtID.setText(Integer.toString(rngSama.RNGmaker()));
        txtName.setText(null);
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        // TODO add your handling code here:
        txtName.setText(null);
        txtID.setText(Integer.toString(rngSama.RNGmaker()));
    }//GEN-LAST:event_btnClearAllActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_AddSupOrMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_AddSupOrMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_AddSupOrMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_AddSupOrMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_AddSupOrMan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddManufacturer;
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
