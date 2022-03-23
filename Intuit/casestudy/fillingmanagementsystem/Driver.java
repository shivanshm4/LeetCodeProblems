package Intuit.casestudy.fillingmanagementsystem;

import java.util.Scanner;
import java.sql.*;

public class Driver {

    static Scanner sc = new Scanner(System.in);
    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public static void main(String[] args) {
        FillingManagementSystem fillingManagementSystem = FillingManagementSystem.getInstance();
        Employee employee1 = new Employee(fillingManagementSystem.petrolFuelStation1, fillingManagementSystem.petrolFuelStation2, 1000);
        Employee employee2 = new Employee(fillingManagementSystem.dieselFuelStation1, fillingManagementSystem.dieselFuelStation2, 1000);
        fillingManagementSystem.addEmployees(employee1);
        fillingManagementSystem.addEmployees(employee2);
        String[] userInput;
 //       fillingManagementSystem.startFuelFilling();
        do{
            userInput = sc.nextLine().split(" ");
            if ("add".equals(userInput[0])) {
                fillingManagementSystem.assignVehiclesToFuelStations(userInput);
            }
            if ("remove".equals(userInput[0])) {
                fillingManagementSystem.fillFuel();
            }
        }while (!"exit".equals(userInput[0])); 
    }

}