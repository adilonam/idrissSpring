package uiz.ac.ma.idrissspring.services;

import uiz.ac.ma.idrissspring.models.Driver;
import uiz.ac.ma.idrissspring.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {

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
