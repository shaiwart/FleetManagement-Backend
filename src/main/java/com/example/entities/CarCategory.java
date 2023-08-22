package com.example.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;


@Entity
public class CarCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int categoryId;
	private String categoryName;
	private String imgPath;
	private double dailyRates;
	private double weeklyRates;
	private double monthlyRates; 
	
	
	@OneToMany 
    @JoinColumn(name = "categoryId", referencedColumnName="categoryId")
    private Set<Car> cars; 
	
//	@JsonManagedReference
	@OneToMany(mappedBy = "category") 
//    @JoinColumn(name = "categoryId", referencedColumnName="categoryId")
    private Set<Booking> bookings; 
	
	
	
	
	
	public int getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public double getDailyRates() {
		return dailyRates;
	}
	public void setDailyRates(double dailyRates) {
		this.dailyRates = dailyRates;
	}
	public double getWeeklyRates() {
		return weeklyRates;
	}
	public void setWeeklyRates(double weeklyRates) {
		this.weeklyRates = weeklyRates;
	}
	public double getMonthlyRates() {
		return monthlyRates;
	}
	public void setMonthlyRates(double monthlyRates) {
		this.monthlyRates = monthlyRates;
	}
	
	
	@Override
	public String toString() {
		return "CarCategory [categoryId=" + categoryId + ", categoryName=" + categoryName + ", imgPath=" + imgPath
				+ ", dailyRates=" + dailyRates + ", weeklyRates=" + weeklyRates + ", monthlyRates=" + monthlyRates
				+ "]";
	}  
	
	
	
	
	
}
