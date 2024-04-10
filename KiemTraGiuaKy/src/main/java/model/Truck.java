/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Truck extends ICar{
     private int loadWeight;
      public Truck(int  loadWeight, String ID, String brand, String publishYear, double price, String color) {
        super(ID, brand, publishYear, price, color);
        this. loadWeight =  loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

   

    @Override
    public void showInfo() {
        System.out.println("Motor Information:");
        System.out.println("ID: " + getID());
        System.out.println("Brand: " + getBrand());
        System.out.println("Publish Year: " + getPublishYear());
        System.out.println("Price: " + getPrice());
        System.out.println("Color: " + getColor());
        System.out.println("Capacity: " +  loadWeight);
    }
}
