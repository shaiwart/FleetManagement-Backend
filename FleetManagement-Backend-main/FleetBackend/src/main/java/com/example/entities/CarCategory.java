package com.example.entities;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Data
@ToString
public class CarCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private @Getter @Setter int categoryId;
	private @Getter @Setter String categoryName;
	private @Getter @Setter String imgPath;
	private @Getter @Setter double dailyRates;
	private @Getter @Setter double weeklyRates;
	private @Getter @Setter double monthlyRates; 
	
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId", referencedColumnName="categoryId")
    private @Getter @Setter Set<Car> cars; 
	
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId", referencedColumnName="categoryId")
    private @Getter @Setter Set<Booking> bookings; 
	
	
	
	
	/*
	 * public int getCategoryId() { return categoryId; } public void
	 * setCategoryId(int categoryId) { this.categoryId = categoryId; } public String
	 * getCategoryName() { return categoryName; } public void setCategoryName(String
	 * categoryName) { this.categoryName = categoryName; } public String
	 * getImgPath() { return imgPath; } public void setImgPath(String imgPath) {
	 * this.imgPath = imgPath; } public double getDailyRates() { return dailyRates;
	 * } public void setDailyRates(double dailyRates) { this.dailyRates =
	 * dailyRates; } public double getWeeklyRates() { return weeklyRates; } public
	 * void setWeeklyRates(double weeklyRates) { this.weeklyRates = weeklyRates; }
	 * public double getMonthlyRates() { return monthlyRates; } public void
	 * setMonthlyRates(double monthlyRates) { this.monthlyRates = monthlyRates; }
	 * 
	 * 
	 * @Override public String toString() { return "CarCategory [categoryId=" +
	 * categoryId + ", categoryName=" + categoryName + ", imgPath=" + imgPath +
	 * ", dailyRates=" + dailyRates + ", weeklyRates=" + weeklyRates +
	 * ", monthlyRates=" + monthlyRates + "]"; }
	 */  
	
	
	
	
	
}
