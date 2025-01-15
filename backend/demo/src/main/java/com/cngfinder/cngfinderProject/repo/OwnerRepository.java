package com.cngfinder.cngfinderProject.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cngfinder.cngfinderProject.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Optional<Owner> findByEmail(String email);
}
