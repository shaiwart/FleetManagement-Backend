package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Car;

@Repository
public interface CarRepository extends JpaRepository <Car, Integer> {
	
	// get car by hubId and categoryName 
	
	@Query(value = "select * from car where hub_id = :hubId and category_id = :categoryId and availabiity = 1", nativeQuery = true)
	List<Car> getCarsByCategory(@Param("hubId") int hubId, @Param("categoryId") int categoryId);  
	
	
	@Query(value = "select * from car where hub_id = :hubId", nativeQuery = true) 
	public List<Car> getCarsByHub(@Param("hubId") int hubId); 
	
}


