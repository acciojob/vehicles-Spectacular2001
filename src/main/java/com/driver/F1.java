package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "F1", 2); // Call Car constructor
    }

    public void accelerate(int rate) {
        int newSpeed = super.getCurrentSpeed() + rate; // Call from parent class
        int newGear = 1;

        if (newSpeed == 0) {
            newGear = 1;
            stop();  // Call stop from Vehicle class
        } else if (newSpeed <= 50) {
            newGear = 1;
        } else if (newSpeed <= 100) {
            newGear = 2;
        } else if (newSpeed <= 150) {
            newGear = 3;
        } else if (newSpeed <= 200) {
            newGear = 4;
        } else if (newSpeed <= 250) {
            newGear = 5;
        } else {
            newGear = 6;
        }

        changeGear(newGear); // Update gear
        changeSpeed(newSpeed, super.getCurrentDirection()); // Update speed and direction
    }
}
