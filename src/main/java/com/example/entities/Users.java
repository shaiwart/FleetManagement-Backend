package com.example.entities;

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
    private String mailId;
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

    
    // FK-> city , state , hub 
    
    
    
    
    
    
    
    
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

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
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


	

    

}
