/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Car;
import model.ICar;
import model.Motor;
import model.Truck;

/**
 *
 * @author ADMIN
 */
public class ManagerCar {

    public static Scanner sc = new Scanner(System.in);

    public static void readFile(ArrayList<ICar> arr) throws IOException {
        System.out.println("Enter path: ");
        String path = sc.nextLine();
        File inFile = new File(path);

        FileReader fReader = null;
        try {
            fReader = new FileReader(inFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManagerCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader bReader = new BufferedReader(fReader);

        try {
            String line = bReader.readLine();
            while (line != null) {

                String[] part = line.split(",");
                String ID = part[0];
                String brand = part[1];
                String publishYear = part[2];
                double price = Double.parseDouble(part[3]);
                String color = part[4];
                ICar car = new ICar(ID, brand, publishYear, price, color);
                arr.add(car);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(0);
        } finally {
            fReader.close();
        }
    }

    public static void AddNewCar(ArrayList<ICar> arr, int choose) {
        System.out.println("Enter an ID: ");
        String ID = sc.nextLine();
        System.out.println("Enter a brand: ");
        String brand = sc.nextLine();
        System.out.println("Enter a publish Year: ");
        String publishYear = sc.nextLine();
        System.out.println("Enter a price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter a color: ");
        String color = sc.nextLine();

        if (choose == 1) {
            System.out.println("Enter a slot: ");
            int slots = Integer.parseInt(sc.nextLine());
            System.out.println("Enter an engineType: ");
            String engineType = sc.nextLine();
            ICar car = new Car(slots, engineType, ID, brand, publishYear, price, color);
            arr.add(car);
        } else if (choose == 2) {
            System.out.println("Enter a capacity: ");
            int capacity = Integer.parseInt(sc.nextLine());
            Motor motor = new Motor(capacity, ID, brand, publishYear, price, color);
            arr.add(motor);
        } else if (choose == 3) {
            System.out.println("Enter a load weight: ");
            int loadWeight = Integer.parseInt(sc.nextLine());
            Truck truck = new Truck(loadWeight, ID, brand, publishYear, price, color);
            arr.add(truck);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void display(ArrayList<ICar> arr) {
        for (ICar x : arr) {
            x.showInfo();
        }
    }
   public static void deleteCar(ArrayList<ICar> arr) {
        System.out.println("Enter an ID: ");
        String ID = sc.nextLine();
        
      
        for(ICar x: arr){
            if (x.getID().equals(ID)) { 
                arr.remove(x); 
                System.out.println("Car with ID " + ID + " has been deleted.");
                
            }
        }
       
        System.out.println("No car with ID " + ID + " found.");
    }
    public static ICar checkCar(ArrayList<ICar> arr, String id) {
        for (ICar x : arr) {
            if (x.getID().equals(id)) {
                return x;
            }
        }
        return null;
    }

    public static void updateCar(ArrayList<ICar> arr) {
        System.out.println("Enter an ID: ");
        String ID = sc.nextLine();
        ICar foundCar = checkCar(arr, ID);
        if (foundCar != null) {
            int choice;
            do {
                System.out.println("1. Update brand");
                System.out.println("2. Update publish Year ");
                System.out.println("3. Update price");
                System.out.println("4. Update color");
                System.out.println("5. Exit");
                System.out.println("Enter your choice: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter new brand: ");
                        String newBrand = sc.nextLine();
                        foundCar.setBrand(newBrand);
                        System.out.println("Brand updated successfully.");
                        break;
                    case 2:
                        System.out.println("Enter new publish year: ");
                        String newPublishYear = sc.nextLine();
                        foundCar.setPublishYear(newPublishYear);
                        System.out.println("Publish year updated successfully.");
                        break;
                    case 3:
                        System.out.println("Enter new price: ");
                        double newPrice = Double.parseDouble(sc.nextLine());
                        foundCar.setPrice(newPrice);
                        System.out.println("Price updated successfully.");
                        break;
                    case 4:
                        System.out.println("Enter new color: ");
                        String newColor = sc.nextLine();
                        foundCar.setColor(newColor);
                        System.out.println("Color updated successfully.");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 5);
        } else {
            System.out.println("Car not found.");
        }
    }
    public static void writeFile(ArrayList<ICar> arr) {
        System.out.println("Enter path: ");
        String path = sc.nextLine();
        File file = new File(path);
        try {
            FileWriter fWriter = new FileWriter(file);
            for (ICar car : arr) {
                fWriter.write(car.toString() + "\n");

            }
            fWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
