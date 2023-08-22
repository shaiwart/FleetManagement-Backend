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
	
	// will give latest record of a user 
	@Query(value = "select * from booking where mobile_number = :phoneNumber order by booking_date_and_time DESC limit 1;", nativeQuery = true)
	public Booking getBookingByPhoneNumber(@Param ("phoneNumber") String phoneNumber); 
	
	// will give latest record of a user 
	@Query(value = "select * from booking where email_id = :emailId order by booking_date_and_time DESC limit 1;", nativeQuery = true) 
	public Booking getBookingByEmailId(@Param ("emailId") String emailId); 
	
	
//	@Query(value = "select booking_id from booking where mobile_number = :phoneNumber order by booking_date_and_time DESC limit 1;", nativeQuery = true) 
//	public int getBookingIdByPhoneNumber(String phoneNumber); 
	
	
}