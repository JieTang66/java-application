/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Customer.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wuxinyang
 */
public class ProductDirectory {
     private List<Product> productList;

    public ProductDirectory() {
        productList = new ArrayList<Product>();
    }
     
     

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    
    public Product searchProductName (String type) {
        for(Product p: productList) {
            if(type.equalsIgnoreCase(p.getProductName())) {
                return p;
            } else {
            }
        }
        return null; 
    }

     public Product searchProductId (int type) {
        for(Product p: productList) {
            if(p.getProductId()==type) {
                return p;
            } else {
            }
        }
        return null; 
    }
    
  
     public Product addProduct(){
        Product product = new Product();
        productList.add(product);
        return product;
    }
     
    public void removeProduct(Product p){
       productList.remove(p);
    }
     
    public Product searchProductType (Product.eyeType type) {
        for(Product p: productList) {
            if(type.equals(p.getEyeType().Eyebrow)) {
                return p;
            } else {
            }
        }
        return null; 
    }
}
