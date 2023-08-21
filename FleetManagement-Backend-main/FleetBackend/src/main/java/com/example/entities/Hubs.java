package com.example.entities;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Hubs")
@Data
public class Hubs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter int hubId;

    private @Getter @Setter String hubName;
    private @Getter @Setter String contactNumber;
    private @Getter @Setter String address;

    
    // one hub will have multiple cars 
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "hubId", referencedColumnName="hubId")
    private @Getter @Setter Set<Car> cars; 
    
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "empHubId", referencedColumnName="hubId")
    private @Getter @Setter Set<Users> users; 
    
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pickupHubId", referencedColumnName="hubId")
    private @Getter @Setter Set<Booking> bookingsPickup; 
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dropHubId", referencedColumnName="hubId")
    private @Getter @Setter Set<Booking> bookingsDrop; 
    
    
    
	/*
	 * public int getHubId() { return hubId; }
	 * 
	 * public void setHubId(int hubId) { this.hubId = hubId; }
	 * 
	 * public String getHubName() { return hubName; }
	 * 
	 * public void setHubName(String hubName) { this.hubName = hubName; }
	 * 
	 * public String getContactNumber() { return contactNumber; }
	 * 
	 * public void setContactNumber(String contactNumber) { this.contactNumber =
	 * contactNumber; }
	 * 
	 * public String getAddress() { return address; }
	 * 
	 * public void setAddress(String address) { this.address = address; }
	 */
    
    
    
}