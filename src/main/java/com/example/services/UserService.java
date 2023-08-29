package com.example.services;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.entities.Users;

public interface UserService {
	
	public Users getUserByEmailIdAndPass(String emailId, String password);  
	
	public void addUser(Users user);  
	
	public Users getUserByEmailId(String emailId);  
}
