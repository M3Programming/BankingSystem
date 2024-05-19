/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bankingsystem;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.font.TextAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author MJ
 */
public class Deposit extends javax.swing.JFrame {

    /**
     * Creates new form Deposit
     */
    public Deposit() {
        initComponents();
        jdc_date.setDate(new Date());
        double text = Double.parseDouble(txt_deposit.getText());
        String format = String.format("%.2f", text);
        txt_deposit.setText(format);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lbl_createaccount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbl_name1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbl_accountnumber1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lbl_amount = new javax.swing.JLabel();
        cmb_account = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        txt_deposit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jdc_date = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "DEPOSIT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 153, 0))); // NOI18N

        lbl_createaccount.setBackground(new java.awt.Color(204, 204, 204));
        lbl_createaccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_createaccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deposit.png"))); // NOI18N
        lbl_createaccount.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));
        lbl_createaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_createaccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_createaccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_createaccountMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("₱");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Account Name:");

        lbl_name1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Account Number:");

        lbl_accountnumber1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_accountnumber1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Account Balance:");

        lbl_amount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_amount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        cmb_account.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings Account", "Checking Account" }));
        cmb_account.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_accountPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Please Enter Amount to Deposit");

        txt_deposit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_deposit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_deposit.setText("0.00");
        txt_deposit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_depositKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("DEPOSIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("EXIT");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Date:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdc_date, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(254, 254, 254))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(cmb_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl_name1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                        .addComponent(lbl_accountnumber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lbl_createaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_createaccount)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(jdc_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_accountnumber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(cmb_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_deposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_createaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccountMouseClicked

    }//GEN-LAST:event_lbl_createaccountMouseClicked

    private void lbl_createaccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccountMouseEntered

    }//GEN-LAST:event_lbl_createaccountMouseEntered

    private void lbl_createaccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_createaccountMouseExited

    }//GEN-LAST:event_lbl_createaccountMouseExited

    private void cmb_accountPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_accountPopupMenuWillBecomeInvisible
        String account = cmb_account.getSelectedItem().toString();
        int account_number = Integer.parseInt(lbl_accountnumber1.getText());
        String sql = "SELECT * FROM open_account WHERE account_number='" + account_number + "'";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Copy the url of database connection from connection properties
            String url = "jdbc:mysql://localhost:3306/bank?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String sqlusername = "bank";//username of MySQL Connection
            String sqlpassword = "1234";//password of MYSQL Connection
            //Register the Connection
            Connection conn = DriverManager.getConnection(url, sqlusername, sqlpassword);
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                if (cmb_account.getSelectedItem() == "Savings Account") {
                    double amount = rs.getDouble("sa_balance");
                    String a = String.format("%.2f", amount);
                    DecimalFormat decimal = new DecimalFormat("#.00");
                    decimal.setGroupingUsed(true);
                    decimal.setGroupingSize(3);
                     double aa = Double.parseDouble(a);
                    lbl_amount.setText(decimal.format(aa));
                    
                } else {
                    double amount = rs.getDouble("ca_balance");
                    String a = String.format("%.2f", amount);
                    DecimalFormat decimal = new DecimalFormat("#.00");
                    decimal.setGroupingUsed(true);
                    decimal.setGroupingSize(3);
                    double aa = Double.parseDouble(a);
                    lbl_amount.setText(decimal.format(aa));
                }

            }

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cmb_accountPopupMenuWillBecomeInvisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String da = ((JTextField) jdc_date.getDateEditor().getUiComponent()).getText();
        java.sql.Date date = java.sql.Date.valueOf(da);
        int account_number = Integer.parseInt(lbl_accountnumber1.getText());
        double amount = Double.parseDouble(txt_deposit.getText());
        String amount1 = String.format("%.2f", amount);
        double n = Double.parseDouble(amount1);
        String sql = "INSERT INTO bank_transaction (bank_transactiondate,bank_transactionaccountnumber,savings_account_amount,checking_account_amount,bank_transaction) VALUES(?,?,?,?,?)";
        if (cmb_account.getSelectedItem() == "Savings Account") {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Copy the url of database connection from connection properties
                String url = "jdbc:mysql://localhost:3306/bank?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String sqlusername = "bank";//username of MySQL Connection
                String sqlpassword = "1234";//password of MYSQL Connection
                //Register the Connection
                Connection conn = DriverManager.getConnection(url, sqlusername, sqlpassword);
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setDate(1, date);
                pst.setInt(2, account_number);
                pst.setDouble(3, n);
                pst.setDouble(4, 0.00);
                pst.setString(5, "DEPOSIT");
                pst.execute();
                JOptionPane.showMessageDialog(null, "Savings Account Deposit Complete");
                jdc_date.setDate(new Date());
                txt_deposit.setText("0.00");
                try {
                    //update balance of savings account
                    String sql1 = "SELECT * FROM open_account WHERE account_number = '" + account_number + "'";
                    PreparedStatement pst1 = conn.prepareStatement(sql1);
                    ResultSet rs1 = pst1.executeQuery();
                    if (rs1.next()) {
                        double n1 = rs1.getDouble("sa_balance");
                        double sum = n + n1;
                        String num = String.format("%.2f", sum);
                        double sa_amount = Double.parseDouble(num);
                        try {
                            String sqlupdatebalance = "UPDATE open_account SET sa_balance='" + sa_amount + "' WHERE account_number = '" + account_number + "'";
                            PreparedStatement pstupdate = conn.prepareStatement(sqlupdatebalance);
                            pstupdate.execute();
                            cmb_account.setSelectedItem("Savings Acount");

                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                } catch (HeadlessException | NumberFormatException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Copy the url of database connection from connection properties
                String url = "jdbc:mysql://localhost:3306/bank?zeroDateTimeBehavior=CONVERT_TO_NULL";
                String sqlusername = "bank";//username of MySQL Connection
                String sqlpassword = "1234";//password of MYSQL Connection
                //Register the Connection
                Connection conn = DriverManager.getConnection(url, sqlusername, sqlpassword);
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setDate(1, date);
                pst.setInt(2, account_number);
                pst.setDouble(3, 0.00);
                pst.setDouble(4, n);
                pst.setString(5, "DEPOSIT");
                pst.execute();
                JOptionPane.showMessageDialog(null, "Checking Account Deposit Complete");
                jdc_date.setDate(new Date());
                txt_deposit.setText("0.00");
                try {
                    //update balance of savings account
                    String sql1 = "SELECT * FROM open_account WHERE account_number = '" + account_number + "'";
                    PreparedStatement pst1 = conn.prepareStatement(sql1);
                    ResultSet rs1 = pst1.executeQuery();
                    if (rs1.next()) {
                        double n1 = rs1.getDouble("ca_balance");
                        double sum = n + n1;
                        String num = String.format("%.2f", sum);
                        double sa_amount = Double.parseDouble(num);
                        try {
                            String sqlupdatebalance = "UPDATE open_account SET ca_balance='" + sa_amount + "' WHERE account_number = '" + account_number + "'";
                            PreparedStatement pstupdate = conn.prepareStatement(sqlupdatebalance);
                            pstupdate.execute();
                            cmb_account.setSelectedItem("Savings Acount");

                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                } catch (HeadlessException | NumberFormatException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Deposit.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_depositKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_depositKeyTyped

    }//GEN-LAST:event_txt_depositKeyTyped

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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_account;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser jdc_date;
    public static javax.swing.JLabel lbl_accountnumber1;
    private javax.swing.JLabel lbl_amount;
    private javax.swing.JLabel lbl_createaccount;
    public static javax.swing.JLabel lbl_name1;
    private javax.swing.JTextField txt_deposit;
    // End of variables declaration//GEN-END:variables
}
