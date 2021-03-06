/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.dior.WarehouseRole;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Enterprise.BeautyEnterprise;

import Business.Enterprise.Enterprise;
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
public class WarehouseWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form WarehouseWorkArea
     */
   JPanel userProcessContainer;
   UserAccount account;
   Organization organization;
   EcoSystem business;
   Enterprise enterprise;
   private BeautyEnterprise beauty;

    public WarehouseWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        this.enterprise = enterprise;
        this.beauty = (BeautyEnterprise)enterprise;
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
        replennishmentBtn = new javax.swing.JButton();
        orderInfoBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        sentBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        employee = new javax.swing.JLabel();

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

        replennishmentBtn.setBackground(new java.awt.Color(255, 255, 255));
        replennishmentBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        replennishmentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/dior/CSR/可用btn.jpeg"))); // NOI18N
        replennishmentBtn.setText("Replenishment/Update");
        replennishmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replennishmentBtnActionPerformed(evt);
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
        jButton1.setText("My Conference");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sentBtn.setBackground(new java.awt.Color(255, 255, 255));
        sentBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        sentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/dior/CSR/可用btn.jpeg"))); // NOI18N
        sentBtn.setText("Send Email");
        sentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Userinterface/customer/圣诞label.jpg"))); // NOI18N

        employee.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        employee.setText("HI EMPLOYEE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addComponent(employee)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(replennishmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(analyzeOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(employee)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(orderInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(analyzeOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(replennishmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderInfoBtnActionPerformed
        // TODO add your handling code here:
        CustomerDirectory customerDir =  beauty.getCustomerDir();
        OrderInfoJPanel orderList = new OrderInfoJPanel(userProcessContainer,account,organization,business,enterprise,customerDir);
        userProcessContainer.add("OrderInfo", orderList);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_orderInfoBtnActionPerformed

    private void analyzeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeOrderBtnActionPerformed
        // TODO add your handling code here:
        AnalyzeOrderJPanel analyzeorder = new AnalyzeOrderJPanel(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("OrderInfo", analyzeorder);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_analyzeOrderBtnActionPerformed

    private void replennishmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replennishmentBtnActionPerformed
        // TODO add your handling code here:
        ReplenishStockJPanel replenish = new ReplenishStockJPanel(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("OrderInfo", replenish);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_replennishmentBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MyConference mc = new MyConference(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("myconference",mc);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentBtnActionPerformed
        // TODO add your handling code here:
                SendEmailJFrame e = new SendEmailJFrame("");
                    e.setVisible(true);
    }//GEN-LAST:event_sentBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyzeOrderBtn;
    private javax.swing.JLabel employee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton orderInfoBtn;
    private javax.swing.JButton replennishmentBtn;
    private javax.swing.JButton sentBtn;
    // End of variables declaration//GEN-END:variables
}
