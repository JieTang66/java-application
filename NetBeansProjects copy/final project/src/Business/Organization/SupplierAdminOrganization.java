/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BeautyAdminRole;
import Business.Role.Role;
import Business.Role.SupplierAdminRole;
import Business.Role.SuppliersubAdminRole;
import java.util.ArrayList;

/**
 *
 * @author wuxinyang
 */
public class SupplierAdminOrganization extends Organization{
   
     public SupplierAdminOrganization() {
        super(Organization.supplierType.SupplierAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SuppliersubAdminRole());
        return roles;
    }

}
