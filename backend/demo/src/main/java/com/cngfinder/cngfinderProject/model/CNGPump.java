package com.cngfinder.cngfinderProject.model;



import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class CNGPump {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double latitude;

    private double longitude;

    private boolean availability;

    private int pressure;

    // Getters and Setters
}
