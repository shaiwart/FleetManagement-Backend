package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.Hubs;

@Repository
@Transactional
public interface HubsRepository extends JpaRepository<Hubs, Integer> {
	
	@Query(value = "select * from hubs where city_id = :cityId", nativeQuery = true) 
	public List<Hubs> getHubsByCityId(@Param ("cityId") int cityId); 
	
	@Query(value = "select * from hubs where airport_id = :airportId", nativeQuery = true)
	public Hubs getHubsByAirportId(@Param ("airportId") int airportId);  
}