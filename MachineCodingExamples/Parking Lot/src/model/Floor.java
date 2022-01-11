package model;

import java.util.ArrayList;

public class Floor {

    private int floorNumber;
    private ParkingLot parkingLot;
    private ArrayList<Slots> slots;
    public int getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public ParkingLot getParkingLot() {
        return parkingLot;
    }
    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
    public ArrayList<Slots> getSlots() {
        return slots;
    }
    public void setSlots(ArrayList<Slots> slots) {
        this.slots = slots;
    }
    @Override
    public String toString() {
        return "Floor [floorNumber=" + floorNumber + ", parkingLot=" + parkingLot + ", slots=" + slots + "]";
    }
    
    
}
