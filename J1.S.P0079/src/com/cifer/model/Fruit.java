/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cifer.model;

/**
 *
 * @author Cifer
 */
public class Fruit {

    private int id;
    private String name;
    private double price;
    private int quantity;
    private String origin; //where the fruit is plained

    public Fruit(int id, String name, double price, int quantity, String origin) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public void shoppingList() {
        System.out.printf("%10d|%10s|%10s|%10f\n", id, name, origin, price);
    }

    @Override
    public String toString() {
        return "Fruit{" + "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", origin=" + origin + '}';
    }
    
}
