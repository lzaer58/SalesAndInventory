/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesandinventory;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author John
 */
public class frm_EmpForm extends javax.swing.JFrame {
int userId = 0;
String sql = "", 
        fname = "",
        mname = "",
        lname = "",
        gender = "",
        birthday = "",
        birthplace = "",
        address = "",
        email = "",
        contactnum = "",
        username = "",
        password = "",
        userType = "";
    /**
     * Creates new form frm_EmpForm
     */
    public frm_EmpForm() {
        initComponents();
    }

    public void objectParser(){
        fname = txtFirstName.getText();
        mname = txtMiddleName.getText();
        lname = txtLastName.getText();
        gender = txtAddress.getText();
        birthday = txtBirthDate.getText();
        birthplace = txtBirhtPlace.getText();
        address = txtAddress.getText();
        email = txtEmailAddress.getText();
        contactnum = btnContactNumber.getText();
        username = txtUsername.getText();
        password = txtPassword.getText();
    }
    
    public void RNGMaker(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(999999);
        userId = randomInt;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsert = new javax.swing.JButton();
        btnUpdateUserInfo = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txtFirstName = new javax.swing.JTextField();
        txtMiddleName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnContactNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBirhtPlace = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rdAdmin = new javax.swing.JRadioButton();
        rdEmp = new javax.swing.JRadioButton();
        txtSearchID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnInsert.setText("Register");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(330, 50, 127, 26);

        btnUpdateUserInfo.setText("Update User Info");
        btnUpdateUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateUserInfo);
        btnUpdateUserInfo.setBounds(330, 80, 127, 26);

        btnCancel.setText("Cancel");
        getContentPane().add(btnCancel);
        btnCancel.setBounds(330, 110, 127, 26);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(420, 180, 0, 2);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        txtFirstName.setText("jTextField1");
        jPanel2.add(txtFirstName);
        txtFirstName.setBounds(10, 30, 74, 20);

        txtMiddleName.setText("jTextField2");
        jPanel2.add(txtMiddleName);
        txtMiddleName.setBounds(90, 30, 73, 20);

        txtLastName.setText("jTextField3");
        jPanel2.add(txtLastName);
        txtLastName.setBounds(170, 30, 98, 20);

        jLabel1.setText("First Name");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 61, 16);

        jLabel2.setText("Middle Name");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 10, 73, 16);

        jLabel3.setText("Last Name");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(170, 10, 61, 16);

        txtAddress.setText("jTextField1");
        jPanel2.add(txtAddress);
        txtAddress.setBounds(10, 70, 177, 20);

        txtBirthDate.setText("jTextField2");
        jPanel2.add(txtBirthDate);
        txtBirthDate.setBounds(200, 70, 75, 20);

        jLabel4.setText("Address");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 50, 46, 16);

        jLabel5.setText("Birthdate");
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 50, 49, 16);

        btnContactNumber.setText("jTextField1");
        jPanel2.add(btnContactNumber);
        btnContactNumber.setBounds(10, 120, 106, 20);

        jLabel6.setText("Contact Number");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 100, 90, 16);

        jLabel7.setText("Birth Place");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(130, 100, 59, 16);

        txtBirhtPlace.setText("jTextField1");
        jPanel2.add(txtBirhtPlace);
        txtBirhtPlace.setBounds(130, 120, 107, 20);

        txtEmailAddress.setText("jTextField2");
        jPanel2.add(txtEmailAddress);
        txtEmailAddress.setBounds(10, 170, 181, 20);

        jLabel8.setText("Email Address");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 150, 81, 16);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        rdMale.setText("Male");
        rdMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMaleActionPerformed(evt);
            }
        });

        rdFemale.setText("Female");
        rdFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFemaleActionPerformed(evt);
            }
        });

        jLabel9.setText("Gender");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(rdMale)
                    .addComponent(rdFemale))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(rdMale)
                .addGap(6, 6, 6)
                .addComponent(rdFemale)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(10, 200, 90, 90);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 150, 290, 300);

        jPanel3.setBackground(new java.awt.Color(255, 153, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        txtUsername.setText("jTextField1");
        jPanel3.add(txtUsername);
        txtUsername.setBounds(30, 40, 100, 20);

        txtPassword.setText("jTextField2");
        jPanel3.add(txtPassword);
        txtPassword.setBounds(30, 80, 100, 20);

        jLabel10.setText("Username");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(30, 20, 70, 16);

        jLabel11.setText("Password");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(30, 60, 60, 16);

        rdAdmin.setText("Type: Admin");
        rdAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdAdminActionPerformed(evt);
            }
        });
        jPanel3.add(rdAdmin);
        rdAdmin.setBounds(140, 40, 120, 24);

        rdEmp.setText("Type: Employee");
        rdEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdEmpActionPerformed(evt);
            }
        });
        jPanel3.add(rdEmp);
        rdEmp.setBounds(140, 70, 120, 24);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 20, 290, 120);
        getContentPane().add(txtSearchID);
        txtSearchID.setBounds(370, 280, 130, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        RNGMaker();
        objectParser();
        sql = "INSERT INTO `user_reg`(`Username`, `Password`, `UserType`, `user_id`, `user_FirstName`, `user_MiddleName`, `user_LastName`, `user_Address`, `user_Email`, `user_Gender`, `user_Birthdate`, `user_BirthPlace`, `user_ContactNumber`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_sandv","root","iamgroot")) {
                PreparedStatement pStmt;
                pStmt = con.prepareStatement(sql);
                pStmt.setString (1, username);
                pStmt.setString (2, password);
                pStmt.setString (3, userType);
                pStmt.setInt (4, userId);
                pStmt.setString (5, fname);
                pStmt.setString (6, mname);
                pStmt.setString (7, lname);
                pStmt.setString (8, address);
                pStmt.setString (9, email);
                pStmt.setString (10, gender);
                pStmt.setString (11, birthday);
                pStmt.setString (12, birthplace);
                pStmt.setString (13, contactnum);
                pStmt.execute();
                JOptionPane.showMessageDialog(null,"Registration Success!!");
            }         
        }catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void rdAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdAdminActionPerformed
        // TODO add your handling code here:
        userType = "ADM";
    }//GEN-LAST:event_rdAdminActionPerformed

    private void rdEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdEmpActionPerformed
        // TODO add your handling code here:
        userType = "EMP";
    }//GEN-LAST:event_rdEmpActionPerformed

    private void rdMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMaleActionPerformed
        // TODO add your handling code here:
        gender = "M";
    }//GEN-LAST:event_rdMaleActionPerformed

    private void rdFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFemaleActionPerformed
        // TODO add your handling code here:
        gender = "F";
    }//GEN-LAST:event_rdFemaleActionPerformed

    private void btnUpdateUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserInfoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnUpdateUserInfoActionPerformed

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
            java.util.logging.Logger.getLogger(frm_EmpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_EmpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_EmpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_EmpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_EmpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JTextField btnContactNumber;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdateUserInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdAdmin;
    private javax.swing.JRadioButton rdEmp;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirhtPlace;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearchID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
