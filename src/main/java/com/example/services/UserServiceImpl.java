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

	@Override
	public void addUser(Users user) {
		userRepository.save(user); 
	}
	
	@Override
	public Users getUserByEmailId(String emailId) {
		return userRepository.getUserByEmailId(emailId); 
	}

	@Override
	public Users userLogin(String email, String password) {
		return userRepository.userLogin(email, password);  
	}

	@Override
	public Users employeeLogin(String email, String password) {
		return userRepository.employeeLogin(email, password); 
	}

}
