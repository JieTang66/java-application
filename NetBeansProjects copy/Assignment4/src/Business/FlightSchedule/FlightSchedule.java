/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FlightSchedule;

import java.util.ArrayList;

/**
 *
 * @author jasper
 */
public class FlightSchedule {
    private ArrayList<Flight> flightList;

    public FlightSchedule() {
        flightList=new ArrayList<>();
    }

    
    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setAirlinerList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    public Flight createFlight(String number){
        Flight flight = new Flight();
        flight.setFlightNumber(number);
        flightList.add(flight);
        return flight;
    }
    
    public void deleteFlight(Flight Flight){
        flightList.remove(Flight);
    }
    
    public Flight addFlight(){
        Flight flight = new Flight();
        flightList.add(flight);
        return flight;
    }
    
    
    public ArrayList<Flight> searchFlight(String flightNumber){
        ArrayList<Flight> flightList = new ArrayList<>();
        for(Flight flight : this.flightList){
            if(flight.getFlightNumber()==flightNumber){
                flightList.add(flight);
            }
        }
        return flightList;
    }
}
