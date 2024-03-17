package uiz.ac.ma.idrissspring.services;

import uiz.ac.ma.idrissspring.models.Driver;

import java.util.List;

public interface DriverService {

    // Method to retrieve all drivers
    List<Driver> getAllDrivers();

    // Method to create a new driver
    Driver createDriver(Driver driver);
}