/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FlightSchedule;

import Business.Airliner.Airliner;
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
    private Airliner airliner1;
    private String departureLocation;
    private String arrivalLocation;
    private Customer customer;
    private CustomerDirectory customerDirectory;
    private String date;
    private String timeofday;
    private String SeatID;
    private String airliner;
    private int SeatNumber;
    public int row;
    public String location;
//    private int SeatP;
//    private String SeatLocation;

    public Flight(){
        
    }
    public Flight(Airliner airliner){
        this.airliner=airliner.getName();
        
    }
    // Airliner airliner, Customer customer, CustomerDirectory customerDirectory String SeatID,int SeatP, String SeatLocation,Airliner airliner
    public Flight(String flightName, String timeStart,String timeEnd,String timeofday, String locationStart, String locationEnd,String date,Airliner airliner) {
        this.flightNumber = flightName;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeofday = timeofday;
        this.departureLocation = locationStart;
        this.arrivalLocation = locationEnd;
        this.date=date;
        this.SeatID=gengerateSeatID();
        this.airliner=airliner.getName();
       // this.SeatNumber = airliner.getSeatNumber();
//        this.SeatID=SeatID;
//        this.SeatP=SeatP;
//        this.SeatLocation=SeatLocation;
        //this.customer = customer;
        //this.customerDirectory = customerDirectory;
    }

    public int getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(int seatNumber){
        
        this.SeatNumber = seatNumber;
    }
    
    public void setreduceSeatNumber() {
        this.SeatNumber = reduceSeat();
    }


    public Airliner getAirliner1() {
        return airliner1;
    }

    public void setAirliner1(Airliner airliner1) {
        this.airliner1 = airliner1;
    }

    
    public String gengerateSeatID(){
        int a = (int)(Math.random()*1000);
        return String.valueOf(a);     
    }
    
    public String  gennerateSeat(){
        
        row=(int)(Math.random()*40);
	location=String.valueOf((char)Math.round(Math.random()*25+65));
	return String.valueOf(row)+","+String.valueOf(location);
    }
    
    public int reduceSeat(){
        return getSeatNumber()-1;
        
    }
    
    public String getSeatID() {
        return SeatID;
    }

    public void setSeatID(String SeatID) {
        this.SeatID = SeatID;
    }

    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeofday() {
        return timeofday;
    }

    public void setTimeofday(String timeofday) {
        this.timeofday = timeofday;
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

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
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
