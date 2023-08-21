package com.example.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter int userId;

    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    
    @Column(unique = true)
    private @Getter @Setter String mobileNumber;
    
    @Column(unique = true)
    private @Getter @Setter String mailId;
    private @Getter @Setter String address;
    private @Getter @Setter String password;
    
    @Column(unique = true)
    private @Getter @Setter String dlNo;
    
    
    @Column(unique = true, length = 12) 
    private @Getter @Setter long aadharNo;
    
    @Column(unique = true)
    private @Getter @Setter long passportNo;
    
    
    private @Getter @Setter int isReigsteredUser;
    private @Getter @Setter int isEmployee;

    
    // FK-> city , state , hub 
    // DONE ! (go and see respective entities) 
    
    
    
    
	/*
	 * public int getUserId() { return userId; }
	 * 
	 * public void setUserId(int userId) { this.userId = userId; }
	 * 
	 * public String getFirstName() { return firstName; }
	 * 
	 * public void setFirstName(String firstName) { this.firstName = firstName; }
	 * 
	 * public String getLastName() { return lastName; }
	 * 
	 * public void setLastName(String lastName) { this.lastName = lastName; }
	 * 
	 * public String getMobileNumber() { return mobileNumber; }
	 * 
	 * public void setMobileNumber(String mobileNumber) { this.mobileNumber =
	 * mobileNumber; }
	 * 
	 * public String getMailId() { return mailId; }
	 * 
	 * public void setMailId(String mailId) { this.mailId = mailId; }
	 * 
	 * public String getAddress() { return address; }
	 * 
	 * public void setAddress(String address) { this.address = address; }
	 * 
	 * public String getPassword() { return password; }
	 * 
	 * public void setPassword(String password) { this.password = password; }
	 * 
	 * public String getDlNo() { return dlNo; }
	 * 
	 * public void setDlNo(String dlNo) { this.dlNo = dlNo; }
	 * 
	 * public long getAadharNo() { return aadharNo; }
	 * 
	 * public void setAadharNo(long aadharNo) { this.aadharNo = aadharNo; }
	 * 
	 * public long getPassportNo() { return passportNo; }
	 * 
	 * public void setPassportNo(long passportNo) { this.passportNo = passportNo; }
	 * 
	 * public int getIsReigsteredUser() { return isReigsteredUser; }
	 * 
	 * public void setIsReigsteredUser(int isReigsteredUser) { this.isReigsteredUser
	 * = isReigsteredUser; }
	 * 
	 * public int getIsEmployee() { return isEmployee; }
	 * 
	 * public void setIsEmployee(int isEmployee) { this.isEmployee = isEmployee; }
	 */

	

    

}
