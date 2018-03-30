package com.oop;

/**
 * Created by student on 30.03.2018.
 */
public class RepairService {

    public void paintBike(Bike bike, String colour) {
        bike.setColour(colour);
    }

    public void repairBike(Bike bike) {
        System.out.println(bike.getModel() + " was repaired");
    }

    public int testDrive(Bike bike) {
        return bike.getSpeed();
    }

}
