package com.example.controllers;

import com.example.entities.Airport;
import com.example.entities.Booking;
import com.example.services.AirportService;
import com.example.services.BookingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookingController {

	@Autowired
    private BookingService bookingService;
	
	@PostMapping("/api/addbooking")
	public void save(@RequestBody  Booking booking)
	{
		System.out.println(booking); 
		bookingService.save(booking); 
	}
}
