package com.example.controllers;

import com.example.entities.Hubs;
import com.example.services.HubsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HubsController {

    @Autowired
    private HubsService hubsService;

    
    // Get all the hubs 
    @CrossOrigin(origins = "*")
    @GetMapping("/api/hubs")
    public List<Hubs> getAllHubs() {
        return hubsService.getAllHubs();
    }

    
    // Get hubs by cityId 
    @CrossOrigin(origins = "*")
    @GetMapping("/api/hubs/{cityId}")
    public List<Hubs> getHubsByCityId(@PathVariable int cityId) {
    	return hubsService.getHubsByCityId(cityId); 
    }
    
    // get one hub by airportId 
    @CrossOrigin
    @GetMapping("/api/hub/{airportId}")
    public Hubs getHubByAirportId(@PathVariable int airportId) {
    	return hubsService.getHubByAirportId(airportId); 
    }
    
    
    
}
