package com.example.services;

import java.util.Optional;

import com.example.entities.Booking;

public interface BookingService {

	
	void save(Booking booking);
	
	public Optional<Booking> getBookingByPhoneNumber(String phoneNumber); 
	
	public Booking getBookingByEmailId(String emailId);  
}
