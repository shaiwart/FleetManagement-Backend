package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class AddOn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addOnId;
	private String addOnName;
	private double addOnRate;
	
	
	
	
	public int getAddOnId() {
		return addOnId;
	}
	public void setAddOnId(int addOnId) {
		this.addOnId = addOnId;
	}
	public String getAddOnName() {
		return addOnName;
	}
	public void setAddOnName(String addOnName) {
		this.addOnName = addOnName;
	}
	public double getAddOnRate() {
		return addOnRate;
	}
	public void setAddOnRate(double addOnRate) {
		this.addOnRate = addOnRate;
	}
	
	
	

}
