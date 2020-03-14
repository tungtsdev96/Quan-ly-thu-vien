/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.view;

import borrowbook.view.RegistrationOfBorrowingBookForm;
import user.controller.AccountController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
import model.Borrower;
import model.Librarian;
import javax.swing.JOptionPane;
import card.view.SearchBorrowCardForm;

/**
 *
 * @author tungts
 */
public class LoginForm extends javax.swing.JFrame {

    ////Đăng nhập////
    public static final int LIBRARIAN = 99;
    public static final int BORROWER = 100;

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoginForCustomer = new javax.swing.JButton();
        btnRegisterAccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        btnLoginForLibrarian = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnLoginForCustomer.setText("Đăng nhập dành cho Bạn đọc");
        btnLoginForCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginForCustomerActionPerformed(evt);
            }
        });

        btnRegisterAccount.setText("Đăng kí");
        btnRegisterAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterAccountActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng nhập");
        jLabel1.setOpaque(true);

        jLabel2.setText("Tên tài khoản :");

        jLabel3.setText("Mật khẩu :");

        btnLoginForLibrarian.setText("Đăng nhập dành cho Thủ thư");
        btnLoginForLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginForLibrarianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(tfPassword)))
                    .addComponent(btnRegisterAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoginForLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoginForCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLoginForCustomer, btnRegisterAccount});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLoginForLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoginForCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegisterAccount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLoginForCustomer, btnRegisterAccount});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfPassword, tfUserName});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterAccountActionPerformed
        // TODO add your handling code here:
        System.out.println("dang ki");
    }//GEN-LAST:event_btnRegisterAccountActionPerformed

    private void btnLoginForCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginForCustomerActionPerformed
        // TODO add your handling code here:
        String username = tfUserName.getText();
        String password = tfPassword.getText();
        if (username == null || password == null) {
            showNotification("Bạn phải điền đầy đủ thông tin trước khi đăng nhập", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                checkLogin(username, password, BORROWER);
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLoginForCustomerActionPerformed

    private void btnLoginForLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginForLibrarianActionPerformed
        // TODO add your handling code here:
        String username = tfUserName.getText();
        String password = tfPassword.getText();
        if (username == null || password == null) {
            showNotification("Bạn phải điền đầy đủ thông tin trước khi đăng nhập", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                checkLogin(username, password, LIBRARIAN);
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLoginForLibrarianActionPerformed

    private void checkLogin(String username, String password, int typeUser) throws SQLException, ClassNotFoundException {
        boolean isSuccess = AccountController.getInstance().checkLogin(username, password);
        User user;
        if (isSuccess) {
            user = AccountController.getInstance().login(username, typeUser);
            if (user instanceof Librarian && typeUser == LIBRARIAN) {
                showNotification("Đăng nhập thành công", JOptionPane.INFORMATION_MESSAGE);
                MainFormOfLibrarian main = new MainFormOfLibrarian((Librarian) user);
                main.setVisible(true);
                this.dispose();
            } else if (user instanceof Borrower && typeUser == BORROWER) {
                if (((Borrower) user).getStatus() == 0) {
                    showNotification("Hãy đến thư viện để nhận thẻ và mã kích hoạt tài khoản",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    showNotification("Đăng nhập thành công", JOptionPane.INFORMATION_MESSAGE);
                    RegistrationOfBorrowingBookForm form = new RegistrationOfBorrowingBookForm((Borrower) user);
                    form.setVisible(true);
                    this.dispose();
                }
            } else {
                showNotification("Tên tài khoản hoặc mật khẩu chưa chính xác", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            showNotification("Tên tài khoản hoặc mật khẩu chưa chính xác", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void showNotification(String noiDung, int type) {
        JOptionPane.showMessageDialog(null, noiDung, "Thông báo", type);
    }

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
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginForCustomer;
    private javax.swing.JButton btnLoginForLibrarian;
    private javax.swing.JButton btnRegisterAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
