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

    
    // NO need -> can dump later => get all cities by stateId 
    @CrossOrigin
    @GetMapping("/api/cities/{stateId}")
    public List<City> getAllCities(@PathVariable int stateId) {
        return cityService.getAllCities(stateId);
    }
    
    
    // get hubs by city id 
    @GetMapping("/api/city/{cityId}")
    public City getCityById(@PathVariable int cityId) {
    	return cityService.getCityById(cityId);
    }

    
}
