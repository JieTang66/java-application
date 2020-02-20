/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import com.assignment5.entities.Customer;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // Our top 3 best negotiated products (meaning products that sell 
    //above target) Sales quantity of the product sold above the target price.
    // TODO
    public void threeBestProducts(){
        Map<Integer, Product> productHashMap = DataStore.getInstance().getProducts();
        Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
        Map<Integer, Order> orderHashMap = DataStore.getInstance().getOrders();
        
        for(Product p:productHashMap.values()){
            int account = 0;
            for(Order o:orderHashMap.values()){
                if(p.getId()==o.getItem().getProductId()&&p.getTargetPrice()<o.getItem().getSalesPrice()){
                   // int tmpPrice=o.getItem().getSalesPrice()-p.getTargetPrice();
                    account += o.getItem().getQuantity();
                    tmp.put(p.getId(), account);
                }
            }
        }
        
        List<Map.Entry<Integer,Integer>> list_Data = new ArrayList<Map.Entry<Integer,Integer>>(tmp.entrySet());
        Collections.sort(list_Data, new Comparator<Map.Entry<Integer,Integer>>()
        {
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2)
            {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
       // System.out.println(list_Data);
        
        //Collections.sort(keyList);
        System.out.println("1: Printing the top 3 best negotiated products "
                + "Sales quantity of the product sold above the target price");
        
        int tmpR=0;
        int record=0;
        for(int j=0; j<list_Data.size();j++){
               
            if(tmpR!=tmp.get(list_Data.get(j).getKey())){
               //record++;
               tmpR=tmp.get(list_Data.get(j).getKey());
//               if(record>3){
//                   break;
//               }
            }
            System.out.println(record+":"+productHashMap.get(list_Data.get(j).getKey()) +"---quantity which sell above target:"+tmp.get(list_Data.get(j).getKey()));
             
        }
    }
    
    
    //
    
    public void getTopThreecustomer(){
        
        Map<Integer, Order> orderHashMap = DataStore.getInstance().getOrders();
        Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
        Map<Integer, Product> productHashMap = DataStore.getInstance().getProducts();
        Map<Integer,Customer> customerHashMap = DataStore.getInstance().getCustomers();
        
        //List<Customer> customertList = new ArrayList<Customer>();
        
        for(Customer c:customerHashMap.values()){
            int account = 0;
            int count = 0;
            int res = 0;
            int ave=0;
            for(Order u:orderHashMap.values()){
                for(Product p:productHashMap.values()){  
                if(u.getCustomerId()==c.getId()){
                    account += Math.abs(u.getItem().getSalesPrice()-p.getTargetPrice())*u.getItem().getQuantity();
                    //count += u.getItem().getQuantity();
                    //if(count!=0){
                        ave = account;
                        //res = ;
                        tmp.put(c.getId(), ave);
                   // }
                    
                }
            }
        }
        }
        
        
        List<Map.Entry<Integer,Integer>> list_Data = new ArrayList<Map.Entry<Integer,Integer>>(tmp.entrySet());
        Collections.sort(list_Data, new Comparator<Map.Entry<Integer,Integer>>()
        {
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2)
            {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        
        
       // System.out.println(list_Data);
        
        //Collections.sort(keyList);
        System.out.println("2: Printing the top 3 best customers based on total posts number");
        int tmpR=0;
        int record=0;
        for(int j=0; j<list_Data.size();j++){
               
            if(tmpR!=tmp.get(list_Data.get(j).getKey())){
               record++;
               tmpR=tmp.get(list_Data.get(j).getKey());
               if(record>3){
                   break;
               }
            }
            System.out.println(record+":"+customerHashMap.get(list_Data.get(j).getKey()) +"---average absolute diff:"+tmp.get(list_Data.get(j).getKey()));
             
        }
    }
    //top 3 best sales people (sell higher that target)
    //3 sales people who have the most profit
    // TODO
    public void threeBestSalesPerson(){
        Map<Integer, Product> productHashMap = DataStore.getInstance().getProducts();
        Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
        Map<Integer, Order> orderHashMap = DataStore.getInstance().getOrders();
        Map<Integer, SalesPerson> salesPersonHashMap = DataStore.getInstance().getSalesPersons();
        
        for(SalesPerson s:salesPersonHashMap.values()){
            int account = 0;
            for(Product p:productHashMap.values()){      
                for(Order o:orderHashMap.values()){
                    if(s.getId()==o.getSupplierId()&&p.getId()==o.getItem().getProductId()){
                        int tmpPrice=(o.getItem().getSalesPrice()-p.getTargetPrice())*o.getItem().getQuantity();
                        account += tmpPrice;
                        tmp.put(s.getId(), account);
                    }
                }
            }
        }
        
        List<Map.Entry<Integer,Integer>> list_Data = new ArrayList<Map.Entry<Integer,Integer>>(tmp.entrySet());
        Collections.sort(list_Data, new Comparator<Map.Entry<Integer,Integer>>()
        {
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2)
            {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
       // System.out.println(list_Data);
        
        //Collections.sort(keyList);
        System.out.println("3: top 3 best sales people (sell higher that target)");
        
        int tmpR=0;
        int record=0;
        for(int j=0; j<list_Data.size();j++){
               
            if(tmpR!=tmp.get(list_Data.get(j).getKey())){
               record++;
               tmpR=tmp.get(list_Data.get(j).getKey());
               if(record>3){
                   break;
               }
            }
            System.out.println(record+":"+salesPersonHashMap.get(list_Data.get(j).getKey()) +"---profits:"+tmp.get(list_Data.get(j).getKey()));
             
        }   
    }
    
    //4.1 4.2
    public void totalRevenue(){
        Map<Integer, Product> productHashMap = DataStore.getInstance().getProducts();
        Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
        Map<Integer, Order> orderHashMap = DataStore.getInstance().getOrders();
        
        int sum=0;
        for(Product p:productHashMap.values()){    
            for(Order o:orderHashMap.values()){
                if(p.getId()==o.getItem().getProductId()){
                    int tmpPrice=(o.getItem().getSalesPrice()-p.getTargetPrice())*o.getItem().getQuantity();
                    sum += tmpPrice;    
                    
                }
            }
        }
        System.out.println("4.1: the total revenue:"+ sum);
        
        Map<Integer, SalesPerson> salesPersonHashMap = DataStore.getInstance().getSalesPersons();
        
        for(SalesPerson s:salesPersonHashMap.values()){
            int account = 0;
            for(Product p:productHashMap.values()){      
                for(Order o:orderHashMap.values()){
                    if(s.getId()==o.getSupplierId()&&p.getId()==o.getItem().getProductId()){
                        int tmpPrice=(o.getItem().getSalesPrice()-p.getTargetPrice())*o.getItem().getQuantity();
                        account += tmpPrice;
                        tmp.put(s.getId(), account);
                    }
                }
            }
        }
        List<Map.Entry<Integer,Integer>> list_Data = new ArrayList<Map.Entry<Integer,Integer>>(tmp.entrySet());
        
        System.out.println("4.2: Sum of the profits made by every sales people:");
        
        for(int j=0; j<list_Data.size();j++){
            System.out.println(salesPersonHashMap.get(list_Data.get(j).getKey())+": "+list_Data.get(j).getValue());
        }    
        
    }
}
