package com.example.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.entities.Hubs;

public interface HubsService {
    List<Hubs> getAllHubs();
    Hubs getHubById(int hubId); 
    
    
    List<Hubs> getHubsByCityId(int cityId); 
    
    public Hubs getHubByAirportId(int airportId);  
}
