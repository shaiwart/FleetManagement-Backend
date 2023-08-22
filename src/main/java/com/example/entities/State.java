package com.example.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
@Entity
@Table
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // definition assigned to kanade 
    private int stateId; 
    private String stateName;
    
    
    @OneToMany(mappedBy =  "state") 
    private Set<Booking> bookings; 


	public int getStateId() {
		return stateId;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


	public Set<Booking> getBookings() {
		return bookings;
	}


	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}


	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", bookings=" + bookings + "]";
	}
    
    
}