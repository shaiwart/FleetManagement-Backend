package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Hubs;
import com.example.repositories.HubsRepository;

@Service
public class HubsServiceImpl implements HubsService {
    @Autowired
    private HubsRepository hubsRepository;

    @Override
    public List<Hubs> getAllHubs() {
        return hubsRepository.findAll();
    }

    @Override
    public Hubs getHubById(int hubId) {
        return hubsRepository.findById(hubId).orElse(null);
    }

	@Override
	public List<Hubs> getHubsByCityId(int cityId) {
		return hubsRepository.getHubsByCityId(cityId); 
	}

	@Override
	public Hubs getHubByAirportId(int airportId) {
		return hubsRepository.getHubsByAirportId(airportId); 
	}
}
