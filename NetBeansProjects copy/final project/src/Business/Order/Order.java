/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Product.Product;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author wuxinyang
 */
public class Order {
    private int orderId;
    private ArrayList<Item> orderItemList;
    private Customer customer;
    private Date dateCreated;
    private String statues;
    private static int count = 1;
    private String checkoutStatus = "isntcheckout";
    private String trackingNum;
    private String Label;
    private String reason;
    private Double totalprice;
    
   

    public Order() {
        dateCreated = new Date();
        orderId = count;
        count++;
        this.orderItemList=new ArrayList<Item>();
        
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Item> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<Item> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

   

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStatues() {
        return statues;
    }

    public void setStatues(String statues) {
        this.statues = statues;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    
    
    
    
    
    
    public Item addOrderItem(Product p,int q){
        Item i = new Item();
        i.setProduct(p);
        i.setQuatity(q);
        orderItemList.add(i);
        return i;
                
    }

    public void removeOrderItem(Item o){
        orderItemList.remove(o);
    }

    public String getCheckoutStatus() {
        return checkoutStatus;
    }

    public void setCheckoutStatus(String checkoutStatus) {
        this.checkoutStatus = checkoutStatus;
    }

    public String getTrackingNum() {
        return trackingNum;
    }

    public void setTrackingNum(String trackingNum) {
        this.trackingNum = trackingNum;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    
    
     @Override
    public String toString() {
        return Integer.toString(orderId);
    }
    
}
