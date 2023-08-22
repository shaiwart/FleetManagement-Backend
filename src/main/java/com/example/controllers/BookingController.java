package com.example.controllers;

import com.example.entities.Airport;
import com.example.entities.Booking;
import com.example.entities.Hubs;
import com.example.services.AirportService;
import com.example.services.BookingService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookingController {

	@Autowired
    private BookingService bookingService; 
	
	
	
	// add record into booking table 
	@PostMapping("/api/addbooking")
	public void save(@RequestBody  Booking booking) {

		System.out.println("before"+ booking); 
		
		Hubs pHub = booking.getPickupHub();  
		Hubs dHub = booking.getDropHub(); 
		int pId = pHub.getHubId(); 
		int dId = dHub.getHubId(); 
		Optional<Hubs> ref1 = bookingService.getById(pId);
		Optional<Hubs> ref2 = bookingService.getById(dId); 
		
		booking.setPickupHub(ref1.get()); 
		booking.setDropHub(ref2.get()); 
		
		System.out.println(booking); 
		
		bookingService.save(booking);  
	}
	
	
	// get record from booking table BY PHONE NUMBER 
	@GetMapping("/api/booking/by-phone/{phoneNumber}")
	@ResponseBody
	public Optional<Booking> getBookingByPhoneNumber(@PathVariable String phoneNumber) { 
//		return bookingService.getBookingByPhoneNumber(phoneNumber); 
		var abc = bookingService.getBookingByPhoneNumber(phoneNumber); 
		
		return abc; 
	}
	
	
	// get record from booking table BY EMAIL ID 
	@GetMapping("/api/booking/by-email/{emailId}")
	public Optional<Booking> getBookingByEmailId(@PathVariable String emailId) { 
		return null;  
	}
	
}
