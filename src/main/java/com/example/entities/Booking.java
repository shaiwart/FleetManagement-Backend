package com.example.entities;


import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int bookingId; 

	private LocalDateTime bookingDateAndTime; 

	private String firstName; 
	private String lastName; 
	private String mobileNumber; 
	private String emailId; 
	private String dLNumber; 
	private String aadharNo; 
	private String passportNo; 
	private LocalDateTime startDate; 
	private LocalDateTime endDate;  

	

//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "userId")
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private int userId; // just a key will be there , not relation   
	
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "stateId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private State state; // user ka city 
	

	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "cityId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private City city; // user ka state 

	
//	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
//	@JoinColumn(name = "pickupHub", insertable=false, updatable=false)
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	private Hubs pickupHub; 
	
	
//	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
//	@JoinColumn(name = "pickupHub_hubId", referencedColumnName = "hubId")
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private int pickupHubId; 
	

//	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
//	@JoinColumn(name = "dropHub_hubId", referencedColumnName = "hubId")
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private int dropHubId; 
	
	
//	@JoinColumn(name = "sender_uuid", 
//            referencedColumnName = "uuid", // this uuid is in the User entity
//            insertable = false, updatable = false) 
//	private User sender; 
	

	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "categoryId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	private CarCategory category; 
	
	
	
	// = = = = = = = = = = = = = = = 
	
	
	
	
	public int getBookingId() {
		return bookingId;
	}

	public LocalDateTime getBookingDateAndTime() {
		return bookingDateAndTime;
	}

	public void setBookingDateAndTime(LocalDateTime bookingDateAndTime) {
		this.bookingDateAndTime = bookingDateAndTime;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getdLNumber() {
		return dLNumber;
	}

	public void setdLNumber(String dLNumber) {
		this.dLNumber = dLNumber;
	}
	

	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public CarCategory getCategory() {
		return category;
	}

	public void setCategory(CarCategory category) {
		this.category = category;
	}

	

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public int getPickupHubId() {
		return pickupHubId;
	}

	public void setPickupHubId(int pickupHubId) {
		this.pickupHubId = pickupHubId;
	}

	public int getDropHubId() {
		return dropHubId;
	}

	public void setDropHubId(int dropHubId) {
		this.dropHubId = dropHubId;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDateAndTime=" + bookingDateAndTime + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", dLNumber=" + dLNumber + ", aadharNo=" + aadharNo + ", passportNo=" + passportNo + ", startDate="
				+ startDate + ", endDate=" + endDate + ", userId=" + userId + ", state=" + state + ", city=" + city
				+ ", pickupHubId=" + pickupHubId + ", dropHubId=" + dropHubId + ", category=" + category + "]";
	}

	
	

}