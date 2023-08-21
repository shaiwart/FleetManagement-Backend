package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.Hubs;

@Repository
@Transactional
public interface HubsRepository extends JpaRepository<Hubs, Integer> {
	
}