/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author jasper
 */
public class CarParameter {
    private String brand;
    private String country ;
    private String wheelBase;
    private String trunkVolume;
    private String seatNumber;
    private String color;
    private String model;
    private String serialNumber;
    private String dimensions;
    private String dateOfManufacture;
    private String roz;//fuel
    private String price;
    private String weight;
    private String mgc;//Min. ground clearance
    private String fuelConsumption;//100 km fuel consumption
    
    private ImageIcon g;
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWheelBase() {
        return wheelBase;
    }

    public void setWheelBase(String wheelBase) {
        this.wheelBase = wheelBase;
    }

    public String getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(String trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getRoz() {
        return roz;
    }

    public void setRoz(String roz) {
        this.roz = roz;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMgc() {
        return mgc;
    }

    public void setMgc(String mgc) {
        this.mgc = mgc;
    }

    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public ImageIcon getG() {
        return g;
    }

    public void setG(ImageIcon g) {
        this.g = g;
    }

    
    
   
    
}
