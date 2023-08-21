package com.example.entities;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table
@Data
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter int stateId;
    private @Getter @Setter String stateName;
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_Id", referencedColumnName="stateId")
    private @Getter @Setter Set<City> cities; 
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stateId", referencedColumnName="stateId")
    private @Getter @Setter Set<Hubs> hubs; 
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stateId", referencedColumnName="stateId")
    private @Getter @Setter Set<Users> users; 
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerStateId", referencedColumnName="stateId")
    private @Getter @Setter Set<Booking> bookings; 
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stateId", referencedColumnName="stateId")
    private @Getter @Setter Set<Airport> airports;


	/*
	 * public int getStateId() { return stateId; }
	 * 
	 * 
	 * public void setStateId(int stateId) { this.stateId = stateId; }
	 * 
	 * 
	 * public String getStateName() { return stateName; }
	 * 
	 * 
	 * public void setStateName(String stateName) { this.stateName = stateName; }
	 * 
	 * 
	 * public Set<City> getCities() { return cities; }
	 * 
	 * 
	 * public void setCities(Set<City> cities) { this.cities = cities; }
	 * 
	 * 
	 * public Set<Hubs> getHubs() { return hubs; }
	 * 
	 * 
	 * public void setHubs(Set<Hubs> hubs) { this.hubs = hubs; }
	 * 
	 * 
	 * public Set<Users> getUsers() { return users; }
	 * 
	 * 
	 * public void setUsers(Set<Users> users) { this.users = users; }
	 * 
	 * 
	 * public Set<Booking> getBookings() { return bookings; }
	 * 
	 * 
	 * public void setBookings(Set<Booking> bookings) { this.bookings = bookings; }
	 * 
	 * 
	 * public Set<Airport> getAirports() { return airports; }
	 * 
	 * 
	 * public void setAirports(Set<Airport> airports) { this.airports = airports; }
	 */ 
    
    
    
}