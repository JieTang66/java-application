/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Product.ProductDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author too
 */
public class SupplierEnterprise extends Enterprise{
    private ProductDirectory productDir; 
    
    
    public SupplierEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Supplier);
        this.productDir = new ProductDirectory();
     }

    public ProductDirectory getProductDir() {
        return productDir;
    }

    public void setProductDir(ProductDirectory productDir) {
        this.productDir = productDir;
    }

    
    
    @Override
        
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
  
}
