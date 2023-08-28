package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // auto-increament key 
	private int carId;
	private String carName;
	private int carNumberplate;
	private int capacity;
	private String fuelType;
	private double milage;
	private String color;  
	private int availabiity;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
//    @JsonIgnore
    private CarCategory category;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "hubId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
//    @JsonIgnore
    private Hubs hubs;
	

	
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarNumberplate() {
		return carNumberplate;
	}
	public void setCarNumberplate(int carNumberplate) {
		this.carNumberplate = carNumberplate;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	
	public int getAvailabiity() {
		return availabiity;
	}
	public void setAvailabiity(int availabiity) {
		this.availabiity = availabiity;
	}
	
	
	
	
	
	
	
}
