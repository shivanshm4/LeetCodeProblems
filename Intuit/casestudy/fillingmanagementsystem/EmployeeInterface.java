package Intuit.casestudy.fillingmanagementsystem;

public interface EmployeeInterface {
    FuelStation fuelStation1 = null, fuelStation2 = null;
    int lastFilledStation = 1;
    double timeToFill = 1000;

    public void fillFuel();

}