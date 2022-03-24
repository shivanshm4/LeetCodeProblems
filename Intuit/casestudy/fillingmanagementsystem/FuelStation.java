package Intuit.casestudy.fillingmanagementsystem;

import java.util.PriorityQueue;
import java.util.Queue;

enum FuelStationType {
    PETROL,
    DIESEL
}

public class FuelStation implements FuelStationInterface{
    FuelStationType type;
    PriorityQueue<Vehicle> queue;
    Employee employee;
    
    FuelStation(String type){
        if(type.equals("Petrol")){
            this.type = FuelStationType.PETROL;
        } else {
            this.type = FuelStationType.DIESEL;
        }
        this.queue = new PriorityQueue<>(); 
    }
    public FuelStationType getType() {
        return type;
    }
    public void setType(String type) {
        if(type.equals("Petrol")){
            this.type = FuelStationType.PETROL;
        } else {
            this.type = FuelStationType.DIESEL;
        }
    }
    public Queue<Vehicle> getQueue() {
        return queue;
    }
    public void setQueue(PriorityQueue<Vehicle> queue) {
        this.queue = queue;
    }
    public void addVehicleToQueue(Vehicle vehicle){
        queue.add(vehicle);
        System.out.println(vehicle.type + " added!");
    }
    public void removeVehicleFromQueue(){
        System.out.println(this.queue.poll().type + " removed");
    }
}
