/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.supplier.WarehouseRole;

import Userinterface.dior.WarehouseRole.*;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Enterprise.BeautyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Order.OrderDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Userinterface.SendEmailJFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Userinterface.dior.WarehouseRole.OrderInfoJPanel;

/**
 *
 * @author too
 */
public class SupplierWarehouseWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form WarehouseWorkArea
     */
   JPanel userProcessContainer;
   UserAccount account;
   Organization organization;
   EcoSystem business;
   Enterprise enterprise;
   private SupplierEnterprise supplier;

    public SupplierWarehouseWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        this.enterprise = enterprise;
        this.supplier = (SupplierEnterprise)enterprise;
        employee.setText("Hi "+account.getEmployee().getName());
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
        analyzeOrderBtn = new javax.swing.JButton();
        orderInfoBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        employee = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Warehouse Work Area");

        analyzeOrderBtn.setBackground(new java.awt.Color(255, 255, 255));
        analyzeOrderBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        analyzeOrderBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/dior/CSR/可用btn.jpeg"))); // NOI18N
        analyzeOrderBtn.setText("Analyze Order");
        analyzeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeOrderBtnActionPerformed(evt);
            }
        });

        orderInfoBtn.setBackground(new java.awt.Color(255, 255, 255));
        orderInfoBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        orderInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/dior/CSR/可用btn.jpeg"))); // NOI18N
        orderInfoBtn.setText("Order Information");
        orderInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderInfoBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/dior/CSR/可用btn.jpeg"))); // NOI18N
        jButton1.setText("Send Email");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        employee.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        employee.setText("hi employee");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Userinterface/customer/圣诞label.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(employee))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(analyzeOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(556, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(employee)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(analyzeOrderBtn)
                .addGap(36, 36, 36)
                .addComponent(orderInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderInfoBtnActionPerformed
        // TODO add your handling code here:   
        SupplierOrderInfoJPanel sorderList = new SupplierOrderInfoJPanel(userProcessContainer,account,organization,business,enterprise);
        userProcessContainer.add("OrderInfo", sorderList);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_orderInfoBtnActionPerformed

    private void analyzeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeOrderBtnActionPerformed
        // TODO add your handling code here:
        SupplierAnalyzeJPanel supplierAnalyze = new SupplierAnalyzeJPanel(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("OrderInfo", supplierAnalyze);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_analyzeOrderBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SendEmailJFrame email = new SendEmailJFrame("");
        email.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyzeOrderBtn;
    private javax.swing.JLabel employee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton orderInfoBtn;
    // End of variables declaration//GEN-END:variables
}