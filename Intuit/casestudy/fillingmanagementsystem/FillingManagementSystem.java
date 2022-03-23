package Intuit.casestudy.fillingmanagementsystem;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class FillingManagementSystem implements FillingManageSystemInterface{

    private static FillingManagementSystem fillingManagementSystem;
    int addPetrolFlag, addDieselFlag;
    int removePetrolFlag, removeDieselFlag;
    FuelStation petrolFuelStation1;
    FuelStation petrolFuelStation2;
    FuelStation dieselFuelStation1;
    FuelStation dieselFuelStation2;
    List<Employee> employeesList;

    private FillingManagementSystem() {
        this.petrolFuelStation1 = new FuelStation("Petrol");
        this.petrolFuelStation2 = new FuelStation("Petrol");
        this.dieselFuelStation1 = new FuelStation("Diesel");
        this.dieselFuelStation2 = new FuelStation("Diesel");
        this.employeesList = new ArrayList<>();
        this.addPetrolFlag = this.addDieselFlag = 1;
        this.removePetrolFlag = this.removeDieselFlag = 1;
    }

    public static FillingManagementSystem getInstance() {
        if (fillingManagementSystem == null) {
            fillingManagementSystem = new FillingManagementSystem();
        }
        return fillingManagementSystem;
    }

    public void assignVehiclesToFuelStations(String[] userInput) {
        long timestamp = System.currentTimeMillis();;
        if ("ambulance".equals(userInput[2].toLowerCase())) {
            Vehicle newVehicle = new Vehicle("ambulance", 2, timestamp);
            if ("petrol".equals(userInput[3]) && this.addPetrolFlag == 1) {
                fillingManagementSystem.petrolFuelStation1.addVehicleToQueue(newVehicle);
                this.addPetrolFlag = 2;
            } else if ("petrol".equals(userInput[3]) && this.addPetrolFlag == 2) {
                fillingManagementSystem.petrolFuelStation2.addVehicleToQueue(newVehicle);
                this.addPetrolFlag = 1;
            } else if ("diesel".equals(userInput[3]) && this.addDieselFlag == 1) {
                fillingManagementSystem.dieselFuelStation1.addVehicleToQueue(newVehicle);
                this.addDieselFlag = 2;
            } else if ("diesel".equals(userInput[3]) && this.addDieselFlag == 2) {
                fillingManagementSystem.dieselFuelStation2.addVehicleToQueue(newVehicle);
                this.addDieselFlag = 1;
            }
        } else {
            Vehicle newVehicle = new Vehicle(userInput[2], 1, timestamp);
            if ("petrol".equals(userInput[3]) && addPetrolFlag == 1) {
                fillingManagementSystem.petrolFuelStation1.addVehicleToQueue(newVehicle);
                addPetrolFlag = 2;
            } else if ("petrol".equals(userInput[3]) && addPetrolFlag == 2) {
                fillingManagementSystem.petrolFuelStation2.addVehicleToQueue(newVehicle);
                addPetrolFlag = 1;
            } else if ("diesel".equals(userInput[3]) && addDieselFlag == 1) {
                fillingManagementSystem.dieselFuelStation1.addVehicleToQueue(newVehicle);
                addDieselFlag = 2;
            } else if ("diesel".equals(userInput[3]) && addDieselFlag == 2) {
                fillingManagementSystem.dieselFuelStation2.addVehicleToQueue(newVehicle);
                addDieselFlag = 1;
            }
        }
    }


    public void addEmployees(Employee employee){
        this.employeesList.add(employee);
    }

    // public void startFuelFilling(){
    //     new Thread(this::fillFuel).start();
    // }

    public void fillFuel(){
        for(Employee e : this.employeesList){
            e.fillFuel();
        }
    }
}


//  fillingmanagementsystem.com/vehicle/ =>POST
//  fillingmanagementsystem.com/vehicle/ =>PUT 
//                             /employee/ =>GET
//                             /employee/ =>POST
//                             /fuelstation/ =>POST
//                             /fuelstation/ =>GET