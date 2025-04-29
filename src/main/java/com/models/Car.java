package com.models;

import jakarta.persistence.DiscriminatorValue;

import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("car")
public class Car extends Vehicle{

    private int numOfDoors;

    public int getNumOfDoors() {
        return numOfDoors;
    }
    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }
}
