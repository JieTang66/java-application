/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author wuxinyang
 */
public class Product {
     private String productName;
     private double salesPrice;
     private double purchasingPrice;
     private int productId;
     private Date dateStored;
     private int availNum;
     private static int count = 1;
     private String type;
     private Icon picture;
     
     private faceType faceType;
     private eyeType eyeType;
     private lipType lipType;
     private String supplierproductid;
      
     public enum faceType{
        Blush("Blush"),Foundation("Fundation"),Highlighter("Highlighter"),FacePrimer("Face Primer");
        
        
        private String value;
        
        private faceType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
     
     public enum eyeType{
        Eyeshadow("Eyeshadow"),Eyebrow("Eyebrow"),Eyeliner("Eyeliner");
        
        private String value;
        
        private eyeType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
     
     public enum lipType{
        Lipstick("Lipstick"),LipGloss("Lip Gloss"),LipLiner("Lip Liner");
        
        private String value;
        
        private lipType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
     
     
     

    public Product() {
        productId = count;
        count++;
    }

    public Icon getPicture() {
        return picture;
    }

    public void setPicture(Icon picture) {
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSupplierproductid() {
        return supplierproductid;
    }

    public void setSupplierproductid(String supplierproductid) {
        this.supplierproductid = supplierproductid;
    }

    
    
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(double purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getDateStored() {
        return dateStored;
    }

    public void setDateStored(Date dateStored) {
        this.dateStored = dateStored;
    }

   
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public faceType getFaceType() {
        return faceType;
    }

    public void setFaceType(faceType faceType) {
        this.faceType = faceType;
    }

    public eyeType getEyeType() {
        return eyeType;
    }

    public void setEyeType(eyeType eyeType) {
        this.eyeType = eyeType;
    }

    public lipType getLipType() {
        return lipType;
    }

    public void setLipType(lipType lipType) {
        this.lipType = lipType;
    }

    public int getAvailNum() {
        return availNum;
    }

    public void setAvailNum(int availNum) {
        this.availNum = availNum;
    }
    
      @Override
        public String toString(){
        return productName;
    }
}
