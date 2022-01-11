import java.util.ArrayList;
import java.util.Scanner;

import model.Floor;
import model.ParkingLot;
import model.Slots;

public class ParkingLotSystem {
    
    final String[] type = { "TRUCK", "BIKE", "CAR" }; //must be used as enum
    ParkingLot parkingLot;

    void createParkingLot(String parkingLotID, int numberOfFloors, int numberOfSlotsPerFloor) {

        int i;
        i = 1;
        parkingLot = new ParkingLot();
        parkingLot.setId(parkingLotID);
        ArrayList<Floor> floors = new ArrayList<>();
        while (i <= numberOfFloors) {
            Floor floor = new Floor();
            ArrayList<Slots> slots = new ArrayList<>();
            floor.setFloorNumber(i);
            floor.setParkingLot(parkingLot);
            int j = 1;
            while (j <= numberOfSlotsPerFloor) {
                Slots slot = new Slots();
                slot.setFloor(floor);
                if (j == 1) {
                    slot.setType(type[0]);

                } else if (j == 2 || j == 3) {
                    slot.setType(type[1]);
                } else {
                    slot.setType(type[2]);
                }
                slot.setOccupied(false);
                slot.setSlotNumber(j);
                slot.setFloor(floor);
                slots.add(slot);
                j++;
            }
            floor.setSlots(slots);
            floor.setParkingLot(parkingLot);
            floors.add(floor);
            i++;
        }
        parkingLot.setFloors(floors);
        System.out.println(
                "Created parking lot with " + numberOfFloors + " floor(s) and " + numberOfSlotsPerFloor + " per floor");
    }

    void displayFreeCount(String type) {

        int count;
        switch (type) {
            case "CAR":
                for (Floor floor : parkingLot.getFloors()) {
                    count = 0;
                    for (Slots slot : floor.getSlots()) {
                        if (slot.getType().equals("CAR") && !slot.isOccupied()) {
                            count++;
                        }
                    }
                    System.out.println("No. of free slots for "+type+" on floor "+floor.getFloorNumber()+": "+count);
                }
                break;
            case "BIKE":
                for (Floor floor : parkingLot.getFloors()) {
                    count = 0;
                    for (Slots slot : floor.getSlots()) {
                        if (slot.getType().equals("BIKE") && !slot.isOccupied()) {
                            count++;
                        }
                    }
                    System.out.println("No. of free slots for "+type+" on floor "+floor.getFloorNumber()+": "+count);
                }
                break;
            case "TRUCK":
                for (Floor floor : parkingLot.getFloors()) {
                    count = 0;
                    for (Slots slot : floor.getSlots()) {
                        if (slot.getType().equals("TRUCK") && !slot.isOccupied()) {
                            count++;
                        }
                    }
                    System.out.println("No. of free slots for "+type+" on floor "+floor.getFloorNumber()+": "+count);
                }
                break;
        }

        
    }

    void displayOccupiedSlots(String type) {
        switch (type) {
            case "CAR":
                for (Floor floor : parkingLot.getFloors()) {
                    ArrayList<Slots> occupiedSlots = new ArrayList<>();
                    for (Slots slot : floor.getSlots()) {
                        if (slot.getType().equals("CAR") && slot.isOccupied()) {
                            occupiedSlots.add(slot);
                        }
                    }

                    System.out.print("occupied slots for "+type+" on floor "+floor.getFloorNumber()+": ");
                    for (Slots occupiedSlot: occupiedSlots)
                    System.out.print(occupiedSlot.getSlotNumber()+" ");
                    System.out.println();
                }
                break;
            case "BIKE":
                for (Floor floor : parkingLot.getFloors()) {
                    ArrayList<Slots> occupiedSlots = new ArrayList<>();
                    for (Slots slot : floor.getSlots()) {
                        if (slot.getType().equals("BIKE") && slot.isOccupied()) {
                            occupiedSlots.add(slot);
                        }
                    }
                    System.out.println("occupied slots for "+type+" on floor "+floor.getFloorNumber()+": ");
                    for (Slots occupiedSlot: occupiedSlots)
                    System.out.print(occupiedSlot.getSlotNumber()+" ");
                    System.out.println();
                }
                break;
            case "TRUCK":
                for (Floor floor : parkingLot.getFloors()) {
                    ArrayList<Slots> occupiedSlots = new ArrayList<>();
                    for (Slots slot : floor.getSlots()) {
                        if (slot.getType().equals("TRUCK") && slot.isOccupied()) {
                            occupiedSlots.add(slot);
                        }
                    }
                    System.out.println("occupied slots for "+type+" on floor "+floor.getFloorNumber()+": ");
                    for (Slots occupiedSlot: occupiedSlots)
                    System.out.print(occupiedSlot.getSlotNumber()+" ");
                    System.out.println();
                }
                break;
        }
    }

    void displayFreeSlots(String type) {
        switch (type) {
            case "CAR":
                for (Floor floor : parkingLot.getFloors()) {
                    ArrayList<Slots> freeSlots = new ArrayList<>();
                    for (Slots slot : floor.getSlots()) {
                        if (slot.getType().equals("CAR") && !slot.isOccupied()) {
                            freeSlots.add(slot);
                        }
                    }

                    System.out.print("Free slots for "+type+" on floor "+floor.getFloorNumber()+": ");
                    for (Slots freeSlot: freeSlots)
                    System.out.print(freeSlot.getSlotNumber()+", ");
                    System.out.println();
                }
                break;
            case "BIKE":
                for (Floor floor : parkingLot.getFloors()) {
                    ArrayList<Slots> freeSlots = new ArrayList<>();
                    for (Slots slot : floor.getSlots()) {
                        if (slot.getType().equals("BIKE") && !slot.isOccupied()) {
                            freeSlots.add(slot);
                        }
                    }
                    System.out.println("Free slots for "+type+" on floor "+floor.getFloorNumber()+": ");
                    for (Slots freeSlot: freeSlots)
                    System.out.print(freeSlot.getSlotNumber()+", ");
                    System.out.println();
                }
                break;
            case "TRUCK":
                for (Floor floor : parkingLot.getFloors()) {
                    ArrayList<Slots> freeSlots = new ArrayList<>();
                    for (Slots slot : floor.getSlots()) {
                        if (slot.getType().equals("TRUCK") && !slot.isOccupied()) {
                            freeSlots.add(slot);
                        }
                    }
                    System.out.println("Free slots for "+type+" on floor "+floor.getFloorNumber()+": ");
                    for (Slots freeSlot: freeSlots)
                    System.out.print(freeSlot.getSlotNumber()+", ");
                    System.out.println();
                }
                break;  
        }
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        while (!command.equals("exit")) {
            if (command.equals("create_parking_lot")) {
                String parkingLotID = sc.next();
                int numberOfFloors = sc.nextInt();
                int numberOfSlotsPerFloor = sc.nextInt();
                createParkingLot(parkingLotID, numberOfFloors, numberOfSlotsPerFloor);
            }

            if (command.equals("display")) {
                String parameter = sc.next();
                if (parameter.equals("free_count")) {
                    displayFreeCount(sc.next());

                } else if (parameter.equals("occupied_slots")) {
                    displayOccupiedSlots(sc.next());
                } else if(parameter.equals("free_slots")) {
                    displayFreeSlots(sc.next());
                }
            } //separation of classes for create and a class for displaying counts and slots
            command = sc.next();
        }
        sc.close();
    }

}
