package com.example.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.entities.Car;
import com.example.entities.City;

public interface CityService {
    
	List<City> getAllCities(int stateId); 
    
    City getCityById(int cityId); 
   
}
