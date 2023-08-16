package com.example.entities;

import java.util.Set;

import jakarta.persistence.*;


@Entity
public class CarCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int categoryId;
	private char categoryName;
	private String imgPath;
	private double dailyRates;
	private double weeklyRates;
	private double monthlyRates;
	
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId", referencedColumnName="categoryId")
    private Set<Car> cars; 
	
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId", referencedColumnName="categoryId")
    private Set<Booking> bookings; 
	
	
	
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public char getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(char categoryName) {
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
