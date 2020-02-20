/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kasai
 */
public class Product {
    private int id;
    private int minPrice;
    private int maxPrice;
    private int targetPrice;
    private List<Order> orders;

    public Product(int id, int minPrice, int maxPrice, int targetPrice) {
        this.id = id;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.targetPrice = targetPrice;
        this.orders = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    
    @Override
    public String toString() {
        return "Product{" + "id = " + id + ", minPrice = " + minPrice + ", maxPrice = " + maxPrice + ", targetPrice = " + targetPrice + ", no. of orders = " + orders.size() +'}';
    }
    
}
