package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Airport;
import com.example.entities.CarCategory;
import com.example.repositories.AirportRepository;
import com.example.repositories.CarCategoryRepository;

@Service
public class CarCategorySeviceImpl implements CarCategoryService{

	@Autowired
    private CarCategoryRepository carCategoryRepository;

    @Override
    public List<CarCategory> getAllCarCategories() {
        return carCategoryRepository.findAll();
    }

}
