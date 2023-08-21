package com.example.entities;


import java.time.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Billing {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private @Getter @Setter int billingId;
	private @Getter @Setter String billingName;
	
	private @Getter @Setter double billAmount;
	
	private @Getter @Setter String fuelStatus;
	
	private @Getter @Setter LocalDate startDate;
	
	private @Getter @Setter LocalDate endDate;
	
	
	private @Getter @Setter String userEmailId;
	
	private @Getter @Setter String customerMobileNo;
	
	private @Getter @Setter String customerAadharNo;
	
	private @Getter @Setter String customerPassNo;
	
	@OneToOne
    @JoinColumn(name = "categoryId")
    private @Getter @Setter CarCategory carCategory;
	
	@OneToOne
    @JoinColumn(name = "carId")
    private @Getter @Setter Car car;
	
	@OneToOne
    @JoinColumn(name = "bookingId")
	private @Getter @Setter Booking booking;
	
	
	
	
	@OneToOne
    @JoinColumn(name = "pickupHubId")
	private @Getter @Setter Hubs hubPickup;
	
	@OneToOne
    @JoinColumn(name = "dropHubId")
	private @Getter @Setter Hubs hubDrop ;

	/*
	 * public int getBillingId() { return billingId; }
	 * 
	 * public void setBillingId(int billingId) { this.billingId = billingId; }
	 * 
	 * public String getBillingName() { return billingName; }
	 * 
	 * public void setBillingName(String billingName) { this.billingName =
	 * billingName; }
	 * 
	 * public double getBillAmount() { return billAmount; }
	 * 
	 * public void setBillAmount(double billAmount) { this.billAmount = billAmount;
	 * }
	 * 
	 * public String getFuelStatus() { return fuelStatus; }
	 * 
	 * public void setFuelStatus(String fuelStatus) { this.fuelStatus = fuelStatus;
	 * }
	 * 
	 * public LocalDate getStartDate() { return startDate; }
	 * 
	 * public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
	 * 
	 * public LocalDate getEndDate() { return endDate; }
	 * 
	 * public void setEndDate(LocalDate endDate) { this.endDate = endDate; }
	 * 
	 * public String getUserEmailId() { return userEmailId; }
	 * 
	 * public void setUserEmailId(String userEmailId) { this.userEmailId =
	 * userEmailId; }
	 * 
	 * public String getCustomerMobileNo() { return customerMobileNo; }
	 * 
	 * public void setCustomerMobileNo(String customerMobileNo) {
	 * this.customerMobileNo = customerMobileNo; }
	 * 
	 * public String getCustomerAadharNo() { return customerAadharNo; }
	 * 
	 * public void setCustomerAadharNo(String customerAadharNo) {
	 * this.customerAadharNo = customerAadharNo; }
	 * 
	 * public String getCustomerPassNo() { return customerPassNo; }
	 * 
	 * public void setCustomerPassNo(String customerPassNo) { this.customerPassNo =
	 * customerPassNo; }
	 * 
	 * public CarCategory getCarCategory() { return carCategory; }
	 * 
	 * public void setCarCategory(CarCategory carCategory) { this.carCategory =
	 * carCategory; }
	 * 
	 * public Car getCar() { return car; }
	 * 
	 * public void setCar(Car car) { this.car = car; }
	 * 
	 * public Booking getBooking() { return booking; }
	 * 
	 * public void setBooking(Booking booking) { this.booking = booking; }
	 * 
	 * public Hubs getHubPickup() { return hubPickup; }
	 * 
	 * public void setHubPickup(Hubs hubPickup) { this.hubPickup = hubPickup; }
	 * 
	 * public Hubs getHubDrop() { return hubDrop; }
	 * 
	 * public void setHubDrop(Hubs hubDrop) { this.hubDrop = hubDrop; }
	 */	
	
	
	
	
}