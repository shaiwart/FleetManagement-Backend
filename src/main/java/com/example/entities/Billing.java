package com.example.entities;


import java.time.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Billing {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int billingId;
	private String billingName;
	
	private double billAmount;
	
	private String fuelStatus;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	
	private String userEmailId;
	
	private String customerMobileNo;
	
	private String customerAadharNo;
	
	private String customerPassNo;
	
	@OneToOne
    @JoinColumn(name = "categoryId")
    private CarCategory carCategory;
	
	@OneToOne
    @JoinColumn(name = "carId")
    private Car car;
	
	@OneToOne
    @JoinColumn(name = "bookingId")
	private Booking booking;
	
	
	
	
	@OneToOne
    @JoinColumn(name = "pickupHubId")
	private Hubs hubPickup;
	
	@OneToOne
    @JoinColumn(name = "dropHubId")
	private Hubs hubDrop ;
		
	
}