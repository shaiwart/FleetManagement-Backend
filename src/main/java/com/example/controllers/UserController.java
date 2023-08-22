package com.example.controllers;

import com.example.entities.Airport;
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

    // get all airport 
    @GetMapping("/api/user/{emailId}/{password}") 
    public Users getUserByEmailIdAndPass(@PathVariable String emailId, @PathVariable String password) {
        var temp = userService.getUserByEmailIdAndPass(emailId, password);
        System.out.println(temp); 
    	return temp;  
    }
}
