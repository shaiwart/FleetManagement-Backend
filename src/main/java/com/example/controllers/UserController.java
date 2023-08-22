package com.example.controllers;

import com.example.entities.Airport;
import com.example.entities.Booking;
import com.example.entities.Users;
import com.example.services.AirportService;
import com.example.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // get user by email + password 
    @GetMapping("/api/user/{emailId}/{password}") 
    public Users getUserByEmailIdAndPass(@PathVariable String emailId, @PathVariable String password) {
        var temp = userService.getUserByEmailIdAndPass(emailId, password);
        System.out.println(temp); 
    	return temp;  
    }
    
    // POST record in user table 
    @PostMapping("/api/user/add")
	public void addUser(@RequestBody  Users user) {
		userService.addUser(user); 
	}
}
