/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author jasper
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<>();
        
        Customer customer1 = new Customer(45,"Customer1",123,"123","flight1","1B");
        Customer customer2 = new Customer(56,"Customer2",234,"345","flight2","2C");
        Customer customer3 = new Customer(22,"Customer3",345,"456","flight3","3E");
        Customer customer4 = new Customer(23,"Customer4",456,"1567","flight4","4D");
        Customer customer5 = new Customer(54,"Customer5",789,"1567","flight5","5F");
        
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
    }

    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer createCustomer(String name){
        Customer customer = new Customer();
        customer.setName(name);
        customerList.add(customer);
        return customer;
    }
    public Customer addCustomer() {
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }
    public ArrayList<Customer> searchByFlightNum(String flightNum){
        ArrayList<Customer> cusList = new ArrayList<>();
        for(Customer cus : customerList){
            if(cus.getFlightNumber().equals(flightNum)){
                cusList.add(cus);
            }
        }
        return cusList;
    }
    
}
