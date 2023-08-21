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
    @GetMapping("/api/hubs")
    public List<Hubs> getAllHubs() {
        return hubsService.getAllHubs();
    }

    
    // Get hubs by cityId 
    @GetMapping("/api/hubs/{cityId}")
    public List<Hubs> getHubsByCityId(@PathVariable int cityId) {
    	return hubsService.getHubsByCityId(cityId); 
    }
    
    
    
    
    // ======= not required ========= //  
    
    // need update --> // need -> get all the cars from that hub 
    @GetMapping("/api/hub/{hubId}")
    public Hubs getHubById(@PathVariable int hubId) {
    	return hubsService.getHubById(hubId);
    }
}
