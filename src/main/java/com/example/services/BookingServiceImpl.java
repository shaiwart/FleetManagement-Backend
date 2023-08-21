package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Booking;
import com.example.repositories.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingRepository bookingrepository;

	@Override
	public void save(Booking booking) {
		
		bookingrepository.save(booking);
		
	}

	
}
