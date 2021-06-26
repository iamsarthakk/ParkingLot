package com.sstack.Vehicle;

// Created Interface to make sure all services are loosely coupled with each other.
// All outsiders will contact this service via this interface only
// Achieved Runtime Polymorphism
public interface IVehicleService {
    boolean isValidVehicleRegisterationNumber(String number);
    Vehicle addVehicle(String vehicleRegisterationNumber);
    Vehicle getVehicle(String vehicleRegisterationNumber);
}
