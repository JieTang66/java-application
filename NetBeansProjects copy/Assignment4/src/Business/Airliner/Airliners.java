/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import java.util.ArrayList;

/**
 *
 * @author jasper
 */
public class Airliners {
    private ArrayList<Airplane> airlinerList;

    public Airliners(){
        airlinerList = new ArrayList<Airplane>();
    }
    public ArrayList<Airplane> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airplane> airlinerList) {
        this.airlinerList = airlinerList;
    }
    public Airplane createAirliner(String name){
        Airplane airliner = new Airplane();
        airliner.setName(name);
        airlinerList.add(airliner);
        return airliner;
    }
    
}
