package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Car;
import com.example.services.CarManager;

@RestController
@CrossOrigin
public class CarController {
	
	@Autowired
	private CarManager carManager; 
	
	
	// FOR STAFF 
	// get cars by hubid & by cataegory which are vaialable  
	
	@GetMapping(value = "/api/cars/{hubId}/{categoryId}") 
	public List<Car> getCarsByHubAndCategory(@PathVariable int hubId, @PathVariable int categoryId) {
	    return carManager.getCarsByCategory(hubId, categoryId); 
	}
	
	// get all the cars present in a hub by hubId
	
	@GetMapping(value = "/api/cars/{hubId}")
	public List<Car> getCarsByHub(@PathVariable int hubId) {
	    return carManager.getCarsByHub(hubId); 
	}
	
	
}