package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Users;
import com.example.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository; 
	
	@Override
	public Users getUserByEmailIdAndPass(String emailId, String password) {
		return userRepository.getUserByEmailIdAndPass(emailId, password); 
	}

}