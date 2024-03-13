package com.example.tripapi.repositories;

import com.example.tripapi.models.Driver;
import com.example.tripapi.repositories.DriverRepository;
import com.example.tripapi.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tetetetete implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public List<Driver> getAllDrivers() {
        System.out.println("done_______________");
        return driverRepository.findAll();
    }

    @Override
    public Driver createDriver(Driver driver) {
        return driverRepository.save(driver);
    }
}
