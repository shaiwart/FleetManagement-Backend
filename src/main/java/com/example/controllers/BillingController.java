package com.example.controllers;

import com.example.entities.Billing;
import com.example.entities.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.services.*;

@RestController
@CrossOrigin
public class BillingController {

	@Autowired
    private  BillingService billingService;

    
    // add a record in billing table 
    @PostMapping("/api/addbilling")
    public void save(@RequestBody Billing billing)
    {
    	billingService.save(billing);
    }
    
    // get a single billing record by bookingId 
    @GetMapping("/api/billing/by-bookingid/{bookingId}") 
	public Billing getBillingByBookingId(@PathVariable int bookingId) { 
		return billingService.getBillingByBookingId(bookingId); 	
	}
    
    // You can add more controller methods as needed
}
