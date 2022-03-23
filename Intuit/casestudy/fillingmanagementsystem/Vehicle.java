package Intuit.casestudy.fillingmanagementsystem;

public class Vehicle implements Comparable<Vehicle>, VehicleInterface {
    
    int priority;
    String type;
    long entryTime;

    public Vehicle(String type, int priority, long entryTime){
        this.type = type;
        this.priority = priority;
        this.entryTime =  entryTime;
    }

    public int compareTo(Vehicle vehicle) {  
        if(priority<vehicle.priority){  
            return 1;  
        }else if(priority>vehicle.priority){  
            return -1;  
        }else{  
        return 0;  
        }  
    }  
}
