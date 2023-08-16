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
	
	
	

}
