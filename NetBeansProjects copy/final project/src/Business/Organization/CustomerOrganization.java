/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BeautyCSRRole;
import Business.Role.Role;
import Business.Role.CustomerRole;
import java.util.ArrayList;

/**
 *
 * @author wuxinyang
 */
public class CustomerOrganization extends Organization{
    public CustomerOrganization() {
        super(Organization.Type.customer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerRole());
        return roles;
    }
}