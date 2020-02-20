/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author too
 */
public class ProductRequest extends WorkRequest {
    private int productid;
    private int quality;
    private String name;  
    private String supplierenterpirsename;
    private String beautyenterprisename;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getSupplierenterpirsename() {
        return supplierenterpirsename;
    }

    public void setSupplierenterpirsename(String supplierenterpirsename) {
        this.supplierenterpirsename = supplierenterpirsename;
    }

    public String getBeautyenterprisename() {
        return beautyenterprisename;
    }

    public void setBeautyenterprisename(String beautyenterprisename) {
        this.beautyenterprisename = beautyenterprisename;
    }

    
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
    
    
     @Override
    public String toString() {
        return name;
    }
         
}
