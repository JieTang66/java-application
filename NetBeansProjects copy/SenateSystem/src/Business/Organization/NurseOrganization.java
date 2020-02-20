/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import static Business.Enterprise.Enterprise.EnterpriseType.Hospital;
import Business.Role.NurseRole;
import Business.Role.SenateAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author wangqijia
 */

public class NurseOrganization extends Organization{


    public NurseOrganization() {
        super(Organization.Type.Nurse.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NurseRole());
        return roles;
    }
     
}
