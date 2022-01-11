package model;

import java.util.ArrayList;

public class ParkingLot {
    private String id;
    private ArrayList<Floor> floors;

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "ParkingLot [floors=" + floors + ", id=" + id + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
