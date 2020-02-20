/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author too
 */
public class ProductUpdateRequest extends WorkRequest{
    private int productid;
    private String name;
    private double saleprice;
    private double purchasingprice;
    private int availnum;

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(double saleprice) {
        this.saleprice = saleprice;
    }

    public double getPurchasingprice() {
        return purchasingprice;
    }

    public void setPurchasingprice(double purchasingprice) {
        this.purchasingprice = purchasingprice;
    }

    public int getAvailnum() {
        return availnum;
    }

    public void setAvailnum(int availnum) {
        this.availnum = availnum;
    }
    
    
    
}
