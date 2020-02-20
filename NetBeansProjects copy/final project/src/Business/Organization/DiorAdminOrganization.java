/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BeautyAdminRole;
import Business.Role.DiorAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author too
 */
public class DiorAdminOrganization extends Organization{
     public DiorAdminOrganization() {
        super(Type.DiorAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DiorAdminRole());
        return roles;
    }
}
