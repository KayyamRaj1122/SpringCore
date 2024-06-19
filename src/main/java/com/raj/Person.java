package com.raj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Component

public class Person {
    private String name="raj";
    @Autowired
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }
}
