package com.example.controllers;

import com.example.entities.Billing;
import com.example.entities.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.services.*;

@RestController
@CrossOrigin
public class BillingController {

	@Autowired
    private  BillingService billingService;

    
    // add a record in billing table 
	@CrossOrigin
    @PostMapping("/api/addbilling")
    public void save(@RequestBody Billing billing)
    {
    	billingService.save(billing);
    }
    
    // get a single billing record by bookingId 
	@CrossOrigin
    @GetMapping("/api/billing/by-bookingid/{bookingId}") 
	public Billing getBillingByBookingId(@PathVariable int bookingId) { 
		return billingService.getBillingByBookingId(bookingId); 	
	}
	
    
	
	@PutMapping("/api/updatebilling/{userEmailId}")
    public ResponseEntity<String> updateBillingByuserEmailId(@PathVariable String userEmailId, @RequestBody Billing updatedBilling) {
        try {
            Billing existingBilling = billingService.getBillingByuserEmailId(userEmailId); 
            System.out.println(existingBilling); 
            if (existingBilling != null) {
                // Update the desired fields in the existingBilling object
                existingBilling.setFuelStatus(updatedBilling.getFuelStatus());
                existingBilling.setBillAmount(updatedBilling.getBillAmount());
                existingBilling.setEndDate(updatedBilling.getEndDate());

                billingService.save(existingBilling);
                return ResponseEntity.ok("Billing information updated successfully.");
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error updating billing information.");
        }
    }
    // You can add more controller methods as needed
}