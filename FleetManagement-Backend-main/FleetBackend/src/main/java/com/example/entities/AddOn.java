package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public  class AddOn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addOnId;
	private String addOnName;
	private double addOnRate;
	
	
	

}
