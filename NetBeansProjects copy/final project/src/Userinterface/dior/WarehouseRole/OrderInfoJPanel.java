/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.dior.WarehouseRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Enterprise.BeautyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Order.Item;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Organization.Organization;
import Business.Organization.WarehouseOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderReminderRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author too
 */


public class OrderInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderList
     */
   JPanel userProcessContainer;
   CustomerDirectory customerDir;
   UserAccount account;
   Organization organization;
   EcoSystem business;
   Enterprise enterprise;
   BeautyEnterprise benterprise;
   
    public OrderInfoJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise, CustomerDirectory customerDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customerDir = customerDir;
        this.account = account;
        this.organization = (WarehouseOrganization)organization;
        this.business = business;
        this.benterprise=(BeautyEnterprise)enterprise;
        populateorderInfoTable();
    }

    public void populateorderInfoTable(){
        DefaultTableModel model = (DefaultTableModel) orderInfoTable.getModel();
        
        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){

                if(!((OrderReminderRequest)request).getDeleteStatus().equals("Canceled"))
            {
            Object[] row = new Object[5];
            row[0] = ((OrderReminderRequest)request);
            row[1] = ((OrderReminderRequest)request).getCustomerName();
            row[2] = ((OrderReminderRequest)request).getDateCreated();
            row[3] = ((OrderReminderRequest)request).getStatus();
            row[4] = ((OrderReminderRequest)request).getMessage();
           // row[5] = request.getSender().getEmployee().getName();
           // row[6] = account.getEmployee().getName();
            model.addRow(row);
            }
            
        }
        
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
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderInfoTable = new javax.swing.JTable();
        viewDetail = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Order List");

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

        orderInfoTable.setBackground(new java.awt.Color(255, 255, 204));
        orderInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderId", "Customer", "RequestDate", "Status", "Request"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderInfoTable);
        if (orderInfoTable.getColumnModel().getColumnCount() > 0) {
            orderInfoTable.getColumnModel().getColumn(0).setResizable(false);
            orderInfoTable.getColumnModel().getColumn(1).setResizable(false);
            orderInfoTable.getColumnModel().getColumn(2).setResizable(false);
            orderInfoTable.getColumnModel().getColumn(3).setResizable(false);
            orderInfoTable.getColumnModel().getColumn(4).setResizable(false);
        }

        viewDetail.setBackground(new java.awt.Color(255, 204, 204));
        viewDetail.setText("View Detail");
        viewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailActionPerformed(evt);
            }
        });

        processBtn.setBackground(new java.awt.Color(255, 204, 204));
        processBtn.setText("Process");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(255, 204, 204));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(refreshJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetail)
                    .addComponent(refreshJButton))
                .addGap(36, 36, 36)
                .addComponent(processBtn)
                .addGap(45, 45, 45))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

        itemTable.setBackground(new java.awt.Color(255, 255, 204));
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Quitity", "Sale Price", "Purchasing Price", "TotalRevenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1)
                        .addGap(403, 403, 403))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(403, 403, 403))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderInfoTable.getSelectedRow();
         
        if(selectedRow<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        OrderReminderRequest request = (OrderReminderRequest)orderInfoTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("shipped")) {
            JOptionPane.showMessageDialog(null, "Already Shipped", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }if(request.getStatus().equals("Returned")) {
            JOptionPane.showMessageDialog(null, "Already Returned", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(request.getMessage().equals(" ")) {
            request.setStatus("shipped");
        }else{
        request.setStatus("shipped");
        request.setMessage("Processed");
        }
        
        for(Organization org : benterprise.getOrganizationDirectory().getOrganizationList()){
            for(Customer customer : org.getCustomerDirectory().getCustomerList()){
                for (Order o : customer.getOrderDir().getOrderList()){
                    if(o.getOrderId()==request.getOrderId()){
                    o.setStatues("shipped");
                    }
                }
            }
        }
        
        populateorderInfoTable();
    }//GEN-LAST:event_processBtnActionPerformed

    private void viewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailActionPerformed
        // TODO add your handling code here:
        populateitemTable();  
    }//GEN-LAST:event_viewDetailActionPerformed

     public void populateitemTable(){
        int selectedrow = orderInfoTable.getSelectedRow();
        if(selectedrow<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        OrderReminderRequest request = (OrderReminderRequest)orderInfoTable.getValueAt(selectedrow, 0);
        int Id = request.getOrderId();
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        model.setRowCount(0);
        for(Organization org :benterprise.getOrganizationDirectory().getOrganizationList()){
        for(Customer customer :  org.getCustomerDirectory().getCustomerList()){
            for(Order order : customer.getOrderDir().getOrderList()){
                if(order.getOrderId() == Id){
                    for(Item item : order.getOrderItemList()){
                    Object[] row = new Object[5];
                    row[0] = item.getProduct();
                    row[1] = item.getQuatity();
                    row[2] = item.getProduct().getSalesPrice();
                    row[3] = item.getProduct().getPurchasingPrice();
                    row[4] = item.getQuatity() * (item.getProduct().getSalesPrice()-item.getProduct().getPurchasingPrice());
                    model.addRow(row);
                    } 
                }
            }
        }
        }
    }
     
     
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateorderInfoTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed
    
    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderInfoTable;
    private javax.swing.JButton processBtn;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton viewDetail;
    // End of variables declaration//GEN-END:variables

    
}