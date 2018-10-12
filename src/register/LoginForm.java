/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame {

 private static final String USERNAMEE= "u572797458_soft";
private static final String PASSWORDD= "password0880";
private static final String CONN_STRING="jdbc:mysql://db144.hostinger.in.th/u572797458_soft";
   
    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Usurnamefield = new javax.swing.JTextField();
        Passwordfield = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Register = new javax.swing.JButton();
        Register1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 860));
        setPreferredSize(new java.awt.Dimension(1028, 982));
        setSize(new java.awt.Dimension(1200, 1200));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(250, 177, 160));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 100, 850);

        jPanel6.setBackground(new java.awt.Color(250, 177, 160));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(930, 0, 100, 850);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 140, 1030, 310);

        jPanel1.setBackground(new java.awt.Color(255, 118, 117));
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Username");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(150, 10, 220, 70);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Password");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(160, 130, 220, 70);

        Usurnamefield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Usurnamefield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Usurnamefield.setOpaque(false);
        Usurnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsurnamefieldActionPerformed(evt);
            }
        });
        jPanel1.add(Usurnamefield);
        Usurnamefield.setBounds(360, 80, 460, 40);

        Passwordfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Passwordfield.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Passwordfield.setOpaque(false);
        Passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordfieldActionPerformed(evt);
            }
        });
        jPanel1.add(Passwordfield);
        Passwordfield.setBounds(360, 190, 460, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register/xo-logo-mark-mono11.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, -120, 750, 290);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 270, 190, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 440, 1030, 360);

        jPanel3.setBackground(new java.awt.Color(108, 92, 231));
        jPanel3.setLayout(null);

        Register.setBackground(new java.awt.Color(255, 63, 52));
        Register.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Register.setText("Clear");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel3.add(Register);
        Register.setBounds(540, 50, 216, 90);

        Register1.setBackground(new java.awt.Color(255, 221, 89));
        Register1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Register1.setText("Register");
        Register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register1ActionPerformed(evt);
            }
        });
        jPanel3.add(Register1);
        Register1.setBounds(310, 50, 216, 90);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 790, 1030, 190);

        jPanel11.setBackground(new java.awt.Color(255, 63, 52));
        jPanel11.setLayout(null);

        jPanel12.setBackground(new java.awt.Color(162, 155, 254));
        jPanel12.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 72)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Login");
        jPanel12.add(jLabel7);
        jLabel7.setBounds(110, 0, 230, 110);

        jPanel11.add(jPanel12);
        jPanel12.setBounds(580, 0, 450, 130);

        jPanel7.setBackground(new java.awt.Color(52, 231, 228));
        jPanel7.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("OX Game");
        jPanel7.add(jLabel1);
        jLabel1.setBounds(100, 10, 240, 80);

        jPanel11.add(jPanel7);
        jPanel7.setBounds(70, 10, 440, 0);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(0, 0, 1060, 130);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsurnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsurnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsurnamefieldActionPerformed

    private void PasswordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordfieldActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
       // LoginForm go = new  LoginForm();
      //  go.setVisible(true);
      //  setVisible(false);
    }//GEN-LAST:event_RegisterActionPerformed

    private void Register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register1ActionPerformed
        //TODO add your handling code here:
      new Register().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_Register1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Passwordfield;
    private javax.swing.JButton Register;
    private javax.swing.JButton Register1;
    private javax.swing.JTextField Usurnamefield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
