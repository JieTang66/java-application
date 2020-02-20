/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

//import Business.Employee.Employee;
import Business.Organization.UserOrganization;
import Business.Organization.ManagerOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        //create user organization
        UserOrganization userorganzation = new UserOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(userorganzation);
        
        //user
        UserAccount accountuser=new UserAccount();
        accountuser .setUsername("user");
        accountuser.setPassword("user");
        accountuser.setRole("user");
        
        //create manager organization
        UserOrganization manageorganzation = new UserOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(manageorganzation);
        
        //user
        UserAccount accountmanager=new UserAccount();
        accountmanager .setUsername("manager");
        accountmanager.setPassword("manager");
        accountmanager.setRole("manager");

        
        
        userorganzation.getUserAccountDirectory().getUserAccountList().add(accountuser);
        userorganzation.getUserAccountDirectory().getUserAccountList().add(accountmanager);
        
        return business;
    }
    
}
