package com.example.autotrip.services;

import com.example.autotrip.models.Driver;

import java.util.List;

public interface DriverService {

    // Method to retrieve all drivers
    List<Driver> getAllDrivers();

    // Method to create a new driver
    Driver createDriver(Driver driver);
}