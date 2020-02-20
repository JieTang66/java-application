/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.dior.CSR;

import Business.Customer.Customer;
import Business.Enterprise.BeautyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Order.Item;
import Business.Order.Order;
import Business.Product.Product;
import Business.WorkQueue.MessageSendRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wuxinyang
 */
public class MessageOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MessageOrderJPanel
     */
    

    
      private JPanel userProcessContainer;
    private BeautyEnterprise benterprise;
     private MessageSendRequest wr;
    private Order o; 
    MessageOrderJPanel(JPanel userProcessContainer, Enterprise enterprise, MessageSendRequest wr, Order o) {
        initComponents();
        this.o = o;
        this.wr=(MessageSendRequest)wr;
        this.userProcessContainer= userProcessContainer;
        this.benterprise = (BeautyEnterprise)enterprise;
        orderIdTxt.setText(String.valueOf(o.getOrderId()));
        customerTxt.setText(o.getCustomer().getLname() + " " + o.getCustomer().getFname());
        dateTxt.setText(String.valueOf(o.getDateCreated()));
        statusTxt.setText(o.getStatues());
        totalTxt.setText(String.valueOf(o.getTotalprice()));
        
        
       // int id = o.getOrderId();
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        model.setRowCount(0);
       
            
             //   if(o.getOrderId()==id){
                    for(Item item : o.getOrderItemList()){
                    Object[] row = new Object[6];
                    row[0] = item.getProduct();
                    row[1] = item.getQuatity();
                    row[2] = item.getProduct().getType();
                    row[3] = item.getProduct().getSalesPrice();
                    row[4] = item.getProduct().getPurchasingPrice();
                    row[5] = item.getQuatity() * (item.getProduct().getSalesPrice()-item.getProduct().getPurchasingPrice());
                    model.addRow(row);                      
              //  }
                   
                    
                
            
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
        orderIdTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        customerTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        statusTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Order Id:");

        jLabel2.setText("Customer:");

        jLabel3.setText("Date Create:");

        jLabel4.setText("Status:");

        jLabel5.setText("Total:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setText("Order");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        itemTable.setBackground(new java.awt.Color(255, 255, 204));
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Quantity", "Type", "Sale Price", "Purchasing Price", "TotalRevenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(itemTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(630, 630, 630)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(520, 520, 520)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5))
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(orderIdTxt)
                                .addComponent(customerTxt)
                                .addComponent(dateTxt)
                                .addComponent(statusTxt)
                                .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(383, 383, 383)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(customerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(statusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        Component[] comps = userProcessContainer.getComponents();
        layout.previous(userProcessContainer);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField customerTxt;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTable itemTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField orderIdTxt;
    private javax.swing.JTextField statusTxt;
    private javax.swing.JTextField totalTxt;
    // End of variables declaration//GEN-END:variables
}
