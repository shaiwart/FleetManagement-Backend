package com.example.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "stateId")
    @JsonIgnore
    private State state;
    
    private String cityName;
   
    
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "cityId", referencedColumnName="cityId")
    private Set<Users> users; 
    
    
//    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy =  "city")
//    @JoinColumn(name = "customerCityId", referencedColumnName="cityId")
    private Set<Booking> bookings; 
    
//  @OneToMany(mappedBy =  "state") // cascade = CascadeType.ALL 
//  @JoinColumn(name = "customerStateId", referencedColumnName="stateId")
//  private Set<Booking> bookings; 
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "cityId", referencedColumnName="cityId")
    private Set<Airport> airports;
    
    
   

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCityId() {
		return cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
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