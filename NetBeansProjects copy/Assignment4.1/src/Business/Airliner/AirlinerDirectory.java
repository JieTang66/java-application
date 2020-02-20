/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import Business.FlightSchedule.Flight;
import Business.FlightSchedule.FlightSchedule;
import java.util.ArrayList;

/**
 *
 * @author jasper
 */
public class AirlinerDirectory {
    public ArrayList<Airliner> airlinerList;
    
    public FlightSchedule flightSchedule;
    public AirlinerDirectory(){
 
        Airliner Air1 = new Airliner("airline1",12);
        Airliner Air2 = new Airliner("airline2",14);
        Airliner Air3 = new Airliner("airline3",18);
        Airliner Air4 = new Airliner("airline4",28);
        Airliner Air5 = new Airliner("airline5",19);
        airlinerList = new ArrayList<>();
        airlinerList.add(Air1);
        airlinerList.add(Air2);
        airlinerList.add(Air3);
        airlinerList.add(Air4);
        airlinerList.add(Air5);

        
    }
    
//    public AirlinerDirectory(){
//        airlinerList = new ArrayList<Airliner>();
//    }
    public ArrayList<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }
    public Airliner createAirliner(String name){
        Airliner airliner = new Airliner();
        airliner.setName(name);
        airlinerList.add(airliner);
        return airliner;
    }
    public Airliner addAccount() {
        Airliner account = new Airliner();
        airlinerList.add(account);
        return account;
    }
}
