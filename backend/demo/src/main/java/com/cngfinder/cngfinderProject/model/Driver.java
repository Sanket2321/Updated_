package com.cngfinder.cngfinderProject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
	
	private String email;

	private String password;


	private String phone;


	private String carBrand;

	private int maxCapacity;

	

	// Getters and Setters
}
