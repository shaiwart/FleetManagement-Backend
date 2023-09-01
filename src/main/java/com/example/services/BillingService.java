package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entities.Billing;

public interface BillingService {

	

	public Billing getBillingByBookingId(int bookingId);

	void save(Billing billing);
	
	public  Billing getBillingByuserEmailId(String userEmailId);

	
	 
}
