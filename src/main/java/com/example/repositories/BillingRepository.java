package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Billing;
import com.example.entities.Booking;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface BillingRepository extends JpaRepository<Billing, Integer>{

	
	@Query(value = "select * from billing where booking_id = :bookingId ORDER BY billing_id DESC limit 1", nativeQuery = true)
	public Billing getBillingByBookingId(@Param("bookingId") int bookingId); 


}
