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
	
	
	
	
	
//	@Modifying
//	@Query(value = "update tour set cost = :cost where t_id= :myid", nativeQuery = true)
//	void updatePrice(@Param("cost") double cost, @Param("myid") int id); 
//	
//	
//	List<Tour> findByType(String type); 
//	
//	
//	
//	@Modifying
//	@Query("update Tour t set t.name = :name where t.t_id = :id")
//	void updateName(@Param("name") String name, @Param("id") int id); 
}


