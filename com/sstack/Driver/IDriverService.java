package com.sstack.Driver;

import com.sstack.Vehicle.Vehicle;

// Created Interface to make sure all services are loosely coupled with each other.
// All outsiders will contact this service via this interface only
// Achieved Runtime Polymorphism
public interface IDriverService {
    Driver addDriver(Integer age, Vehicle vehicle);
    Driver getDriver(Integer age);
    void printAllVehicles(Integer age);
}
