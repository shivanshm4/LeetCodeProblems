package Intuit.casestudy.fillingmanagementsystem;

import java.util.PriorityQueue;
import java.util.Queue;

public interface FuelStationInterface {
    public FuelStationType getType();
    public void setType(String type);
    public Queue<Vehicle> getQueue();
    public void setQueue(PriorityQueue<Vehicle> queue);
    public void addVehicleToQueue(Vehicle vehicle);
    public void removeVehicleFromQueue();
}
