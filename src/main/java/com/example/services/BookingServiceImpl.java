package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

	
	@Override
	public Optional<Booking> getBookingByPhoneNumber(String phoneNumber) {
		
		int bookingId = bookingrepository.getBookingIdByPhoneNumber(phoneNumber); 
		
//		return bookingrepository.getBookingByPhoneNumber(phoneNumber); 
		return Optional.ofNullable(bookingrepository.findById(bookingId).orElse(null)); 
		
	}
	
	@Override 
	public Booking getBookingByEmailId(String emailId) {
		return bookingrepository.getBookingByEmailId(emailId); 
	}

	
}
