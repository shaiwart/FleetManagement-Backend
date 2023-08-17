package com.example.controllers;

import com.example.entities.City;
import com.example.services.CityService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    
    // NO need -> can dump later 
    @GetMapping("/api/cities")
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }
    
    
    // get hubs by city id 
    @GetMapping("/api/city/{cityId}")
    public City getCityById(@PathVariable int cityId) {
    	return cityService.getCityById(cityId);
    }

    // Other controller methods
}
