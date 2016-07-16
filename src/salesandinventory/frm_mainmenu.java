/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesandinventory;

/**
 *
 * @author John
 */
public class frm_mainmenu extends javax.swing.JFrame {
    SalesAndInventory sai = new SalesAndInventory();//<-- this guys instantiates the WHOLE CLASS AGAIN!! MADA***
    /**
     * Creates new form frm_mainmenu
     */
    
    public frm_mainmenu() {
        initComponents();
        setResizable(false);
        System.out.println("ADMIN STATE @ frm_mainmenu = " + SalesAndInventory.isAdminPresent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEmpRegistration = new javax.swing.JButton();
        btnPrdRegistration = new javax.swing.JButton();
        btnLogut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViewRecords = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        btnEmpRegistration.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEmpRegistration.setText("Employee Management");
        btnEmpRegistration.setToolTipText("<html>\nClick this if you want to Add a new EMPLOYEE\n<br>\nOR\n<br>\nModify an existing EMPLOYEE\n</html>");
        btnEmpRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpRegistrationActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpRegistration);
        btnEmpRegistration.setBounds(30, 90, 340, 50);

        btnPrdRegistration.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPrdRegistration.setText("Product Management");
        btnPrdRegistration.setToolTipText("<html>\nClick this if you want to Add a new PRODUCT\n<br>\nOR\n<br>\nModify an existing PROUCT\n</html>");
        btnPrdRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrdRegistrationActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrdRegistration);
        btnPrdRegistration.setBounds(30, 140, 340, 50);

        btnLogut.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLogut.setText("Log Out");
        btnLogut.setToolTipText("<html>\nClick this if you want to LOGOUT :(\n</html>");
        btnLogut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogut);
        btnLogut.setBounds(30, 290, 340, 50);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("main menu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 194, 52);

        btnViewRecords.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnViewRecords.setText("View Records (ALPHA)");
        getContentPane().add(btnViewRecords);
        btnViewRecords.setBounds(30, 240, 340, 50);

        setSize(new java.awt.Dimension(421, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpRegistrationActionPerformed
        // TODO add your handling code here:
        frm_EmpForm openEmpForm = new frm_EmpForm();
        openEmpForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEmpRegistrationActionPerformed

    private void btnLogutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogutActionPerformed
        // TODO add your handling code here:
        frm_login openJavaForm = new frm_login();
        openJavaForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogutActionPerformed

    private void btnPrdRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrdRegistrationActionPerformed
        // TODO add your handling code here:
        frm_PrdForm openJavaForm = new frm_PrdForm();
        openJavaForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPrdRegistrationActionPerformed

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
            java.util.logging.Logger.getLogger(frm_mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_mainmenu().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpRegistration;
    private javax.swing.JButton btnLogut;
    private javax.swing.JButton btnPrdRegistration;
    private javax.swing.JButton btnViewRecords;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
