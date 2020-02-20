/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Product.Product;

/**
 *
 * @author wuxinyang
 */
public class Item {
    private int quatity;
    private Product product;

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
     
    @Override
    public String toString() {
        return product.getProductName();
    }
    
    
}
