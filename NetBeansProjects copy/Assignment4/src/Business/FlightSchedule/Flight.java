/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FlightSchedule;

import Business.Airliner.Airplane;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;

/**
 *
 * @author jasper
 */
public class Flight {
    private String flightNumber;
    private String timeStart;
    private String timeEnd;
    private Airplane airliner;
    private String departureLocation;
    private String arrivalLocation;
    private Customer customer;
    private CustomerDirectory customerDirectory;
    private String date;

    public Flight(){
        
    }

    public Flight(String flightName, String timeStart, String timeEnd, Airplane airliner, String locationStart, String locationEnd, Customer customer, CustomerDirectory customerDirectory) {
        this.flightNumber = flightName;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.airliner = airliner;
        this.departureLocation = locationStart;
        this.arrivalLocation = locationEnd;
        this.customer = customer;
        this.customerDirectory = customerDirectory;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    
    

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Airplane getAirliner() {
        return airliner;
    }

    public void setAirliner(Airplane airliner) {
        this.airliner = airliner;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    @Override
    public String toString() {
        return flightNumber;
    }
    
}
