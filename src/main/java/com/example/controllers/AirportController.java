package com.example.controllers;

import com.example.entities.Airport;
import com.example.services.AirportService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AirportController {

    @Autowired
    private AirportService airportService;

    // get all airport 
    @GetMapping("/api/airports")
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }
    
    // 
    @GetMapping("/api/airport/{airportId}")
    public Airport getAirportById(@PathVariable int airportId) {
    	return airportService.getAirportById(airportId);
    }

    // Other controller methods
}
