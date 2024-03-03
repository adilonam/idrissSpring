package com.example.autotrip.services;

import com.example.autotrip.models.Driver;
import com.example.autotrip.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Driver createDriver(Driver driver) {
        return driverRepository.save(driver);
    }
}
