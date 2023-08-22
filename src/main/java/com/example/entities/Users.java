package com.example.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String firstName;
    private String lastName;
    
    @Column(unique = true)
    private String mobileNumber;
    
    @Column(unique = true)
    private String emailId;
    private String address;
    private String password;
    
    @Column(unique = true)
    private String dlNo;
    
    
    @Column(unique = true, length = 12) 
    private long aadharNo;
    
    @Column(unique = true)
    private long passportNo;
    
    
    private int isReigsteredUser;
    private int isEmployee;

    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "stateId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
//    @JsonIgnore
    private State state;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cityId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
//    @JsonIgnore
    private City city; 
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "hubId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
//    @JsonIgnore
    private Hubs hubs;
    
    
    
    
    // = = = = = = 
    
    @OneToMany(mappedBy = "user") 
    private List<Booking> bookings; 
    
    
	public int getUserId() {
		return userId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDlNo() {
		return dlNo;
	}

	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public long getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(long passportNo) {
		this.passportNo = passportNo;
	}

	public int getIsReigsteredUser() {
		return isReigsteredUser;
	}

	public void setIsReigsteredUser(int isReigsteredUser) {
		this.isReigsteredUser = isReigsteredUser;
	}

	public int getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(int isEmployee) {
		this.isEmployee = isEmployee;
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

	public Hubs getHubs() {
		return hubs;
	}

	public void setHubs(Hubs hubs) {
		this.hubs = hubs;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", emailId=" + emailId + ", address=" + address + ", password=" + password + ", dlNo="
				+ dlNo + ", aadharNo=" + aadharNo + ", passportNo=" + passportNo + ", isReigsteredUser="
				+ isReigsteredUser + ", isEmployee=" + isEmployee + ", state=" + state + ", city=" + city + ", hubs="
				+ hubs + ", bookings=" + bookings + "]";
	}


	

    

}
