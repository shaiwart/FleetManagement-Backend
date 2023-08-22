package com.example.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
    private City city; 
    
    
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "airportId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private Airport airport;
    
    // = = = = = = = = = = = = = = = = = = 

    
    
    
    
    
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

	@Override
	public String toString() {
		return "Hubs [hubId=" + hubId + ", hubName=" + hubName + ", contactNumber=" + contactNumber + ", address="
				+ address + ", city=" + city + ", airport=" + airport + "]";
	}

	
    
   
    
}