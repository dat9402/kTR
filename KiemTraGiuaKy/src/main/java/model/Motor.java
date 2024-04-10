/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Motor extends ICar {
    private int capacity;

    public Motor(int capacity, String ID, String brand, String publishYear, double price, String color) {
        super(ID, brand, publishYear, price, color);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void showInfo() {
        System.out.println("Motor Information:");
        System.out.println("ID: " + getID());
        System.out.println("Brand: " + getBrand());
        System.out.println("Publish Year: " + getPublishYear());
        System.out.println("Price: " + getPrice());
        System.out.println("Color: " + getColor());
        System.out.println("Capacity: " + capacity);
    }
}

