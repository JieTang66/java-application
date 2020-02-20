/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createSOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Client.getValue())){
            organization = new ClientOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Dietitian.getValue())){
            organization = new DietitianOrganization();
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(Type.SenateAdmin.getValue())){
//            organization = new SenateAdminOrganization();
//            organizationList.add(organization);
//        }
        else if (type.getValue().equals(Type.Senatealarm.getValue())){
            organization = new SenatealarmOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createHOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Hospitalalarm.getValue())){
            organization = new HospitalalarmOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}