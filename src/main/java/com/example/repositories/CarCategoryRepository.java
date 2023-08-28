package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.CarCategory;

@Repository
@Transactional
public interface CarCategoryRepository extends JpaRepository<CarCategory, Integer> {

}
