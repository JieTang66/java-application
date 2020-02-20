/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author wuxinyang
 */
public class CustomerDirectory {
     private List<Customer> customerList;
     
      public CustomerDirectory(){
       customerList = new ArrayList<Customer>();
        
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer() {
        Customer c = new Customer();
        customerList.add(c); 
        return c; 
        
    } 
     
    public Customer searchCustomerId(String id) {
        for(Customer c: customerList) {
            if(id.equals(c.getCustomerId())) {
                return c;
            } else {
            }
        }
        return null; 
    }
    
//     public Customer createCustomer(String fname, String lname, String Email, String phoneNum,Date Birth){
//        Customer c = new Customer();
//        c.setFname(fname);
//        c.setLname(lname);
//        c.setEmail(Email);
//        c.setPhoneNum(phoneNum);
//        c.setBirth(Birth);
//        customerList.add(c);
//        return c;
//    }
    
     
}
