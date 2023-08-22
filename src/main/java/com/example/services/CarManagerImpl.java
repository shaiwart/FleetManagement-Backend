package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Car;
import com.example.repositories.CarRepository;


@Service
public class CarManagerImpl implements CarManager {

	@Autowired 
	private CarRepository carRepo; 
	
	
	@Override
	public List<Car> getCarsByCategory(int hubId, int categoryId) {
		return carRepo.getCarsByCategory(hubId, categoryId); 
	}


	@Override
	public List<Car> getCarsByHub(int hubId) {
		return carRepo.getCarsByHub(hubId);
	}

}
