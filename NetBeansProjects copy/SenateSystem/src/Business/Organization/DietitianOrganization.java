/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DietitionRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author wangqijia
 */
public class DietitianOrganization extends Organization {
    public DietitianOrganization() {
        super(Organization.Type.Dietitian.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DietitionRole());
        return roles;
    }
    
}
