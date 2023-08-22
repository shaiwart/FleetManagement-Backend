package com.example.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "Hubs")
public class Hubs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hubId;

    private String hubName;
    private String contactNumber;
    private String address;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cityId")
    @JsonIgnore
    private City city; 
    
    
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "airportId")
	@JsonIgnore
	private Airport airport;
    
    // = = = = = = = = = = = = = = = = = = 
    
    
    
//    @JsonManagedReference
    @OneToMany(mappedBy = "pickupHub")
//    @JoinColumn(name = "pickupHubId", referencedColumnName="hubId")
    private Set<Booking> bookingsPickup; 
    
//    @JsonManagedReference
    @OneToMany(mappedBy = "dropHub")
//    @JoinColumn(name = "dropHubId", referencedColumnName="hubId")
    private Set<Booking> bookingsDrop;

    
    
    
    
    
    
	public int getHubId() {
		return hubId;
	}

	public void setHubId(int hubId) {
		this.hubId = hubId;
	}

	public String getHubName() {
		return hubName;
	}

	public void setHubName(String hubName) {
		this.hubName = hubName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public Set<Booking> getBookingsPickup() {
		return bookingsPickup;
	}

	public void setBookingsPickup(Set<Booking> bookingsPickup) {
		this.bookingsPickup = bookingsPickup;
	}

	public Set<Booking> getBookingsDrop() {
		return bookingsDrop;
	}

	public void setBookingsDrop(Set<Booking> bookingsDrop) {
		this.bookingsDrop = bookingsDrop;
	} 
    
   
    
}