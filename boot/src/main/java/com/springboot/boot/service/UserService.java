package com.springboot.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.boot.model.User;
import com.springboot.boot.repo.UserRepo;

@Service
public class UserService {
	
	
	
	
	@Autowired
	UserRepo userRepo;

	public User createUser(User user) {
		return userRepo.save(user); 
	}
}
