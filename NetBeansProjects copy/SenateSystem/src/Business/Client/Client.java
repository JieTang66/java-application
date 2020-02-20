/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Client;

import Business.Employee.*;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class Client{

    private String dieaseName;
    private String clientName;
    private int height;
    private int weight;
    private int age;
    private int bloodPressure;
    public String path;

    public Client() {
    }

    public String getDieaseName() {
        return dieaseName;
    }

    public void setDieaseName(String dieaseName) {
        this.dieaseName = dieaseName;
    }
    
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return clientName;
    }
    
}
