package view;
import java.sql.*;
import database.*;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        pastxt = new javax.swing.JPasswordField();
        btndaftar = new javax.swing.JButton();
        btnmasuk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 16, 161, -1));

        usertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertxtActionPerformed(evt);
            }
        });
        jPanel1.add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 124, -1));

        pastxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastxtActionPerformed(evt);
            }
        });
        jPanel1.add(pastxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 124, -1));

        btndaftar.setText("Daftar");
        btndaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarActionPerformed(evt);
            }
        });
        jPanel1.add(btndaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        btnmasuk.setText("Masuk");
        btnmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasukActionPerformed(evt);
            }
        });
        jPanel1.add(btnmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jLabel2.setText("username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 64, -1));

        jLabel3.setText("password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 77, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarActionPerformed
//        this.setVisible(false);
//        new Register().setVisible(true);
    }//GEN-LAST:event_btndaftarActionPerformed

    private void btnmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasukActionPerformed
        try{
            String sql = "SELECT * FROM admin where username ='" + usertxt.getText()+"'AND password ='"+ pastxt.getText()+"'";
            java.sql.Connection coon = (Connection) databases.configDB();
            java.sql.PreparedStatement pst = coon.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            if (rs.next()){
                if (usertxt.getText().equals(rs.getString("username"))
                    && pastxt.getText().equals(rs.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Login berhasil");
                    this.setVisible(false);
                    new Login().setVisible(true);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Login gagal");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnmasukActionPerformed

    private void pastxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pastxtActionPerformed

    private void usertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertxtActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndaftar;
    private javax.swing.JButton btnmasuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pastxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}