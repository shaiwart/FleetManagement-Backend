package com.example.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
public class Booking implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int bookingId; 

	private LocalDateTime bookingDateAndTime; 

	private String firstName; 
	private String lastName; 
	private String mobileNumber; 
	private String mailId; 
	private String dLNumber; 
	private String aadharNumber; 
	private String passportNumber; 

	
//	@JsonBackReference
	@ManyToOne
	private Users user;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookingId", referencedColumnName = "bookingId")
	private Set<AddOn> AddOn;
	
//	@JsonBackReference
	@ManyToOne
	private State state;

//	@JsonBackReference
	@ManyToOne
	private City city;
	
//	@JsonBackReference
	@ManyToOne
	private Hubs pickupHub; 
	
//	@JsonBackReference
	@ManyToOne
	private Hubs dropHub; 
	
//	@JsonBackReference
	@ManyToOne
	private CarCategory category; 
	
	
	
	
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

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getdLNumber() {
		return dLNumber;
	}

	public void setdLNumber(String dLNumber) {
		this.dLNumber = dLNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Set<AddOn> getAddOn() {
		return AddOn;
	}

	public void setAddOn(Set<AddOn> addOn) {
		AddOn = addOn;
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

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public CarCategory getCategory() {
		return category;
	}

	public void setCategory(CarCategory category) {
		this.category = category;
	}
	
	

}