/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tusiyu
 */
public class CarInformationList {
    
    private static CarInformationList carLists;
    public  ArrayList<Car> carList;
    //private ArrayList<Car> carLists;
    private CarInformationList(){
        
        carList = new ArrayList<Car>();
        
        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true);
        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "G1", "New York", true);
        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", true);
        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "", "Seattle", true);
        Car car8 = new Car(true, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true);
        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true);
        Car car10 = new Car(true, "GM", 2019, 1, 4, 10, "G3", "Austin", true);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        
    }

    public void setCarLists(CarInformationList carLists) {
        this.carLists = carLists;
    }
    
    public static CarInformationList getCarLists() {
        carLists = new CarInformationList();
        return carLists;
    }
    
    public Car addCar(){
        Car car = new Car();
        carList.add(car);
        return car;
    }
    public void deleteCar(Car car){
        carList.remove(car);
    }
    
    public ArrayList<Car> searchBrand(String brand){
        ArrayList<Car> carList2 = new ArrayList<>();
        for(Car car : this.carList){
            if(car.getBrand().equalsIgnoreCase(brand)){
                carList2.add(car);
            }
        }
        return carList2;
    }
    
    public ArrayList<Car> searchMyear(int myear){
        ArrayList<Car> carList2 = new ArrayList<>();
        for(Car car : this.carList){
            if(car.getManufactured_year()==myear){
                carList2.add(car);
            }
        }
        return carList2;
    }
    
    public ArrayList<Car> searchSeats(int minSeats,int maxSeats){
        ArrayList<Car> carList2 = new ArrayList<>();
        for(Car car : this.carList){
            if(car.getMin_seats()==minSeats&&car.getMax_seats()<=maxSeats){
                carList2.add(car);
            }
            
        }
        return carList2;
    }
    
    public ArrayList<Car> searchSerial(int serialNum){
        ArrayList<Car> carList2 = new ArrayList<>();
        for(Car car : this.carList){
            if(car.getSerial_num()==serialNum){
                carList2.add(car);
            }
            
        }
        return carList2;
    }
    
    public ArrayList<Car> searchModel(String model){
        ArrayList<Car> carList2 = new ArrayList<>();
        for(Car car : this.carList){
            if(car.getModel_num().equalsIgnoreCase(model)){
                carList2.add(car);
            }
        }
        return carList2;
    }
    
    public ArrayList<Car> searchAvail_city(String city){
        ArrayList<Car> carList2 = new ArrayList<>();
        for(Car car : this.carList){
            if(car.getAvailble_city().equalsIgnoreCase(city)){
                carList2.add(car);
            }
        }
        return carList2;
    }
    
    public ArrayList<Car> searchMC(Boolean mc){
        ArrayList<Car> carList2 = new ArrayList<>();
        for(Car car : this.carList){
            if(car.isMaintenance_certificate()==false){
                carList2.add(car);
            }
        }
        return carList2;
    }
    public ArrayList<Car> searchIsAvail(Boolean mc){
        ArrayList<Car> carList2 = new ArrayList<>();
        for(Car car : this.carList){
            if(car.isAvailable()==true){
                carList2.add(car);
            }
        }
        return carList2;
    }
}
