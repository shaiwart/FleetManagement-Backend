package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Car;
import com.example.services.CarManager;

@RestController
public class CarController {
	
	@Autowired
	private CarManager carManager; 
	
//	@GetMapping(value = "api/cars/{hub}/{type}")
//	public List<Car> getCarsByHubAndCategory(@PathVariable int hubId, @PathVariable int categoryId) {
//		
//		return carManager.getCarsByCategory(hubId, categoryId); 
//	}
	
	
	@GetMapping(value = "api/cars/{hubId}/{categoryId}")
	public List<Car> getCarsByHubAndCategory(@PathVariable int hubId, @PathVariable int categoryId) {
	    return carManager.getCarsByCategory(hubId, categoryId); 
	}


	
}
// 97b2ebfe-8319-4962-804c-37bd201eccef