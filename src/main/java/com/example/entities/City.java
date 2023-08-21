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
    
    
    @OneToMany(mappedBy =  "city")
//    @JoinColumn(name = "customerCityId", referencedColumnName="cityId")
    private Set<Booking> bookings; 
    
//  @OneToMany(mappedBy =  "state") // cascade = CascadeType.ALL 
//  @JoinColumn(name = "customerStateId", referencedColumnName="stateId")
//  private Set<Booking> bookings; 
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cityId", referencedColumnName="cityId")
    private Set<Airport> airports;

	public int getCityId() {
		return cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
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