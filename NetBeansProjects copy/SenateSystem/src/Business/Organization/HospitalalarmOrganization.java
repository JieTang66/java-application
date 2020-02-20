/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.HospitalalarmRole;
import java.util.ArrayList;


/**
 *
 * @author bb
 */
public class HospitalalarmOrganization extends Organization{
    public HospitalalarmOrganization() {
        super(Type.Hospitalalarm.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalalarmRole());
        return roles;
    }
}
