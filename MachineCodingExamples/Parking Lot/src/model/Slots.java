package model;
public class Slots {

    private String type;
    private Floor floor;
    private boolean isOccupied;
    private int slotNumber;

    public int getSlotNumber() {
        return slotNumber;
    }
    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Floor getFloor() {
        return floor;
    }
    public void setFloor(Floor floor) {
        this.floor = floor;
    }
    @Override
    public String toString() {
        return "Slots [floor=" + floor + ", type=" + type + "]";
    }
    
}
