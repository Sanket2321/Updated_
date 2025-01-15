package com.cngfinder.cngfinderProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cngfinder.cngfinderProject.model.Driver;
import com.cngfinder.cngfinderProject.service.DriverService;
import com.cngfinder.cngfinderProject.dto.LoginRequest; // Import LoginRequest

@RestController
@RequestMapping("/api/drivers")
@CrossOrigin(origins = "http://localhost:5500") // Allow React frontend
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/register")
    public Driver registerDriver(@RequestBody Driver driver) {
        return driverService.registerDriver(driver);
    }

    @PostMapping("/login")
    public Driver loginDriver(@RequestBody LoginRequest request) {
        return driverService.loginDriver(request.getEmail(), request.getPassword());
    }
}
