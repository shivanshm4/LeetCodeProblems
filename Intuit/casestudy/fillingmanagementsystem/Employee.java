package Intuit.casestudy.fillingmanagementsystem;

import java.sql.Timestamp;

public class Employee implements EmployeeInterface{
    FuelStation fuelStation1, fuelStation2;
    int fillStation = 1;
    double timeToFill = 1000;

    public Employee(FuelStation fuelStation1, FuelStation fuelStation2, double timeToFill) {
        this.fuelStation1 = fuelStation1;
        this.fuelStation2 = fuelStation2;
        this.timeToFill = timeToFill;
    }

    public void fillFuel(){
        long timestamp = System.currentTimeMillis();
        //Check For ambulance
        if(!fuelStation1.queue.isEmpty()){
            if((fuelStation1.queue.peek().priority) == 2){
                fuelStation1.removeVehicleFromQueue();
                return;
            }
        } 
        if(!fuelStation2.queue.isEmpty()){
            if(fuelStation2.queue.peek().priority == 2){
                fuelStation2.removeVehicleFromQueue();
                return;
            }
        } 
        if(this.fillStation == 1){
            if(!fuelStation1.queue.isEmpty()){
                if(timestamp - fuelStation1.queue.peek().entryTime  > timeToFill){
                    fuelStation1.removeVehicleFromQueue();
                    this.fillStation = 2;
                }
            }
        } else {
            if(!fuelStation2.queue.isEmpty()){
                if(timestamp - fuelStation2.queue.peek().entryTime > timeToFill){
                    fuelStation2.removeVehicleFromQueue();
                    this.fillStation = 1;
                }
            }
        }
    }
}
