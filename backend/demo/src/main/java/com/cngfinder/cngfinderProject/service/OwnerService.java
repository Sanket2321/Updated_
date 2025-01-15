package com.cngfinder.cngfinderProject.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cngfinder.cngfinderProject.model.Owner;
import com.cngfinder.cngfinderProject.repo.OwnerRepository;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    public Owner registerOwner(Owner owner) {
        Optional<Owner> existingOwner = ownerRepository.findByEmail(owner.getEmail());
        if (existingOwner.isPresent()) {
            throw new RuntimeException("Owner with this email already exists");
        }
        return ownerRepository.save(owner);
    }

    public Owner loginOwner(String email, String password) {
        Owner owner = ownerRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Owner not found"));
        if (!owner.getPassword().equals(password)) {
            throw new RuntimeException("Invalid credentials");
        }
        return owner;
    }
}
