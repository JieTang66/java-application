/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Conference;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author too
 */
public class ConferenceDirectory {
    private List<Conference> conferencelist;
    
    public ConferenceDirectory(){
        conferencelist = new ArrayList<Conference>();
    }

    public List<Conference> getConferencelist() {
        return conferencelist;
    }

    public void setConferencelist(List<Conference> conferencelist) {
        this.conferencelist = conferencelist;
    }
    
    public Conference addConference(){
        Conference c = new Conference();
        conferencelist.add(c);
        return c;
    }
    
    public void removeConference(Conference c){
        conferencelist.remove(c);
    }
}
