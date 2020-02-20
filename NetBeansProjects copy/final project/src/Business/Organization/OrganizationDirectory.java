/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author wuxinyang
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.CSR.getValue())){
            organization = new CSROrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Warehouse.getValue())){
            organization = new WarehouseOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Organization.Type.DiorAdmin.getValue())){
            organization = new DiorAdminOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization createSupplierOrganization(Organization.supplierType type){
        Organization organization = null;
        if (type.getValue().equals(Organization.supplierType.SupplierAdmin.getValue())){
            organization = new SupplierAdminOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Organization.supplierType.SupplierWarehouse.getValue())){
            organization = new SupplierWarehouseOrganization();
            organizationList.add(organization);
        }
    return organization;
    }
}
