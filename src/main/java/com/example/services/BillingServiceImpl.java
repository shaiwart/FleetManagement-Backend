package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entities.Billing;
import com.example.entities.Booking;
import com.example.entities.Hubs;
import com.example.repositories.BookingRepository;
import com.example.repositories.HubsRepository;
import com.example.repositories.*;
@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepository;
	

	@Override
	public Billing getBillingByBookingId(int bookingId) {
		return billingRepository.getBillingByBookingId(bookingId);
	}

	@Override
	public void save(Billing billing) {
		billingRepository.save(billing);
	} 


	
}
