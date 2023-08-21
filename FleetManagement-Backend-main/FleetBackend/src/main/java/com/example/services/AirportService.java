package com.example.services;

import java.util.List;

import com.example.entities.Airport;

public interface AirportService {
    List<Airport> getAllAirports();
    Airport getAirportById(int airportId);
}