/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FlightSchedule;

import Business.Airliner.Airliner;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
    private Date date;
    private String timeofday;
    private String SeatID;
    private String airliner;
    private int SeatNumber;
    
    public ArrayList<String> list3 = new ArrayList<String>();
//    private int SeatP;
//    private String SeatLocation;

    public Flight(){
        
    }
    // Airliner airliner, Customer customer, CustomerDirectory customerDirectory String SeatID,int SeatP, String SeatLocation,Airliner airliner
    public Flight(String flightName, String timeStart,String timeEnd,String timeofday, String locationStart, String locationEnd,String date,Airliner airliner) throws ParseException {
        this.flightNumber = flightName;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeofday = timeofday;
        this.departureLocation = locationStart;
        this.arrivalLocation = locationEnd;
        this.date=new SimpleDateFormat("yyyy-MM-dd").parse(date);
        this.SeatID=gengerateSeatID();
        this.airliner=airliner.getName();
        this.SeatNumber = airliner.getSeatNumber();
//        this.SeatID=SeatID;
//        this.SeatP=SeatP;
//        this.SeatLocation=SeatLocation;
        //this.customer = customer;
        //this.customerDirectory = customerDirectory;
    }
    
    public Flight(Airliner airliner){
        this.airliner=airliner.getName();
        
    }

    public int getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(int seatnumber){     
        this.SeatNumber = seatnumber;
    }
    
    public void setSeatNumber1(Airliner airliner){     
        this.SeatNumber = airliner.getSeatNumber();
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
    
    public ArrayList  gennerateSeat(){
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        list1.add("1");list1.add("2");list1.add("3");list1.add("4");list1.add("5");list1.add("6");list1.add("7");list1.add("8");
        list1.add("9");list1.add("10");list1.add("11");list1.add("12");list1.add("13");list1.add("14");list1.add("15");
        list1.add("16");list1.add("17");list1.add("18");list1.add("19");list1.add("20");list1.add("21");list1.add("22");
        list1.add("23");list1.add("24");list1.add("25");
        list2.add("A");list2.add("B");list2.add("C");list2.add("D");list2.add("E");list2.add("F");
        for (String string1 : list1) {
        for (String string2 : list2) {
        list3.add(string1+string2);
    }
}
        return list3;
    }

    public int seat(){
        return list3.size();
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

    
    public Date getDate() {
        return date;
    }

    public void setDate(String date) throws ParseException {
        this.date = new SimpleDateFormat("yyyy-MM-dd").parse(date);
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
