package com.raj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name="Honda";
    @Autowired
    private Vehicleservices vehser;

    public Vehicleservices getVehser() {
        return vehser;
    }

    public void setVehser(Vehicleservices vehser) {
        this.vehser = vehser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
