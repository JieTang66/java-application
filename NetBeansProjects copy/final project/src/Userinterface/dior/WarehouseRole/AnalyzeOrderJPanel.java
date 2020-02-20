/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.dior.WarehouseRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.BeautyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Order.Item;
import Business.Order.Order;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Userinterface.SendEmailJFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author too
 */
public class AnalyzeOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalyzeOrder
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    EcoSystem business;
    Enterprise enterprise;
    private BeautyEnterprise beauty;
    
    
    public AnalyzeOrderJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        this.enterprise = enterprise;
        this.beauty = (BeautyEnterprise)enterprise;
        populateorderComboBox();
        populateproductComboBox();
        populatecustomerOrderTable();
        populateproductTable();
    }

    public void populateorderComboBox(){
        orderComboBox.removeAllItems();
        orderComboBox.addItem("OrderNum");
        orderComboBox.addItem("TotalConsumption");
    }
    
    public void populateproductComboBox(){
        productComboBox.removeAllItems();
        productComboBox.addItem("Quantity");
        productComboBox.addItem("TotalRevenue");
    }
    
   public void populatecustomerOrderTable(){
        
        DefaultTableModel model = (DefaultTableModel)customerOrderTable.getModel();
        model.setRowCount(0);
        for(Organization org : beauty.getOrganizationDirectory().getOrganizationList()){
        for(Customer customer : org.getCustomerDirectory().getCustomerList()){
            int countorder =0;
            double totalconsumption = 0;
            Object[] row = new Object[4];
            row[0] = customer.getCustomerId();
            row[1] = customer;
            
            for(Order order : customer.getOrderDir().getOrderList()){
                countorder++;
                
                for(Item item : order.getOrderItemList()){
                    totalconsumption += item.getProduct().getSalesPrice()*item.getQuatity();
                }
            }
            row[2]=countorder;
            row[3]=totalconsumption;
            model.addRow(row);
        }
        }
    }

   public void populateproductTable(){
        
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0);
//        int soldQuantity = 0;
        for(Product product : beauty.getProductDir().getProductList()){
            int soldQuantity = 0;
            Object[] row = new Object[5];
            row[0]=product.getProductName();
            for(Organization org : beauty.getOrganizationDirectory().getOrganizationList()){
            for(Customer customer : org.getCustomerDirectory().getCustomerList()){
                for(Order order : customer.getOrderDir().getOrderList()){
                    for(Item item : order.getOrderItemList()){
                        if(item.getProduct().getProductId() == product.getProductId()){
                        soldQuantity += item.getQuatity();
                        }     
                    }                    
                }
            }    
            }
            row[1]=soldQuantity;
            row[2]=product.getSalesPrice();
            row[3]=product.getPurchasingPrice();
            row[4]=soldQuantity*(product.getSalesPrice()-product.getPurchasingPrice());
            model.addRow(row);
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

        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerOrderTable = new javax.swing.JTable();
        orderComboBox = new javax.swing.JComboBox<>();
        analyseOrderBtn = new javax.swing.JButton();
        sentBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        productComboBox = new javax.swing.JComboBox<>();
        analyseProductBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(255, 255, 204));

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order Analyses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

        customerOrderTable.setBackground(new java.awt.Color(255, 255, 204));
        customerOrderTable.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        customerOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CustomerID", "CustomerName", "TotalOrder", "TotalComsuption"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(customerOrderTable);
        if (customerOrderTable.getColumnModel().getColumnCount() > 0) {
            customerOrderTable.getColumnModel().getColumn(1).setResizable(false);
            customerOrderTable.getColumnModel().getColumn(2).setResizable(false);
            customerOrderTable.getColumnModel().getColumn(3).setResizable(false);
        }

        orderComboBox.setBackground(new java.awt.Color(255, 204, 204));
        orderComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        orderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderComboBoxActionPerformed(evt);
            }
        });

        analyseOrderBtn.setBackground(new java.awt.Color(255, 204, 204));
        analyseOrderBtn.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        analyseOrderBtn.setText("AnalyseOrder");
        analyseOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyseOrderBtnActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(orderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(sentBtn))
                            .addComponent(analyseOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(analyseOrderBtn)
                    .addComponent(orderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sentBtn)
                .addGap(12, 12, 12))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Analyze");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Analyses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

        productTable.setBackground(new java.awt.Color(255, 255, 204));
        productTable.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "SoldQuantity", "Sale Price", "Purchasing Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setResizable(false);
            productTable.getColumnModel().getColumn(1).setResizable(false);
            productTable.getColumnModel().getColumn(2).setResizable(false);
            productTable.getColumnModel().getColumn(3).setResizable(false);
            productTable.getColumnModel().getColumn(4).setResizable(false);
        }

        productComboBox.setBackground(new java.awt.Color(255, 204, 204));
        productComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        productComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        productComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productComboBoxActionPerformed(evt);
            }
        });

        analyseProductBtn.setBackground(new java.awt.Color(255, 204, 204));
        analyseProductBtn.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        analyseProductBtn.setText("AnalyseProduct");
        analyseProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyseProductBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 104, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(analyseProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(analyseProductBtn))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(497, 497, 497))
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void analyseOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyseOrderBtnActionPerformed

        if(orderComboBox.getSelectedItem() == "OrderNum"){
            populatecustomerOrderNumTable();    
        }
        if(orderComboBox.getSelectedItem() == "TotalConsumption"){
            populatecustomerConsumptionTable();
        }
        
    }//GEN-LAST:event_analyseOrderBtnActionPerformed

    private void orderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderComboBoxActionPerformed

    private void productComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productComboBoxActionPerformed

    private void analyseProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyseProductBtnActionPerformed
        // TODO add your handling code here:
 
        if(productComboBox.getSelectedItem() == "Quantity"){
            populateproductQuantityTable();    
        }
        if(productComboBox.getSelectedItem() == "TotalRevenue"){
            populateproductRevenueTable();
        }
    }//GEN-LAST:event_analyseProductBtnActionPerformed

    private void sentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedrow = customerOrderTable.getSelectedRow();
        if(selectedrow<0) {
            JOptionPane.showMessageDialog(null, "Please select a Customer from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Customer c = (Customer)customerOrderTable.getValueAt(selectedrow, 1);
        int id = c.getCustomerId();       
        String to ;
        for(Organization org :beauty.getOrganizationDirectory().getOrganizationList()){
            for(Customer customer :  org.getCustomerDirectory().getCustomerList()){
                if(customer.getCustomerId() == id ){
                to = customer.getEmail();
                SendEmailJFrame e = new SendEmailJFrame(to);
                e.setVisible(true);        
                }
            }
        }
    }//GEN-LAST:event_sentBtnActionPerformed
    
    
    public void populatecustomerConsumptionTable(){
        List<Customer> customers = new ArrayList();
        for(Organization org : beauty.getOrganizationDirectory().getOrganizationList()){
        for(Customer customer : org.getCustomerDirectory().getCustomerList()){
            customers.add(customer);
        }
        }
        
        Collections.sort(customers, new Comparator<Customer>(){
        @Override
        public int compare(Customer c1, Customer c2){
            int countorder1 = 0;
            int totalconsumption1=0;
            int countorder2 = 0;
            int totalconsumption2=0;
            for(Order order : c1.getOrderDir().getOrderList()){
                countorder1++;
                for(Item item : order.getOrderItemList()){
                    totalconsumption1 += item.getProduct().getSalesPrice()*item.getQuatity();
                }
            }
            for(Order order : c2.getOrderDir().getOrderList()){
                countorder2++;
                for(Item item : order.getOrderItemList()){
                    totalconsumption2 += item.getProduct().getSalesPrice()*item.getQuatity();
                }
            } 
            if(totalconsumption1==totalconsumption2){
                if(countorder1 == countorder2){
                return 0;
                }
                return countorder1 > countorder2 ? -1:1;
            }
            return totalconsumption1 > totalconsumption2 ? -1: 1;
            }
        });
        
        DefaultTableModel model = (DefaultTableModel)customerOrderTable.getModel();
        model.setRowCount(0);           
        for(int i = 0; i< customers.size(); i++ ){
            Customer c = customers.get(i);
            int countorder =0;
            double totalconsumption = 0;
            Object[] row = new Object[4];
            row[0] = c.getCustomerId();
            row[1] = c;
            
            for(Order order : c.getOrderDir().getOrderList()){
                countorder++;
                
                for(Item item : order.getOrderItemList()){
                    totalconsumption += item.getProduct().getSalesPrice()*item.getQuatity();
                }
            }
            row[2]=countorder;
            row[3]=totalconsumption;
            model.addRow(row);
        }
        
        DefaultPieDataset pirDataset = new DefaultPieDataset();
        for(int i = 0; i< customers.size(); i++ ){
            Customer c = customers.get(i);
            int countorder =0;
            double totalconsumption = 0;
            for(Order order : c.getOrderDir().getOrderList()){
                countorder++;
                for(Item item : order.getOrderItemList()){
                    totalconsumption += item.getProduct().getSalesPrice()*item.getQuatity();
                }
            }
            pirDataset.setValue(c.getFname()+""+c.getLname(),totalconsumption);
              
        }
        
        
      JFreeChart chart = ChartFactory.createPieChart("Customer with Consumption", pirDataset,true,true,true);
      //  JFreeChart chart = ChartFactory.createBarChart("Customer Of order", "Customer", "Orders of Customer", pirDataset, PlotOrientation.VERTICAL, false, true, false);
        PiePlot p = (PiePlot)chart.getPlot();
      //  p.setForegroundAlpha(TOP_ALIGNMENT);
        

        ChartFrame frame = new ChartFrame("Customer with Consumption Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(450,500);
        
        
    }
    
    public void populatecustomerOrderNumTable(){
        List<Customer> customers = new ArrayList();
        for(Organization org : beauty.getOrganizationDirectory().getOrganizationList()){
        for(Customer customer : org.getCustomerDirectory().getCustomerList()){
        customers.add(customer);
        }
        }
        Collections.sort(customers, new Comparator<Customer>(){
        @Override
        public int compare(Customer c1, Customer c2){
            int countorder1 = 0;
            int totalconsumption1=0;
            int countorder2 = 0;
            int totalconsumption2=0;
            for(Order order : c1.getOrderDir().getOrderList()){
                countorder1++;
                for(Item item : order.getOrderItemList()){
                    totalconsumption1 += item.getProduct().getSalesPrice()*item.getQuatity();
                }
            }
            for(Order order : c2.getOrderDir().getOrderList()){
                countorder2++;
                for(Item item : order.getOrderItemList()){
                    totalconsumption2 += item.getProduct().getSalesPrice()*item.getQuatity();
                }
            } 
            if(countorder1 == countorder2){
                if(totalconsumption1==totalconsumption2){
                return 0;
                }
                return totalconsumption1>totalconsumption2 ? -1:1;
            }
            return countorder1 > countorder2 ? -1: 1;
            }
        });
        
        DefaultTableModel model = (DefaultTableModel)customerOrderTable.getModel();
        model.setRowCount(0);           
        for(int i = 0; i< customers.size(); i++ ){
            Customer c = customers.get(i);
            int countorder =0;
            double totalconsumption = 0;
            Object[] row = new Object[4];
            row[0] = c.getCustomerId();
            row[1] = c;
            for(Order order : c.getOrderDir().getOrderList()){
                countorder++;
                
                for(Item item : order.getOrderItemList()){
                    totalconsumption += item.getProduct().getSalesPrice()*item.getQuatity();
                }
            }
            row[2]=countorder;
            row[3]=totalconsumption;
            model.addRow(row);
        }
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 0; i< customers.size(); i++ ){
            Customer c = customers.get(i);
            int countorder =0;
            double totalconsumption = 0;
            for(Order order : c.getOrderDir().getOrderList()){
                countorder++;
                for(Item item : order.getOrderItemList()){
                    totalconsumption += item.getProduct().getSalesPrice()*item.getQuatity();
                }
            }
            dataset.setValue(countorder, "countorder", c.getFname()+""+c.getLname());
              
        }
        
        
//      JFreeChart chart = ChartFactory.createBarChart("title of chartbar", "X-axis title", "Y-axis title", dataset);
        JFreeChart chart = ChartFactory.createBarChart("Customer Of order", "Customer", "Orders of Customer", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar Chart for Customer", chart);
        frame.setVisible(true);
        frame.setSize(450,350);
        
    }
    
    public void populateproductQuantityTable(){
        List<Product> products = new ArrayList();
        for(Product product : beauty.getProductDir().getProductList()){
            products.add(product);
        }
        Collections.sort(products, new Comparator<Product>(){
        @Override
        public int compare(Product p1, Product p2){
            int soldQuantity1 = 0;
            int soldQuantity2 = 0;
            int totalRevenue1 = 0;
            int totalRevenue2 = 0;
        for(Organization org : beauty.getOrganizationDirectory().getOrganizationList()){
            for(Customer customer : org.getCustomerDirectory().getCustomerList()){
                for(Order order : customer.getOrderDir().getOrderList()){
                    for(Item item : order.getOrderItemList()){
                        if(item.getProduct().getProductId() == p1.getProductId()){
                        soldQuantity1 += item.getQuatity();
                        }
                        if(item.getProduct().getProductId() == p2.getProductId()){
                        soldQuantity2 += item.getQuatity();
                        }
                    }                    
                }
            }
        }
            totalRevenue1 += soldQuantity1*(p1.getSalesPrice()-p1.getPurchasingPrice());
            totalRevenue2 += soldQuantity2*(p2.getSalesPrice()-p2.getPurchasingPrice());
              
            
            
            if(soldQuantity1 == soldQuantity2){
                if(totalRevenue1==totalRevenue2){
                return 0;
                }
                return totalRevenue1>totalRevenue2 ? -1:1;
            }
            return soldQuantity1 > soldQuantity2 ? -1: 1;
        }
        });
        
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0);           
        
        
        for(int i = 0; i< products.size(); i++ ){
            int soldQuantity = 0;
            Product product = products.get(i); 
            Object[] row = new Object[5];
            row[0]=product.getProductName();
        for(Organization org : beauty.getOrganizationDirectory().getOrganizationList()){
            for(Customer customer : org.getCustomerDirectory().getCustomerList()){
                for(Order order : customer.getOrderDir().getOrderList()){
                    for(Item item : order.getOrderItemList()){
                        if(item.getProduct().getProductId() == product.getProductId()){
                        soldQuantity += item.getQuatity();
                        }     
                    }                    
                }
            }
        }
            row[1]=soldQuantity;
            row[2]=product.getSalesPrice();
            row[3]=product.getPurchasingPrice();
            row[4]=soldQuantity*(product.getSalesPrice()-product.getPurchasingPrice());
            model.addRow(row);
        }
        
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for(int i = 0; i< products.size(); i++ ){
            int soldQuantity = 0;
            Product product = products.get(i); 

            for(Organization org : beauty.getOrganizationDirectory().getOrganizationList()){
            for(Customer customer : org.getCustomerDirectory().getCustomerList()){
                for(Order order : customer.getOrderDir().getOrderList()){
                    for(Item item : order.getOrderItemList()){
                        if(item.getProduct().getProductId() == product.getProductId()){
                        soldQuantity += item.getQuatity();
                        }     
                    }                    
                }
            }
            }
            dataset.setValue(soldQuantity, "soldquantity", Integer.toString(product.getProductId()));
              
        }
        
        
//      JFreeChart chart = ChartFactory.createBarChart("title of chartbar", "X-axis title", "Y-axis title", dataset);
        JFreeChart chart = ChartFactory.createBarChart("SoldQuantity of Product", "Product", "Sold Quantity", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar Chart for Product", chart);
        frame.setVisible(true);
        frame.setSize(450,350);
        
        
        
        
    }
    
    public void populateproductRevenueTable(){
        List<Product> products = new ArrayList();
        for(Product product : beauty.getProductDir().getProductList()){
            products.add(product);
        }
        Collections.sort(products, new Comparator<Product>(){
        @Override
        public int compare(Product p1, Product p2){
            int soldQuantity1 = 0;
            int soldQuantity2 = 0;
            int totalRevenue1 = 0;
            int totalRevenue2 = 0;
            
            for(Organization org : beauty.getOrganizationDirectory().getOrganizationList()){
            for(Customer customer : org.getCustomerDirectory().getCustomerList()){
                for(Order order : customer.getOrderDir().getOrderList()){
                    for(Item item : order.getOrderItemList()){
                        if(item.getProduct().getProductId() == p1.getProductId()){
                        soldQuantity1 += item.getQuatity();
                        }
                        if(item.getProduct().getProductId() == p2.getProductId()){
                        soldQuantity2 += item.getQuatity();
                        }
                    }                    
                }
            }
            }
            totalRevenue1 += soldQuantity1*(p1.getSalesPrice()-p1.getPurchasingPrice());
            totalRevenue2 += soldQuantity2*(p2.getSalesPrice()-p2.getPurchasingPrice());
              
            
            
            if(totalRevenue1 == totalRevenue2){
                if(soldQuantity1==soldQuantity2){
                return 0;
                }
                return soldQuantity1>soldQuantity2 ? -1:1;
            }
            return totalRevenue1 > totalRevenue2 ? -1: 1;
        }
        });
        
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0);           
        
        for(int i = 0; i< products.size(); i++ ){
            int soldQuantity = 0;
            Product product = products.get(i);  
            Object[] row = new Object[5];
            row[0]=product.getProductName();
            for(Organization org : beauty.getOrganizationDirectory().getOrganizationList()){
            for(Customer customer : org.getCustomerDirectory().getCustomerList()){
                for(Order order : customer.getOrderDir().getOrderList()){
                    for(Item item : order.getOrderItemList()){
                        if(item.getProduct().getProductId() == product.getProductId()){
                        soldQuantity += item.getQuatity();
                        }     
                    }                    
                }
            }
            }
                row[1]=soldQuantity;
                row[2]=product.getSalesPrice();
                row[3]=product.getPurchasingPrice();
                row[4]=soldQuantity*(product.getSalesPrice()-product.getPurchasingPrice());
                model.addRow(row);
            
        }
        
        
        DefaultPieDataset pirDataset = new DefaultPieDataset();
       for(int i = 0; i< products.size(); i++ ){
            int soldQuantity = 0;
            Product product = products.get(i);  
            for(Organization org : beauty.getOrganizationDirectory().getOrganizationList()){
            for(Customer customer : org.getCustomerDirectory().getCustomerList()){
                for(Order order : customer.getOrderDir().getOrderList()){
                    for(Item item : order.getOrderItemList()){
                        if(item.getProduct().getProductId() == product.getProductId()){
                        soldQuantity += item.getQuatity();
                        }     
                    }                    
                }
            }
            }
            
            pirDataset.setValue(product.getProductName(),soldQuantity*(product.getSalesPrice()-product.getPurchasingPrice()));
              
        }
        
      JFreeChart chart = ChartFactory.createPieChart("Product with Revenue", pirDataset,true,true,true);
      //  JFreeChart chart = ChartFactory.createBarChart("Customer Of order", "Customer", "Orders of Customer", pirDataset, PlotOrientation.VERTICAL, false, true, false);
        PiePlot p = (PiePlot)chart.getPlot();
       // p.setForegroundAlpha(TOP_ALIGNMENT);
        
        
        
       // p.setRangeGridlinePaint(Color.black);
        
        ChartFrame frame = new ChartFrame("Product with Revenue Pie Chart", chart);
        p.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}:{2}({1})", NumberFormat.getNumberInstance(), new DecimalFormat("0.0%")));
        frame.setVisible(true);
        frame.setSize(450,500);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyseOrderBtn;
    private javax.swing.JButton analyseProductBtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable customerOrderTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> orderComboBox;
    private javax.swing.JComboBox<String> productComboBox;
    private javax.swing.JTable productTable;
    private javax.swing.JButton sentBtn;
    // End of variables declaration//GEN-END:variables
}
