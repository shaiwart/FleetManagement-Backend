package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Airport;
import com.example.entities.CarCategory;
import com.example.services.CarCategoryService;

@RestController
@CrossOrigin
public class CarCategoryController {
	
	@Autowired
	private CarCategoryService carCategoryService;

	
	@GetMapping("/api/car_category")
    public List<CarCategory> getAllCarCategories() {
        return carCategoryService.getAllCarCategories();
    }
}
