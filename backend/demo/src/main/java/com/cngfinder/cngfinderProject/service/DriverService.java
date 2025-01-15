package com.cngfinder.cngfinderProject.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cngfinder.cngfinderProject.model.Driver;
import com.cngfinder.cngfinderProject.repo.DriverRepository;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public Driver registerDriver(Driver driver) {
        Optional<Driver> existingDriver = driverRepository.findByEmail(driver.getEmail());
        if (existingDriver.isPresent()) {
            throw new RuntimeException("Driver with this email already exists");
        }
        return driverRepository.save(driver);
    }

    public Driver loginDriver(String email, String password) {
        Driver driver = driverRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Driver not found"));
        if (!driver.getPassword().equals(password)) {
            throw new RuntimeException("Invalid credentials");
        }
        return driver;
    }
}
