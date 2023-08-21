package com.example.entities;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter int cityId;

    private @Getter @Setter String cityName;

    // One city will have multiple hubs  
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cityId", referencedColumnName="cityId")
    private @Getter @Setter Set<Hubs> hubs; 
    
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cityId", referencedColumnName="cityId")
    private @Getter @Setter Set<Users> users; 
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerCityId", referencedColumnName="cityId")
    private @Getter @Setter Set<Booking> bookings; 
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cityId", referencedColumnName="cityId")
    private @Getter @Setter Set<Airport> airports;

	/*
	 * public int getCityId() { return cityId; }
	 * 
	 * public void setCityId(int cityId) { this.cityId = cityId; }
	 * 
	 * public String getCityName() { return cityName; }
	 * 
	 * public void setCityName(String cityName) { this.cityName = cityName; }
	 * 
	 * public Set<Hubs> getHubs() { return hubs; }
	 * 
	 * public void setHubs(Set<Hubs> hubs) { this.hubs = hubs; }
	 * 
	 * public Set<Users> getUsers() { return users; }
	 * 
	 * public void setUsers(Set<Users> users) { this.users = users; }
	 * 
	 * public Set<Booking> getBookings() { return bookings; }
	 * 
	 * public void setBookings(Set<Booking> bookings) { this.bookings = bookings; }
	 * 
	 * public Set<Airport> getAirports() { return airports; }
	 * 
	 * public void setAirports(Set<Airport> airports) { this.airports = airports; }
	 */ 
    
    
    
}