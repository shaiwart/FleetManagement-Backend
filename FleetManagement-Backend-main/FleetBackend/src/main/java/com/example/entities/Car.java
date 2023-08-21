package com.example.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // auto-increament key 
	private @Getter @Setter int carId;
	private @Getter @Setter String carName;
	private @Getter @Setter int carNumberplate;
	private @Getter @Setter int capacity;
	private @Getter @Setter String fuelType;
	private @Getter @Setter double milage;
	private @Getter @Setter char color;
	private @Getter @Setter int availabiity;
	
	
	
	/*
	 * public int getCarId() { return carId; } public void setCarId(int carId) {
	 * this.carId = carId; } public String getCarName() { return carName; } public
	 * void setCarName(String carName) { this.carName = carName; } public int
	 * getCarNumberplate() { return carNumberplate; } public void
	 * setCarNumberplate(int carNumberplate) { this.carNumberplate = carNumberplate;
	 * } public int getCapacity() { return capacity; } public void setCapacity(int
	 * capacity) { this.capacity = capacity; } public String getFuelType() { return
	 * fuelType; } public void setFuelType(String fuelType) { this.fuelType =
	 * fuelType; } public double getMilage() { return milage; } public void
	 * setMilage(double milage) { this.milage = milage; } public char getColor() {
	 * return color; } public void setColor(char color) { this.color = color; }
	 * 
	 * public int getAvailabiity() { return availabiity; } public void
	 * setAvailabiity(int availabiity) { this.availabiity = availabiity; }
	 */	
	
	
	
	
	
	
}
