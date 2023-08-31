package com.example.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
    private String aadharNo;
    
    @Column(unique = true)
    private String passportNo; 
   
    private int isEmployee;

    
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER) // lazy earger kuch bhi karo chalega, if your are usign @jsonIgnoreProperties 
    @JoinColumn(name = "stateId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
//    @JsonIgnore
    private State state; 
    
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "cityId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
//    @JsonIgnore
    private City city; 
    
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "hubId")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
//    @JsonIgnore 
    private Hubs hubs;

    
    
 // = = = = = = = = = = =
    
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + ", emailId=" + emailId + ", address=" + address + ", password=" + password + ", dlNo="
				+ dlNo + ", aadharNo=" + aadharNo + ", passportNo=" + passportNo + ", isEmployee=" + isEmployee
				+ ", state=" + state + ", city=" + city + ", hubs=" + hubs + "]";
	} 
    
    
    
    
    
    
	
    

	

    

}
