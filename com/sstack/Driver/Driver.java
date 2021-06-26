package com.sstack.Driver;

import com.sstack.Vehicle.Vehicle;

import java.util.Set;

// Driver entity
public class Driver {

    //Since there is no other info, take age as primary key
    private Integer age;

    // One To Many Mapping with Vehicle class, it stores number of vehicles owned by the drivers with this age.
    private Set<Vehicle> vehiclesOwned;

    // We can flxibly include additional data about driver as shown below 
    private String name;
    private String address;
    private String licenseNumber;
    private String aadhaarNumber;
    // other details of driver, etc


    public Driver(Integer age) {
        this.age = age;
    }

// getter and setters to achieve encapsulation & data abstraction
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<Vehicle> getVehiclesOwned() {
        return vehiclesOwned;
    }

    public void setVehiclesOwned(Set<Vehicle> vehiclesOwned) {
        this.vehiclesOwned = vehiclesOwned;
    }
}
