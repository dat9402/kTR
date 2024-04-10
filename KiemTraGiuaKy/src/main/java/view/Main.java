/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ManagerCar;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;
import model.ICar;

/**
 *
 * @author ADMIN
 */
public class Main {
 public static void main(String[] args) throws IOException {
     Scanner sc=new Scanner(System.in);
        ArrayList<ICar> arr = new ArrayList<>();
        ManagerCar mn = new ManagerCar();
        int choice;
        do {
            System.out.println("1. Read File");
            System.out.println("2. Add new car");
            System.out.println("3. Display car");
            System.out.println("4. Delete car");
            System.out.println("5. Update car");
            System.out.println("6. Write file");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:           
                    mn.readFile(arr);
                    break;
                case 2:
                    mn.AddNewCar(arr,choice);
                    break;
                case 3:                   
                    mn.display(arr);
                    break;
                case 4:               
                    mn.deleteCar(arr);
                    break;
                case 5:                
                    mn.updateCar(arr);
                    break;
                case 6:       
                    mn.writeFile(arr);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }
}
