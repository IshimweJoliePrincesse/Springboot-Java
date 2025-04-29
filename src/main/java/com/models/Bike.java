package com.models;

import jakarta.persistence.DiscriminatorValue;

import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("bike")
public class Bike extends Vehicle{
    private boolean hasCarrier;

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }
    public boolean getHasCarrier() {
        return hasCarrier;
    }
}
