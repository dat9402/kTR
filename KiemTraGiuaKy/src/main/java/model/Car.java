/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Car extends ICar {
    private int slots;
    private String engineType;

    public Car(int slots, String engineType, String ID, String brand, String publishYear, double price, String color) {
        super(ID, brand, publishYear, price, color);
        this.slots = slots;
        this.engineType = engineType;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void showInfo() {
        System.out.println("Car Information:");
        System.out.println("ID: " + getID());
        System.out.println("Brand: " + getBrand());
        System.out.println("Publish Year: " + getPublishYear());
        System.out.println("Price: " + getPrice());
        System.out.println("Color: " + getColor());
        System.out.println("Slots: " + slots);
        System.out.println("Engine Type: " + engineType);
    }
}
