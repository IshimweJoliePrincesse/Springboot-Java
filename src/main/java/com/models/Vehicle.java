package com.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("vehicle_type")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vehicleId;
    private String manufacturer;

    public int getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
