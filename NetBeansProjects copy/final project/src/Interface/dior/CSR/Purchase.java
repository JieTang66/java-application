/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.dior.CSR;

import Business.Customer.Customer;
import Business.Enterprise.BeautyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.CSROrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Userinterface.SendEmailJFrame;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author too
 */
public class Purchase extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private BeautyEnterprise benterprise;
    private CSROrganization csrOrganization;
    Purchase(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization) {
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account= account;
        this.benterprise = (BeautyEnterprise)enterprise;
        this.csrOrganization = (CSROrganization)organization;
        populateTable(); 
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
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        viewBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sentBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Customer  Info");

        customerTbl.setBackground(new java.awt.Color(255, 255, 204));
        customerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "ID", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTbl);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(255, 204, 204));
        searchBtn.setText("Search ID");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        viewBtn.setBackground(new java.awt.Color(255, 204, 204));
        viewBtn.setText("View Detail");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setText("view all");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        sentBtn.setBackground(new java.awt.Color(255, 204, 204));
        sentBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
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
                .addGap(364, 364, 364)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(410, 410, 410)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addComponent(sentBtn)))
                .addGap(443, 443, 443))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(sentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        backaction();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int row = customerTbl.getSelectedRow();
        if(row<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Customer c = (Customer)customerTbl.getValueAt(row, 0);
        viewCustomerJPanel vpdjp = new viewCustomerJPanel(userProcessContainer,account,c);
        userProcessContainer.add("viewCustomerJPanel", vpdjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_viewBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
         String keyword= txtId.getText();
         refreshProductTable(keyword);  
    
    }//GEN-LAST:event_searchBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:      
        populateTable(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentBtnActionPerformed
        // TODO add your handling code here:
          
        int selectedrow = customerTbl.getSelectedRow();
        if(selectedrow<0) {
            JOptionPane.showMessageDialog(null, "Please select a Customer from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Customer c = (Customer)customerTbl.getValueAt(selectedrow, 0);
        int id = c.getCustomerId();       
        String to ;
        for(Organization org :benterprise.getOrganizationDirectory().getOrganizationList()){
            for(Customer customer :  org.getCustomerDirectory().getCustomerList()){
                if(customer.getCustomerId() == id ){
                to = customer.getEmail();
                SendEmailJFrame e = new SendEmailJFrame(to);
                e.setVisible(true);        
                }
            }
        }
    }//GEN-LAST:event_sentBtnActionPerformed

    public void backaction(){
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        Component[] comps = userProcessContainer.getComponents();
//        for(Component comp:comps){
//            if(comp instanceof CustomerList){
//            CustomerList cl = (CustomerList)comp;
//            cl.populate();
//            }
//        }
        layout.previous(userProcessContainer);
    };
    
      public void refreshProductTable(String keyword){
        DefaultTableModel model = (DefaultTableModel)customerTbl.getModel();
        model.setRowCount(0);
        
        for(Organization org : benterprise.getOrganizationDirectory().getOrganizationList()){
        for(Customer c: org.getCustomerDirectory().getCustomerList())
        {
         if(Integer.toString(c.getCustomerId()).equalsIgnoreCase(keyword)){
             Object row[] = new Object[2];
             row[0] = c;
             row[1] = c.getCustomerId();        
             model.addRow(row);
         } 
        }
       }
      }
       public void populateTable(){     
        DefaultTableModel model = (DefaultTableModel)customerTbl.getModel();
        model.setRowCount(0);
       for(Organization org : benterprise.getOrganizationDirectory().getOrganizationList()){
        for(Customer c : org.getCustomerDirectory().getCustomerList()) {
        //    System.out.println(c);
            Object row[] = new Object[3];
            row[0] = c;
            row[1] = c.getCustomerId();
            row[2] = c.getEmail();
            model.addRow(row);
            }
       }
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customerTbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton sentBtn;
    private javax.swing.JTextField txtId;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}