package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Booking;
import com.example.entities.Car;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface BookingRepository extends JpaRepository <Booking, Integer>{
	
	
	@Query(value = "insert into booking  where hub_id = :hubId and category_id = :categoryId and availabiity = 1", nativeQuery = true)
	List<Car> getCarsByCategory(@Param("hubId") int hubId, @Param("categoryId") int categoryId);  
	
}