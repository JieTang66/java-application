/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BeautyCSRRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author wuxinyang
 */
public class CSROrganization extends Organization{
    public CSROrganization() {
        super(Organization.Type.CSR.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BeautyCSRRole());
        return roles;
    }
}
