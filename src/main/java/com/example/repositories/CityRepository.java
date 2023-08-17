package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.City;

@Repository
@Transactional
public interface CityRepository extends JpaRepository<City, Integer> {
	
}