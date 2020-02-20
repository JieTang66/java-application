/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business1;

import Business.Airliner.Airliners;
import Business.Customer.CustomerDirectory;
import Business.Airliner.Airplane;
import Business.FlightSchedule.FlightSchedule;
/**
 *
 * @author jasper
 */
public class TravelAgency {
    private static TravelAgency travelAgency;
    private CustomerDirectory customerDirectory;
    private Airliners airliner;
    private FlightSchedule flightSchedule;
    
    private TravelAgency(){
        customerDirectory=new CustomerDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }
    
    
    
}
