/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Client;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ClientDirectory {

    private ArrayList<Client> clientList;

    public ClientDirectory() {
        clientList = new ArrayList();
    }

    public ArrayList<Client> getClientList() {
        return clientList;
    }
//    
    public Client addClient(Client client){
        clientList.add(client);
        return client;
    }
//    
    public Client createClient(String name,int Age,int BloodPressure,String Diease,int Height,int Weight){
        Client client=new Client();
        
        client.setClientName(name);
        client.setAge(Age);
        client.setBloodPressure(BloodPressure);
        client.setDieaseName(Diease);
        client.setHeight(Height);
        client.setWeight(Weight);
        clientList.add(client);
        return client;
    }
    
    public ArrayList<Client> DeleteClientName(){
        clientList.clear();
        return clientList;
    }
    
    public Client createClientName(){
        Client client=new Client(); 
        clientList.add(client);
        return client;
    }

//    public ArrayList<Client> addClient(Client client) {
//        clientList.add(client);
//        return clientList;
//    }
}
