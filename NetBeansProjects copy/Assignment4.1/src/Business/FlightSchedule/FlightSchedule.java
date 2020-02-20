/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FlightSchedule;
import Business.Airliner.Airliner;
import Business.Airliner.AirlinerDirectory;
import java.util.ArrayList;

/**
 *
 * @author jasper
 */
public class FlightSchedule{
    public ArrayList<Flight> flightList;
    AirlinerDirectory air = new AirlinerDirectory();
    
    public FlightSchedule() {
        flightList=new ArrayList<>();
        Flight flight1 = new Flight("flight1","8:00","10:30","morning","Boston","Lexington","Dec10",air.airlinerList.get(0));
        Flight flight2 = new Flight("flight2","18:00","21:00","evening","New York","Lexington","Dec10",air.airlinerList.get(1));
        Flight flight3 = new Flight("flight3","12:38","14:54","daytime","Boston","WashingtonDC","Dec10",air.airlinerList.get(2));
        Flight flight4 = new Flight("flight4","12:08","15:58","daytime","LA","Boston","Dec10",air.airlinerList.get(3));
        Flight flight5 = new Flight("flight5","19:43","22:00","evening","Seattle","Boston","Dec10",air.airlinerList.get(4));
        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
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
    
    
    public ArrayList<Flight> searchFlight(String departureLocation,String arrivalLocation){
        ArrayList<Flight> flightList = new ArrayList<>();
        for(Flight flight : this.flightList){
            if(flight.getDepartureLocation().equalsIgnoreCase(departureLocation)&&flight.getArrivalLocation().equalsIgnoreCase(arrivalLocation)){
                flightList.add(flight);
            }
        }
        return flightList;
    }
    
    public ArrayList<Flight> searchFlightNum(String flightNum){
        ArrayList<Flight> result1 = new ArrayList<>();
        for(Flight f : flightList){
            if(f.getFlightNumber().equals(flightNum)){
                result1.add(f);
            }
        }
        return result1;
    }
    
    public ArrayList<Flight> searchDepartureLocation(String departureLocation){
        ArrayList<Flight> result2 = new ArrayList<>();
        for(Flight f : flightList){
            if(f.getDepartureLocation().equals(departureLocation)){
                result2.add(f);
            }
        }
        return result2;
    }
    
    public ArrayList<Flight> searchArrivalLocation(String arrivalLocation){
        ArrayList<Flight> result3 = new ArrayList<>();
        for(Flight f : flightList){
            if(f.getArrivalLocation().equals(arrivalLocation)){
                result3.add(f);
            }
        }
        return result3;
    }
    
    public ArrayList<Flight> searchTimeOfDay(String timeOfDay){
        ArrayList<Flight> result4 = new ArrayList<>();
        for(Flight f : flightList){
            if(f.getTimeofday().equals(timeOfDay)){
                result4.add(f);
            }
        }
        return result4;
    }
    
    public ArrayList<Flight> searchDate(String date){
        ArrayList<Flight> result5 = new ArrayList<>();
        for(Flight f : flightList){
            if(f.getDate().equals(date)){
                result5.add(f);
            }
        }
        return result5;
    }
}
