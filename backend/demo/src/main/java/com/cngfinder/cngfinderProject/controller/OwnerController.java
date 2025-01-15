package com.cngfinder.cngfinderProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cngfinder.cngfinderProject.model.Owner;
import com.cngfinder.cngfinderProject.service.OwnerService;

@RestController
@RequestMapping("/api/owners")
@CrossOrigin(origins = "http://localhost:3000")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @PostMapping("/register")
    public Owner registerOwner(@RequestBody Owner owner) {
        return ownerService.registerOwner(owner);
    }

    @PostMapping("/login")
    public Owner loginOwner(@RequestParam String email, @RequestParam String password) {
        return ownerService.loginOwner(email, password);
    }
}
