package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Hubs;
import com.example.entities.Users;

@Repository
public interface UserRepository  extends JpaRepository<Users, Integer> {
	
	@Query(value = "select * from users where email_id = :emailId and password = :password", nativeQuery = true)
	public Users getUserByEmailIdAndPass(@Param("emailId") String emailId, @Param("password") String password); 
	
}
