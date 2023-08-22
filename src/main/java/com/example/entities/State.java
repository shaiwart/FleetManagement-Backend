package com.example.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
@Entity
@Table
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // definition assigned to kanade 
    private int stateId; 
    private String stateName;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "stateId", referencedColumnName="stateId")
    private Set<Hubs> hubs; 
    
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "stateId", referencedColumnName="stateId")
    private Set<Users> users; 
    
    @OneToMany(mappedBy =  "state") 
    private Set<Booking> bookings; 
    
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "stateId", referencedColumnName="stateId")
    private Set<Airport> airports;


	public int getStateId() {
		return stateId;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Set<Hubs> getHubs() {
		return hubs;
	}


	public void setHubs(Set<Hubs> hubs) {
		this.hubs = hubs;
	}


	public Set<Users> getUsers() {
		return users;
	}


	public void setUsers(Set<Users> users) {
		this.users = users;
	}


	public Set<Booking> getBookings() {
		return bookings;
	}


	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}


	public Set<Airport> getAirports() {
		return airports;
	}


	public void setAirports(Set<Airport> airports) {
		this.airports = airports;
	} 
    
    
    
}