/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import com.assignment5.analytics.AnalysisHelper;
import com.assignment5.analytics.DataStore;
import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author kasai
 */
public class GateWay {
    
    DataReader productReader;
    DataReader orderReader;
  
    AnalysisHelper helper;
    
    public GateWay() throws IOException {
        //DataGenerator generator = DataGenerator.getInstance();
        productReader = new DataReader("ProductCatalogue 1.csv");
        orderReader = new DataReader("SalesData 1.csv");
        helper = new AnalysisHelper();
    }
    
    
    public static void main(String args[]) throws IOException{
        
       // DataGenerator generator = DataGenerator.getInstance();
        GateWay inst = new GateWay();
        inst.readData();
        //Below is the sample for how you can use reader. you might wanna 
        //delete it once you understood.
        
//        DataReader orderReader = new DataReader(generator.getOrderFilePath());
//        String[] orderRow;
//        printRow(orderReader.getFileHeader());
//        while((orderRow = orderReader.getNextRow()) != null){
//            printRow(orderRow);
//        }
//        System.out.println("_____________________________________________________________");
//        DataReader productReader = new DataReader(generator.getProductCataloguePath());
//        String[] prodRow;
//        printRow(productReader.getFileHeader());
//        while((prodRow = productReader.getNextRow()) != null){
//            printRow(prodRow);
//        }
    }
    
    private void readData() throws IOException{
        String[] row;
        while((row = productReader.getNextRow()) != null ){
            generateProduct(row);
        }
        while((row = orderReader.getNextRow()) != null ){
            Order order = generateOrder(row);
            generateSalesPerson(row, order);
            generateCustomer(row, order);
        }
        runAnalysis();
    }
//    public static void printRow(String[] row){
//        for (String row1 : row) {
//            System.out.print(row1 + ", ");
//        }
//        System.out.println("");
//    }
    
    private void generateProduct(String[] row){
        // TODO
        int productId = Integer.parseInt(row[0]);
        int minPrice = Integer.parseInt(row[1]);
        int maxPrice = Integer.parseInt(row[2]);
        int targetPrice = Integer.parseInt(row[3]);
        Product product = new Product(productId,minPrice,maxPrice,targetPrice);
        
        DataStore.getInstance().getProducts().put(productId, product);
        
    }
    
    private Order generateOrder(String[] row){
        // TODO
        
        int orderId = Integer.parseInt(row[0]);
        int itemId = Integer.parseInt(row[1]);
        int salesId = Integer.parseInt(row[4]);
        int customerId = Integer.parseInt(row[5]);
        int productId = Integer.parseInt(row[2]);
        int quantity = Integer.parseInt(row[3]);
        int salesPrice = Integer.parseInt(row[6]);
        
        Item item=new Item(productId,salesPrice,quantity);
        
        Order order = new Order(orderId,salesId,customerId,item);
        
        DataStore.getInstance().getOrders().put(orderId, order);
        
        Map<Integer,Product> productHashMap = DataStore.getInstance().getProducts();
        
        if(productHashMap.containsKey(productId)){
            productHashMap.get(productId).getOrders().add(order);
        }
        return order;
    }
    
    private void generateCustomer(String[] row, Order order){
        // TODO
        int customerId = Integer.parseInt(row[5]);
        
        Map<Integer,Customer> customers = DataStore.getInstance().getCustomers();
        if(customers.containsKey(customerId)){
            customers.get(customerId).getOrders().add(order);
        }
        else{
            Customer cust = new Customer(customerId);
            cust.getOrders().add(order);
            customers.put(customerId, cust);
        }
    }
    
    private void generateSalesPerson(String[] row, Order orders){
        int salesId = Integer.parseInt(row[4]);
        Map<Integer,SalesPerson> salesPerson = DataStore.getInstance().getSalesPersons();
        
        
        if(salesPerson.containsKey(salesId)){
            salesPerson.get(salesId).getOrders().add(orders);
        }else{
            SalesPerson salesP = new SalesPerson(salesId);
            salesP.getOrders().add(orders);
            salesPerson.put(salesId, salesP);
        }
    }
    
    
    
    private void runAnalysis(){
        // TODO
       helper.threeBestProducts();
       helper.getTopThreecustomer();
       helper.threeBestSalesPerson();
       helper.totalRevenue();
       
    }
}
