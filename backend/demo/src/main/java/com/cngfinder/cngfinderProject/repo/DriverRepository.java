package com.cngfinder.cngfinderProject.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cngfinder.cngfinderProject.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
	Optional<Driver> findByEmail(String email);

}
