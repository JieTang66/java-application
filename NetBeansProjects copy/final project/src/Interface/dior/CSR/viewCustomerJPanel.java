/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.dior.CSR;

import Business.Customer.Customer;
import Business.Order.Item;
import Business.Order.Order;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wuxinyang
 */
public class viewCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewCustomerJPanel
     */
    
       private JPanel userProcessContainer;
       private UserAccount account;
       private Customer c;
    viewCustomerJPanel(JPanel userProcessContainer, UserAccount account, Customer c) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.c=c;
         
        txtlName.setText(c.getLname());        
        txtfName.setText(c.getFname());
        txtAddress.setText(c.getAddress());
        txtEmail.setText(c.getEmail());
        txtPhonenum.setText(c.getPhoneNum());
        txtBankaccount.setText(c.getBankAccountNum());
        txtBirth.setText(String.valueOf(c.getBirth()));
        genderComboBox.setSelectedItem(String.valueOf(c.getGender()));
        monthComboBox.setSelectedItem(String.valueOf(c.getMonthlyC()));
        txtlName.setEditable(false);
        txtfName.setEditable(false);
        txtAddress.setEditable(false);
        txtEmail.setEditable(false);
        txtPhonenum.setEditable(false);
        txtBankaccount.setEditable(false);
        txtBirth.setEditable(false);
        genderComboBox.setEnabled(false);
        monthComboBox.setEnabled(false);
        ImageIcon icon=new ImageIcon(c.getPath());
        icon.setImage(icon.getImage().getScaledInstance(120,130,Image.SCALE_DEFAULT));
        imageLabel.setIcon(icon);
        populateOrderTable();
    }

   public void populateOrderTable(){
        DefaultTableModel model = (DefaultTableModel) orderTbl.getModel();
        
        model.setRowCount(0);
         
        
       
            for (Order o : c.getOrderDir().getOrderList()){{
//            System.out.println(" enterprise"+benterprise);
//            System.out.println("order"+o);
//            System.out.println("orderlist"+customer.getOrderDir().getOrderList());
            Object[] row = new Object[5];
            row[0] = o;
            row[1] = o.getDateCreated();             
            row[2] = o.getStatues();
            row[3] = o.getTotalprice();
          
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

        txtBankaccount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtfName = new javax.swing.JTextField();
        txtBirth = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtlName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhonenum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox<>();
        imageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTbl = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        orderdetailBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        txtBankaccount.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("View Customer");

        jLabel2.setText("First Name:");

        jLabel3.setText("Address:");

        jLabel7.setText("Date of Brith:");

        txtfName.setEditable(false);
        txtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNameActionPerformed(evt);
            }
        });

        txtBirth.setEditable(false);

        txtAddress.setEditable(false);

        jLabel8.setText("Last Name:");

        jLabel4.setText("Email:");

        txtlName.setEditable(false);
        txtlName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlNameActionPerformed(evt);
            }
        });

        txtEmail.setEditable(false);

        jLabel5.setText("Phone Num:");

        txtPhonenum.setEditable(false);

        jLabel6.setText("Back Account:");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        genderComboBox.setBackground(new java.awt.Color(255, 204, 204));
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "female", "male", "secret" }));

        jLabel14.setText("Gender：");

        jLabel15.setText("Monthly consumption：");

        monthComboBox.setBackground(new java.awt.Color(255, 204, 204));
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500-1000", "1000-2000", "2000-3000", "3000-4000", "4000-5000", ">5000" }));

        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        orderTbl.setBackground(new java.awt.Color(255, 255, 204));
        orderTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OrderId", "DateCreated", "Status", "Total"
            }
        ));
        jScrollPane1.setViewportView(orderTbl);

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
        jScrollPane6.setViewportView(itemTable);

        orderdetailBtn.setBackground(new java.awt.Color(255, 204, 204));
        orderdetailBtn.setText("view  order detail");
        orderdetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderdetailBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane6))
                    .addComponent(orderdetailBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(monthComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel8)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBankaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPhonenum, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtEmail)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtlName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)))
                .addGap(91, 91, 91)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(527, 527, 527))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(624, 624, 624))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(txtlName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel8)
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(txtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPhonenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addComponent(jLabel4))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtBankaccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(orderdetailBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNameActionPerformed

    private void txtlNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void orderdetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderdetailBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow = orderTbl.getSelectedRow();
        if(selectedrow<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Order order = (Order)orderTbl.getValueAt(selectedrow, 0);
        int id = order.getOrderId();
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        model.setRowCount(0);

        
                for(Order o : c.getOrderDir().getOrderList()){
                    if(o.getOrderId()==id){
                        for(Item item : o.getOrderItemList()){
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
            
        

    }//GEN-LAST:event_orderdetailBtnActionPerformed
      
       
        private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        Purchase pc = (Purchase) component;
        pc.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JTable itemTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTable orderTbl;
    private javax.swing.JButton orderdetailBtn;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBankaccount;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhonenum;
    private javax.swing.JTextField txtfName;
    private javax.swing.JTextField txtlName;
    // End of variables declaration//GEN-END:variables
}
