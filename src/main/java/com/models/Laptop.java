package com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lapId;
    private String lapDesc;

    public int getLapId() {
            return lapId;
    }
    public void setLapId(int lapId) {
        this.lapId = lapId;
    }
    public String getLapDesc() {
        return lapDesc;
    }
    public void setLapDesc(String lapDesc) {
        this.lapDesc = lapDesc;
    }
}
