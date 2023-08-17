package com.example.services;

import java.util.List;

import com.example.entities.City;

public interface CityService {
    List<City> getAllCities();
    City getCityById(int cityId);
}
