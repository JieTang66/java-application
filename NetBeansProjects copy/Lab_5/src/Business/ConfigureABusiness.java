/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        Employee employee=new Employee();
        employee.setName("Alex");
        
        UserAccount account=new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole("Admin");
        account.setEmployee(employee);
        
        Employee employeedoc=new Employee();
        employeedoc.setName("Jackie");
        
        UserAccount accountdoc=new UserAccount();
        accountdoc.setUsername("doctor");
        accountdoc.setPassword("doctor");
        accountdoc.setRole("Doctor");
        accountdoc.setEmployee(employeedoc);
        
        Employee employeelab=new Employee();
        employeelab.setName("Ben");
        
        UserAccount accountlab=new UserAccount();
        accountlab.setUsername("lab");
        accountlab.setPassword("lab");
        accountlab.setRole("Lab Assitant");
        accountlab.setEmployee(employeelab);
        
        AdminOrganization a=new AdminOrganization();
        a.getEmployeeDirectory().getEmployeeList().add(employee);
        a.getUserAccountDirectory().getUserAccountList().add(account);
        
        DoctorOrganization d=new DoctorOrganization();
        d.getEmployeeDirectory().getEmployeeList().add(employeedoc);
        d.getUserAccountDirectory().getUserAccountList().add(accountdoc);
        
        LabOrganization l=new LabOrganization();
        l.getEmployeeDirectory().getEmployeeList().add(employeelab);
        l.getUserAccountDirectory().getUserAccountList().add(accountlab);
        
        business.getOrganizationDirectory().getOrganizationList().add(a);
        business.getOrganizationDirectory().getOrganizationList().add(d);
        business.getOrganizationDirectory().getOrganizationList().add(l);
        return business;
    }
    
}
