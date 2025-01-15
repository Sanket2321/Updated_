package com.cngfinder.cngfinderProject.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cngfinder.cngfinderProject.model.CNGPump;
import com.cngfinder.cngfinderProject.repo.CNGPumpRepository;

@Service
public class CNGPumpService {

    @Autowired
    private CNGPumpRepository cngPumpRepository;

    public List<CNGPump> getAllPumps() {
        return cngPumpRepository.findAll();
    }
}
