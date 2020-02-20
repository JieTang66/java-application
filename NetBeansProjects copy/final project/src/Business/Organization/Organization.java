/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author wuxinyang
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private CustomerDirectory customerDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), 
        CSR("CSR Organization"), 
        Warehouse("Warehouse Organization"),
        DiorAdmin("DiorAdmin Organization"),
        customer("customer Organization");
      //  SupplierAdmin("Supplier Admin Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum supplierType{
        sAdmin("Admin Organization"), 
        SupplierAdmin("Supplier Admin Organization"),
        SupplierWarehouse("Supplier Warehouse Organization");
        private String value;
        private supplierType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
     public enum customerType{
     //   cAdmin("Admin Organization"), 
        customer("customer Organization");
        private String value;
        private customerType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        customerDirectory = new CustomerDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    
    @Override
    public String toString() {
        return name;
    }
    
}
