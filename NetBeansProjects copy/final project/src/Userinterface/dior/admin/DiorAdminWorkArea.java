/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.dior.admin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Userinterface.SendEmailJFrame;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author too
 */
public class DiorAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkArea
     */
    private JPanel userProcessContainer; 
    private Enterprise enterprise;
    private UserAccount account;
    private Organization organization;
    private EcoSystem business;
    
    
    public DiorAdminWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = organization;
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

        btnProductManagement = new javax.swing.JButton();
        btnCreateProduct = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        employee = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sentBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnProductManagement.setBackground(new java.awt.Color(255, 255, 255));
        btnProductManagement.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnProductManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/dior/CSR/可用btn.jpeg"))); // NOI18N
        btnProductManagement.setText("Product Management");
        btnProductManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductManagementActionPerformed(evt);
            }
        });

        btnCreateProduct.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateProduct.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnCreateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/dior/CSR/可用btn.jpeg"))); // NOI18N
        btnCreateProduct.setText("Create Product");
        btnCreateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProductActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/dior/CSR/可用btn.jpeg"))); // NOI18N
        jButton1.setText("Organize Conference");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/dior/CSR/可用btn.jpeg"))); // NOI18N
        jButton2.setText("My Conference");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setText("Welcome to Beauty Admin Workarea");

        employee.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        employee.setText("hi employee");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Userinterface/customer/圣诞label.jpg"))); // NOI18N

        sentBtn.setBackground(new java.awt.Color(255, 255, 255));
        sentBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        sentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/dior/CSR/可用btn.jpeg"))); // NOI18N
        sentBtn.setText("Send Email");
        sentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(employee)))
                .addGap(519, 519, 519))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel5)
                        .addGap(57, 57, 57)
                        .addComponent(employee)))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(193, 193, 193))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductManagementActionPerformed
        // TODO add your handling code here:
        ProductManagement pj = new ProductManagement(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("createproduct",pj);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProductManagementActionPerformed

    private void btnCreateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProductActionPerformed
        // TODO add your handling code here:z
        CreateProduct cp = new CreateProduct(userProcessContainer,account,enterprise,business);
        userProcessContainer.add("createproduct",cp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateProductActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OrganizeConference oc = new OrganizeConference(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("createproduct",oc);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MyConference mc = new MyConference(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("myconference",mc);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentBtnActionPerformed
        // TODO add your handling code here:
        SendEmailJFrame e = new SendEmailJFrame("");
        e.setVisible(true);
    }//GEN-LAST:event_sentBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProduct;
    private javax.swing.JButton btnProductManagement;
    private javax.swing.JLabel employee;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton sentBtn;
    // End of variables declaration//GEN-END:variables
}
