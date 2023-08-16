package com.example.entities;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Hubs")
public class Hubs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hubId;

    private String hubName;
    private String contactNumber;
    private String address;

    
    // one hub will have multiple cars 
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "hubId", referencedColumnName="hubId")
    private Set<Car> cars; 
    
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "empHubId", referencedColumnName="hubId")
    private Set<Users> users; 
    
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pickupHubId", referencedColumnName="hubId")
    private Set<Booking> bookingsPickup; 
    
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dropHubId", referencedColumnName="hubId")
    private Set<Booking> bookingsDrop; 
    
    
    
    public int getHubId() {
        return hubId;
    }

    public void setHubId(int hubId) {
        this.hubId = hubId;
    }

    public String getHubName() {
        return hubName;
    }

    public void setHubName(String hubName) {
        this.hubName = hubName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    
}