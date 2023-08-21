package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.State;

@Repository
@Transactional
public interface StateRepository extends JpaRepository<State, Integer> {
	// by inheritance many simple methods is present here from JpaRepository 
}