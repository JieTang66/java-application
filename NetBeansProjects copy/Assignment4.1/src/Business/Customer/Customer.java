/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author jasper
 */
public class Customer {
    private int age;
    private String name;
    private int idNumber;
    private String seatID;
    private String flightNumber;
    public String row;
    
    public Customer(int age,String name,int idNumber,String seatID,String flightNumber){
        this.age=age;
        this.name=name;
        this.idNumber=idNumber;
        this.seatID=seatID;
        this.flightNumber = flightNumber;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }
    
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    Customer() {
    }
   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getSeatId() {
        return seatID;
    }

    public void setSeatId(String seatId) {
        this.seatID = seatId;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
