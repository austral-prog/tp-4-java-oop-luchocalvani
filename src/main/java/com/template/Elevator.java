package com.template;

public class Elevator {
    int min;
    int max;
    int capacity;
    private int currentFloor;
    private int currentPassenger;

    public Elevator(int min, int max, int capacity) {
        this.min = min;
        this.max = max;
        this.capacity = capacity;
    }

    public void moveToFloor(int floor){
        if (floor >= min && floor <= max){
            currentFloor = floor;
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void addPassenger(){
        if (currentPassenger < capacity){
            currentPassenger += 1;
        }
    }

    public int getPassengerCount() {
        return currentPassenger;
    }

    public void removePassenger(){
        if (currentPassenger > 0){
            currentPassenger -= 1;
        }
    }



    // Implement this class by observing the tests in this repo. From those you will be able
    // to pick what the constructors params are, what the methods are and what they should do.


}
