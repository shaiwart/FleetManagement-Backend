package com.example.services;

import java.util.Optional;

import com.example.entities.Booking;
import com.example.entities.Hubs;

public interface BookingService {

	
	void save(Booking booking);
	
	public Optional<Booking> getBookingByPhoneNumber(String phoneNumber); 
	
	public Booking getBookingByEmailId(String emailId);  
	
	public Optional<Hubs> getById(int id); 
}
