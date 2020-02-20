/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author wuxinyang
 */

public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Customer customer;
    private Role role;
    private WorkQueue workQueue;
   // private CustomerDirectory customerDir;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

   

    
    

    
    
    @Override
    public String toString() {
        return username;
    }
    
}
