package uiz.ac.ma.idrissspring.controllers;

import uiz.ac.ma.idrissspring.models.Driver;
import uiz.ac.ma.idrissspring.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    // Endpoint to list all drivers
    @GetMapping("/drivers")
    public ResponseEntity<List<Driver>> getAllDrivers() {
        List<Driver> drivers = driverService.getAllDrivers();
        return ResponseEntity.ok(drivers);
    }

    // Endpoint to create a new driver
    @PostMapping("/drivers")
    public ResponseEntity<Driver> createDriver(@RequestBody Driver driver) {
        Driver newDriver = driverService.createDriver(driver);
        return ResponseEntity.status(HttpStatus.CREATED).body(newDriver);
    }
}

