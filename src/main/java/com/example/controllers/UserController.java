package com.example.controllers;

import com.example.dto.LoginRequestDTO;
import com.example.entities.Airport;
import com.example.entities.Booking;
import com.example.entities.Users;
import com.example.services.AirportService;
import com.example.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    // get user by email + password 
    @GetMapping("/api/user/{emailId}/{password}") 
    public Users getUserByEmailIdAndPass(@PathVariable String emailId, @PathVariable String password) {
        var temp = userService.getUserByEmailIdAndPass(emailId, password);
//        System.out.println(temp); 
    	return temp;  
    } 
    
    
    @GetMapping("/api/user/{emailId}") 
    public Users getUserByEmailId(@PathVariable String emailId) {
        var temp = userService.getUserByEmailId(emailId);
//        System.out.println(temp); 
    	return temp;  
    } 
    
    
    @CrossOrigin
    @PostMapping("/api/user/login")
	public Users userLogin(@RequestBody  LoginRequestDTO loginRequest) {
    	String email = loginRequest.getEmail();
        String password = loginRequest.getPassword(); 
        
        return userService.userLogin(email, password);  
        
    }
    
    @CrossOrigin
    @PostMapping("/api/employee/login")
	public Users employeeLogin(@RequestBody  LoginRequestDTO loginRequest) {
    	String email = loginRequest.getEmail();
        String password = loginRequest.getPassword(); 
        
        return userService.employeeLogin(email, password);  
        
    }
    
    
    // POST record in user table 
    @CrossOrigin
    @PostMapping("/api/user/add")
	public void addUser(@RequestBody  Users user) { 
    	Users temp = user; 
    	temp.setIsEmployee(0); 
    	
//    	User temp = userService.getUserByEmailId(user.getEmailId()); //  
    	// if temp is NULL -> ye user nahi present hai. And Go ahead. 
    	// if temp is not null means user is already there in our user table. 
    	
		userService.addUser(temp); 
	}
}
