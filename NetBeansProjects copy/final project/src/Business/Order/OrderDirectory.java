/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wuxinyang
 */
public class OrderDirectory {
     private List<Order> orderList;

    public OrderDirectory() {
        orderList = new ArrayList<Order>();
        
    }
     
     

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

     public Order addOrder(Order o){
        
         orderList.add(o);
         return o;
     }
     
}
