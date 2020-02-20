/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.CustomerDirectory;
import Business.Order.OrderDirectory;
import Business.Product.ProductDirectory;
import java.util.ArrayList;

/**
 *
 * @author wuxinyang
 */
public class WorkQueue {


       private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<WorkRequest>();
        //  System.out.println("Haer");
        
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    } 


    
    
    
    
    
}
