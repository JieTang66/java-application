/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Order.OrderDirectory;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author wuxinyang
 */
public class Customer {
    private String fname;
    private String lname;
    private String Email;
    private String phoneNum;
    private Date Birth;
    private String Address;
    private String BankAccountNum;
    private Date dateCreated;
    private int customerId;
    private static int count = 1;
    private OrderDirectory orderDir;
    private Network network;
    private Enterprise enterprise;
    private String gender;
    private String monthlyC;
    private Icon picture;
    private String path;

    public Customer() {
        
        customerId = count;
        count++;
        this.dateCreated = new Date();
        this.orderDir = new OrderDirectory();
    }

    public Icon getPicture() {
        return picture;
    }

    public void setPicture(Icon picture) {
        this.picture = picture;
    }
    
    

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getBirth() {
        return Birth;
    }

    public void setBirth(Date Birth) {
        this.Birth = Birth;
    }

    public String getBankAccountNum() {
        return BankAccountNum;
    }

    public void setBankAccountNum(String BankAccountNum) {
        this.BankAccountNum = BankAccountNum;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMonthlyC() {
        return monthlyC;
    }

    public void setMonthlyC(String monthlyC) {
        this.monthlyC = monthlyC;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    

    

   
    

   

    public OrderDirectory getOrderDir() {
        return orderDir;
    }

    public void setOrderDir(OrderDirectory orderDir) {
        this.orderDir = orderDir;
    }

   

   

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
     @Override
    public String toString() {
        return fname +" "+ lname;
    }

    
    
    
}
