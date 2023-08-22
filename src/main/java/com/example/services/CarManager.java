package com.example.services;

import java.util.List;

import com.example.entities.Car;

public interface CarManager {
	List<Car> getCarsByCategory(int hubId, int categoryId); 

	public List<Car> getCarsByHub(int hubId); 
}
