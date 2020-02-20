/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.supplier.WarehouseRole;

import Userinterface.dior.WarehouseRole.*;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.BeautyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Order.Item;
import Business.Order.Order;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProductRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
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
public class SupplierAnalyzeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalyzeOrder
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    EcoSystem business;
    Enterprise enterprise;
    private SupplierEnterprise supplier;
    Network network;
    
    public SupplierAnalyzeJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        this.enterprise = enterprise;
        this.supplier = (SupplierEnterprise)enterprise;
        network = searchNetwork();
        populateenterpriseComboBox();
        populateproductComboBox();
        populateenterpriseTable();
        populateproductTable();
    }

    public Network searchNetwork(){
            for(Network network: business.getNetworkList()){
                if(network.getEnterpriseDirectory().getEnterpriseList().contains(supplier))
                    return network;
        }
            return null;
        }
    
    public void populateenterpriseComboBox(){
        enterpriseComboBox.removeAllItems();
        enterpriseComboBox.addItem("OrderNum");
        enterpriseComboBox.addItem("TotalConsumption");
    }
    
    public void populateproductComboBox(){
        productComboBox.removeAllItems();
        productComboBox.addItem("Quantity");
        productComboBox.addItem("TotalRevenue");
    }
    
   public void populateenterpriseTable(){
        
        DefaultTableModel model = (DefaultTableModel)enterpriseTable.getModel();
        model.setRowCount(0);
        
        
        for(Enterprise b : network.getEnterpriseDirectory().getEnterpriseList()){
            if(b instanceof BeautyEnterprise){
                int order =0;
                int totalConsumption = 0;
                Object[] row = new Object[5];
                row[0]=b;
                for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){                  
                    if(request instanceof ProductRequest){
                        double price = 0;
                        if(((BeautyEnterprise)b).getName().equals(((ProductRequest)request).getBeautyenterprisename())){                      
                        for(Product product : supplier.getProductDir().getProductList()){
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            price=product.getSalesPrice();                          
                            
                            order++;
                            totalConsumption +=((ProductRequest)request).getQuality()*price;
                            }
                        }
                        }
                    }
                }
                row[1]=order;
                row[2]=totalConsumption;
                model.addRow(row);
            }
        }   
    }

   public void populateproductTable(){
       
       DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0);
        for(Product product : supplier.getProductDir().getProductList()){
             Object[] row = new Object[5];
             int soldQuantity = 0;
             int totalRevenue = 0;
                for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
                    if(request instanceof ProductRequest){                     
                        if(product.getProductName().equals(((ProductRequest)request).getName())){
                            soldQuantity +=((ProductRequest)request).getQuality();
                        }                 
                    }
                }

        row[0]=product;
        row[1]=soldQuantity;
        row[2]=product.getSalesPrice();
        row[3]=product.getAvailNum();
        row[4]=product.getSalesPrice()*soldQuantity;
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
        enterpriseTable = new javax.swing.JTable();
        enterpriseComboBox = new javax.swing.JComboBox<>();
        analyseOrderBtn = new javax.swing.JButton();
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enterprise Analyses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

        enterpriseTable.setBackground(new java.awt.Color(255, 255, 204));
        enterpriseTable.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        enterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise", "TotalOrder", "TotalComsuption"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(enterpriseTable);
        if (enterpriseTable.getColumnModel().getColumnCount() > 0) {
            enterpriseTable.getColumnModel().getColumn(0).setResizable(false);
            enterpriseTable.getColumnModel().getColumn(1).setResizable(false);
            enterpriseTable.getColumnModel().getColumn(2).setResizable(false);
        }

        enterpriseComboBox.setBackground(new java.awt.Color(255, 204, 204));
        enterpriseComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        enterpriseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseComboBoxActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(enterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(analyseOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(analyseOrderBtn))
                .addContainerGap(31, Short.MAX_VALUE))
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
                "Name", "SoldQuantity", "Sale Price", "AvailNum", "TotalRevenue"
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
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(analyseProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(analyseProductBtn))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(497, 497, 497))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(253, 253, 253))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap(46, Short.MAX_VALUE))
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
 
        if(enterpriseComboBox.getSelectedItem() == "OrderNum"){
            populatecustomerOrderNumTable();    
        }
        if(enterpriseComboBox.getSelectedItem() == "TotalConsumption"){
            populatecustomerConsumptionTable();
        }
        
    }//GEN-LAST:event_analyseOrderBtnActionPerformed

    private void enterpriseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseComboBoxActionPerformed

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
    
    
    public void populatecustomerConsumptionTable(){
        List<BeautyEnterprise>bs = new ArrayList();
        for(Enterprise b : network.getEnterpriseDirectory().getEnterpriseList()){
            if(b instanceof BeautyEnterprise){
                bs.add((BeautyEnterprise)b);
            }
        }

        Collections.sort(bs, new Comparator<BeautyEnterprise>(){
        @Override
        public int compare(BeautyEnterprise b1, BeautyEnterprise b2){
            int countorder1 =0;
            int totalconsumption1 = 0;
            int countorder2 =0;
            int totalconsumption2 =0;
            for(Enterprise b : network.getEnterpriseDirectory().getEnterpriseList()){
            if(b instanceof BeautyEnterprise){
                for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){                  
                    if(request instanceof ProductRequest){
                        double price = 0;
                        if(b1.getName().equals(((ProductRequest)request).getBeautyenterprisename())){                      
                        for(Product product : supplier.getProductDir().getProductList()){
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            price=product.getSalesPrice();                              
                            countorder1++;
                            totalconsumption1 +=((ProductRequest)request).getQuality()*price;
                            }
                        }
                        }
                        if(b2.getName().equals(((ProductRequest)request).getBeautyenterprisename())){                      
                        for(Product product : supplier.getProductDir().getProductList()){
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            price=product.getSalesPrice();                                                    
                            countorder2++;
                            totalconsumption2 +=((ProductRequest)request).getQuality()*price;
                            }
                        }
                        }
                    }
                }

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
        DefaultTableModel model = (DefaultTableModel)enterpriseTable.getModel();
        model.setRowCount(0);           
        for(int i = 0; i< bs.size(); i++ ){
            BeautyEnterprise ba = bs.get(i);
            int countorder =0;
            double totalconsumption = 0;
            Object[] row = new Object[3];
            row[0] = ba;
            for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
                    if(request instanceof ProductRequest){
                        if(ba.getName().equals(((ProductRequest)request).getBeautyenterprisename())){
                        for(Product product : supplier.getProductDir().getProductList()){         
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            countorder++;
                          //  System.out.println(countorder);
                            totalconsumption +=((ProductRequest)request).getQuality()*product.getSalesPrice();    
                        }
                    }
                }
            }
            }
            row[1]=countorder;
            row[2]=totalconsumption;
            model.addRow(row);
        
        }
        
        
        DefaultPieDataset pirDataset = new DefaultPieDataset();
        for(int i = 0; i< bs.size(); i++ ){
            BeautyEnterprise b = bs.get(i);

            int countorder =0;
            double totalconsumption = 0;
            for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
                    if(request instanceof ProductRequest){
                        if(b.getName().equals(((ProductRequest)request).getBeautyenterprisename())){
                        for(Product product : supplier.getProductDir().getProductList()){         
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            countorder++;
                          //  System.out.println(countorder);
                            totalconsumption +=((ProductRequest)request).getQuality()*product.getSalesPrice();    
                        }
                    }
                }
            }
            }
            pirDataset.setValue(b.getName(),totalconsumption);
              
        }
        
        
      JFreeChart chart = ChartFactory.createPieChart("Enterprise with Consumption", pirDataset,true,true,true);
      //  JFreeChart chart = ChartFactory.createBarChart("Customer Of order", "Customer", "Orders of Customer", pirDataset, PlotOrientation.VERTICAL, false, true, false);
        PiePlot p = (PiePlot)chart.getPlot();
      //  p.setForegroundAlpha(TOP_ALIGNMENT);
        

        ChartFrame frame = new ChartFrame("Enterprise with Consumption Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(450,500);    
        
    }
    
    public void populatecustomerOrderNumTable(){
        List<BeautyEnterprise>bs = new ArrayList();
        for(Enterprise b : network.getEnterpriseDirectory().getEnterpriseList()){
            if(b instanceof BeautyEnterprise){
                bs.add((BeautyEnterprise)b);
            }
        }
        Collections.sort(bs, new Comparator<BeautyEnterprise>(){
        @Override
        public int compare(BeautyEnterprise b1, BeautyEnterprise b2){
            int countorder1 =0;
            int totalconsumption1 = 0;
            int countorder2 =0;
            int totalconsumption2 =0;
            
            for(Enterprise b : network.getEnterpriseDirectory().getEnterpriseList()){
            if(b instanceof BeautyEnterprise){
                for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){                  
                    if(request instanceof ProductRequest){
                        double price = 0;
                        if(b1.getName().equals(((ProductRequest)request).getBeautyenterprisename())){                      
                        for(Product product : supplier.getProductDir().getProductList()){
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            price=product.getSalesPrice();                              
                            countorder1++;
                            totalconsumption1 +=((ProductRequest)request).getQuality()*price;
                            }
                        }
                        }
                        if(b2.getName().equals(((ProductRequest)request).getBeautyenterprisename())){                      
                        for(Product product : supplier.getProductDir().getProductList()){
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            price=product.getSalesPrice();                                                    
                            countorder2++;
                            totalconsumption2 +=((ProductRequest)request).getQuality()*price;
                            }
                        }
                        }
                    }
                }

            }
        } 
                
//            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
//            if(enterprise instanceof SupplierEnterprise ){  
//                for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
//                    if(request instanceof ProductRequest){
//                        if(((BeautyEnterprise)b1).getName().equals(((ProductRequest)request).getBeautyenterprisename())){
//                        for(Product product : supplier.getProductDir().getProductList()){       
//                                if(product.getProductName().equals(((ProductRequest)request).getName())){
//                                countorder1++;
//                                totalconsumption1 +=((ProductRequest)request).getQuality()*product.getSalesPrice();    
//                                }
//                            }
//                        }
//                        if(((BeautyEnterprise)b2).getName()==((ProductRequest)request).getBeautyenterprisename()){
//                                for(Product product : supplier.getProductDir().getProductList()){
//                                if(product.getProductName().equals(((ProductRequest)request).getName())){
//                                countorder2++;
//                                totalconsumption2 +=((ProductRequest)request).getQuality()*product.getSalesPrice();    
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }  
        if(countorder1 == countorder2){
                if(totalconsumption1==totalconsumption2){
                return 0;
                }
                return totalconsumption1>totalconsumption2 ? -1:1;
            }
            return countorder1 > countorder2 ? -1: 1;
        }
        });
     
        
        DefaultTableModel model = (DefaultTableModel)enterpriseTable.getModel();
        model.setRowCount(0);           
        for(int i = 0; i< bs.size(); i++ ){
            BeautyEnterprise ba = bs.get(i);
            int countorder =0;
            double totalconsumption = 0;
            Object[] row = new Object[3];
            row[0] = ba;
            for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
                    if(request instanceof ProductRequest){
                        if(ba.getName().equals(((ProductRequest)request).getBeautyenterprisename())){
                        for(Product product : supplier.getProductDir().getProductList()){         
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            countorder++;
                          //  System.out.println(countorder);
                            totalconsumption +=((ProductRequest)request).getQuality()*product.getSalesPrice();    
                        }
                    }
                }
            }
            }
            row[1]=countorder;
            row[2]=totalconsumption;
            model.addRow(row);
        
        }
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 0; i< bs.size(); i++ ){
            BeautyEnterprise b = bs.get(i);
            int countorder =0;
            double totalconsumption = 0;
            for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
                    if(request instanceof ProductRequest){
                        if(b.getName().equals(((ProductRequest)request).getBeautyenterprisename())){
                        for(Product product : supplier.getProductDir().getProductList()){         
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            countorder++;
                          //  System.out.println(countorder);
                            totalconsumption +=((ProductRequest)request).getQuality()*product.getSalesPrice();    
                        }
                    }
                }
            }
            }
            dataset.setValue(countorder, "countorder", b.getName());
              
        }
        

        JFreeChart chart = ChartFactory.createBarChart("Enterprise Of order", "Enterprise", "Orders of Enterprise", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar Chart for Enterprise", chart);
        frame.setVisible(true);
        frame.setSize(450,350);
        
    }
    
    public void populateproductQuantityTable(){

        List<Product> products = new ArrayList();
        for(Product product : supplier.getProductDir().getProductList()){
            products.add(product);
        }
        Collections.sort(products, new Comparator<Product>(){
        @Override
        public int compare(Product p1, Product p2){
            int soldQuantity1 = 0;
            int soldQuantity2 = 0;
            int totalRevenue1 = 0;
            int totalRevenue2 = 0;

                for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
                    if(request instanceof ProductRequest ){                     
                        if(p1.getProductName().equals(((ProductRequest)request).getName())){
                            soldQuantity1 +=((ProductRequest)request).getQuality();
                        }
                        if(p2.getProductName().equals(((ProductRequest)request).getName())){
                            soldQuantity2 +=((ProductRequest)request).getQuality();
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
                    for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
                        if(request instanceof ProductRequest){                     
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            soldQuantity +=((ProductRequest)request).getQuality();
                            }
                        }
                    }

            row[0]=product;
            row[1]=soldQuantity;
            row[2]=product.getSalesPrice();
            row[3]=product.getAvailNum();
            row[4]=product.getSalesPrice()*soldQuantity;
            model.addRow(row);
        }
        
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for(int i = 0; i< products.size(); i++ ){
            int soldQuantity = 0;
            Product product = products.get(i);     
                    for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
                        if(request instanceof ProductRequest){                     
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            soldQuantity +=((ProductRequest)request).getQuality();
                            }
                        }
                    }
                
            dataset.setValue(soldQuantity, "soldquantity", product.getProductName());      
        }
        JFreeChart chart = ChartFactory.createBarChart("SoldQuantity of Product", "Product", "Sold Quantity", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar Chart for product", chart);
        frame.setVisible(true);
        frame.setSize(450,350);
        
    }
    
    public void populateproductRevenueTable(){
        List<Product> products = new ArrayList();
        for(Product product : supplier.getProductDir().getProductList()){
            products.add(product);
        }
        Collections.sort(products, new Comparator<Product>(){
        @Override
        public int compare(Product p1, Product p2){
            int soldQuantity1 = 0;
            int soldQuantity2 = 0;
            int totalRevenue1 = 0;
            int totalRevenue2 = 0;
            for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
                    if(request instanceof ProductRequest ){                     
                        if(p1.getProductName().equals(((ProductRequest)request).getName())){
                            soldQuantity1 +=((ProductRequest)request).getQuality();
                        }
                        if(p2.getProductName().equals(((ProductRequest)request).getName())){
                            soldQuantity2 +=((ProductRequest)request).getQuality();
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
                    for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
                        if(request instanceof ProductRequest){                     
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            soldQuantity +=((ProductRequest)request).getQuality();
                            }
                        }
                    }
            row[0]=product;
            row[1]=soldQuantity;
            row[2]=product.getSalesPrice();
            row[3]=product.getAvailNum();
            row[4]=product.getSalesPrice()*soldQuantity;
            model.addRow(row);
        }
        
        
       DefaultPieDataset pirDataset = new DefaultPieDataset();
       for(int i = 0; i< products.size(); i++ ){
            int soldQuantity = 0;
            Product product = products.get(i); 
            Object[] row = new Object[5];
            row[0]=product.getProductName();
                    for(WorkRequest request: supplier.getWorkQueue().getWorkRequestList()){
                        if(request instanceof ProductRequest){                     
                            if(product.getProductName().equals(((ProductRequest)request).getName())){
                            soldQuantity +=((ProductRequest)request).getQuality();
                            }
                        }
                    }
            
            pirDataset.setValue(product.getProductName(),soldQuantity*product.getSalesPrice());
              
        }
        
      JFreeChart chart = ChartFactory.createPieChart("Product with Revenue", pirDataset,true,true,true);
      //  JFreeChart chart = ChartFactory.createBarChart("Customer Of order", "Customer", "Orders of Customer", pirDataset, PlotOrientation.VERTICAL, false, true, false);
        PiePlot p = (PiePlot)chart.getPlot();
       // p.setForegroundAlpha(TOP_ALIGNMENT);
        
        
        
       // p.setRangeGridlinePaint(Color.black);
        
        ChartFrame frame = new ChartFrame("Product with Revenue Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(450,500);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyseOrderBtn;
    private javax.swing.JButton analyseProductBtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> enterpriseComboBox;
    private javax.swing.JTable enterpriseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> productComboBox;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
