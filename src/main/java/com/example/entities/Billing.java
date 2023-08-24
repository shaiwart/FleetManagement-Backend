package com.example.entities;


import java.time.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
//    private CarCategory categoryId; 
	
	private int categoryId; 
	
	
	
	
	

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "carId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private Car car;
	
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "bookingId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private Booking booking;
	
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pickupHub_hubId", referencedColumnName = "hubId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Hubs pickupHub; 
	

	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "dropHub_hubId", referencedColumnName = "hubId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Hubs dropHub;

	public int getBillingId() {
		return billingId;
	}

	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}

	public String getBillingName() {
		return billingName;
	}

	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public String getFuelStatus() {
		return fuelStatus;
	}

	public void setFuelStatus(String fuelStatus) {
		this.fuelStatus = fuelStatus;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getCustomerMobileNo() {
		return customerMobileNo;
	}

	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	public String getCustomerAadharNo() {
		return customerAadharNo;
	}

	public void setCustomerAadharNo(String customerAadharNo) {
		this.customerAadharNo = customerAadharNo;
	}

	public String getCustomerPassNo() {
		return customerPassNo;
	}

	public void setCustomerPassNo(String customerPassNo) {
		this.customerPassNo = customerPassNo;
	}

	

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	

	public Hubs getPickupHub() {
		return pickupHub;
	}

	public void setPickupHub(Hubs pickupHub) {
		this.pickupHub = pickupHub;
	}

	public Hubs getDropHub() {
		return dropHub;
	}

	public void setDropHub(Hubs dropHub) {
		this.dropHub = dropHub;
	}

	

	@Override
	public String toString() {
		return "Billing [billingId=" + billingId + ", billingName=" + billingName + ", billAmount=" + billAmount
				+ ", fuelStatus=" + fuelStatus + ", startDate=" + startDate + ", endDate=" + endDate + ", userEmailId="
				+ userEmailId + ", customerMobileNo=" + customerMobileNo + ", customerAadharNo=" + customerAadharNo
				+ ", customerPassNo=" + customerPassNo + ", categoryId=" + categoryId + ", car=" + car + ", booking="
				+ booking + ", pickupHub=" + pickupHub + ", dropHub=" + dropHub + "]";
	}
	
}