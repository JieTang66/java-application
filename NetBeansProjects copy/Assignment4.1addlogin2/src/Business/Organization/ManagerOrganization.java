/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author jungle
 */
public class ManagerOrganization extends Organization{
    
    public ManagerOrganization() {
        super(Type.Manager.getValue());
    }

    
    @Override
    public ArrayList<String> getSupportedRole() {
        ArrayList<String> roles = new ArrayList<>();
        roles.add("Manager");
        return roles;
    }
}
