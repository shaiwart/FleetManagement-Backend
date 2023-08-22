package com.example.services;

import com.example.entities.Users;

public interface UserService {
	
	public Users getUserByEmailIdAndPass(String emailId, String password);  
}
