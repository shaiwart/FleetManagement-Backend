package com.example.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Airport {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int airportId;
	
	private int airportCode;
	
	private String airportName;
	
	

    
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hubId")
	private Hubs hub;
	
	

	// FK-> state, city, hub-> one to one 
	
	
	
	
	
	
	
	
	public int getAirportId() {
		return airportId;
	}

	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}


	public Hubs getHub() {
		return hub;
	}

	public void setHub(Hubs hub) {
		this.hub = hub;
	}

	public int getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(int airportCode) {
		this.airportCode = airportCode;
	}

	
	
	
	
	
}