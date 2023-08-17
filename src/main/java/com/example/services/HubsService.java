package com.example.services;

import java.util.List;

import com.example.entities.Hubs;

public interface HubsService {
    List<Hubs> getAllHubs();
    Hubs getHubById(int hubId);
}
