package com.example.entities;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Booking {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	 
	private LocalDateTime bookingDateAndTime;
	
	
	
	
	private @Getter @Setter String customerFirstName;
	private @Getter @Setter String customerLastName;
	private @Getter @Setter String customerMobileNumber;
	private @Getter @Setter String userMailId;
	private @Getter @Setter String customerDLNumber;
	private @Getter @Setter String customerAadharNumber;
	private @Getter @Setter String passportNo; 
	
	
	
	// isko bidirectional banao 
    
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private @Getter @Setter Users user;
	
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "bookingId", referencedColumnName="bookingId")
    private @Getter @Setter Set<AddOn> AddOn; 
	

    
    // FK-> carCate , users-one to one , hub-one to many (one hub will have many bookings), city,state-> one to many, 
    
	/*
	 * public int getBookingId() { return bookingId; }
	 * 
	 * public void setBookingId(int bookingId) { this.bookingId = bookingId; }
	 * 
	 * public LocalDateTime getBookingDateAndTime() { return bookingDateAndTime; }
	 * 
	 * public void setBookingDateAndTime(LocalDateTime bookingDateAndTime) {
	 * this.bookingDateAndTime = bookingDateAndTime; }
	 * 
	 * public String getCustomerFirstName() { return customerFirstName; }
	 * 
	 * public void setCustomerFirstName(String customerFirstName) {
	 * this.customerFirstName = customerFirstName; }
	 * 
	 * public String getCustomerLastName() { return customerLastName; }
	 * 
	 * public void setCustomerLastName(String customerLastName) {
	 * this.customerLastName = customerLastName; }
	 * 
	 * public String getCustomerMobileNumber() { return customerMobileNumber; }
	 * 
	 * public void setCustomerMobileNumber(String customerMobileNumber) {
	 * this.customerMobileNumber = customerMobileNumber; }
	 * 
	 * public String getUserMailId() { return userMailId; }
	 * 
	 * public void setUserMailId(String userMailId) { this.userMailId = userMailId;
	 * }
	 * 
	 * public String getCustomerDLNumber() { return customerDLNumber; }
	 * 
	 * public void setCustomerDLNumber(String customerDLNumber) {
	 * this.customerDLNumber = customerDLNumber; }
	 * 
	 * public String getCustomerAadharNumber() { return customerAadharNumber; }
	 * 
	 * public void setCustomerAadharNumber(String customerAadharNumber) {
	 * this.customerAadharNumber = customerAadharNumber; }
	 * 
	 * public String getPassportNo() { return passportNo; }
	 * 
	 * public void setPassportNo(String passportNo) { this.passportNo = passportNo;
	 * }
	 * 
	 * public Users getUser() { return user; }
	 * 
	 * public void setUser(Users user) { this.user = user; }
	 * 
	 * public Set<AddOn> getAddOn() { return AddOn; }
	 * 
	 * public void setAddOn(Set<AddOn> addOn) { AddOn = addOn; }
	 */

	
	
	

}