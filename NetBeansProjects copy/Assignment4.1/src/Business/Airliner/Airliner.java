/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import Business.FlightSchedule.Flight;
import Business.FlightSchedule.FlightSchedule;

/**
 *
 * @author jasper
 */
public class Airliner {
    private String name;
    private int seatNumber;
    //private String flightschedule;
    private String flight;
    //private FlightSchedule flightSchedule;
    public Airliner() {
        
    }
    public Airliner(String name, int seatNumber) {
        this.name=name;
        this.seatNumber=seatNumber;
     //   this.flight=flight.getFlightNumber();
        
    }

   
    public String getFlightSchedule() {
        return flight;
    }

    public void setFlightSchedule(Flight flight) {
        this.flight = String.valueOf(flight);
    }

    
    public void setflightSchedule(String flight) {
        this.flight = flight;
    }
    
    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }
       

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
    

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
