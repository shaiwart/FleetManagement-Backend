package com.example.entities;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;

    private String cityName;

    // One city will have multiple hubs  
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cityId", referencedColumnName="cityId")
    private Set<Hubs> hubs; 
    
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cityId", referencedColumnName="cityId")
    private Set<Users> users; 
    
    
    
    
}