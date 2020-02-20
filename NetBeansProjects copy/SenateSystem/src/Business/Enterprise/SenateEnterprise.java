/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class SenateEnterprise extends Enterprise {
    
    public SenateEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Senate);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
