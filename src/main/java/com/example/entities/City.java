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
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
//    @JsonIgnore
    private State state;
    
    private String cityName;
   
    
    
//    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy =  "city")
//    @JoinColumn(name = "customerCityId", referencedColumnName="cityId")
    private Set<Booking> bookings; 
    
    
   

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

	public Set<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", state=" + state + ", cityName=" + cityName + ", bookings=" + bookings
				+ "]";
	}
    
    
    
}