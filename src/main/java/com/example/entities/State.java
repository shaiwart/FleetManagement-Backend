package com.example.entities;

import java.util.Set;

import jakarta.persistence.*;
@Entity
@Table
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stateId;
    private String stateName;
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_Id", referencedColumnName="stateId")
    private Set<City> cities; 
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stateId", referencedColumnName="stateId")
    private Set<Hubs> hubs; 
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stateId", referencedColumnName="stateId")
    private Set<Users> users; 
    
    
}