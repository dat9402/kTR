/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class ICar {
    private String ID;
    private String brand;
    private String publishYear;
    private double price;
    private String color;
    
    
    public ICar(String ID, String brand, String publishYear, double price, String color) {
        this.ID = ID;
        this.brand = brand;
        this.publishYear = publishYear;
        this.price = price;
        this.color = color;
    }

    public String getID() {
        return ID;
    }

    public String getBrand() {
        return brand;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    
  
    public void showInfo() {
       
    }
}
