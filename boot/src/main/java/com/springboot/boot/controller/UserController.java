package com.springboot.boot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.boot.model.User;
import com.springboot.boot.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping("users")
public ResponseEntity<User> createUser( @Valid @RequestBody User user){
	return new ResponseEntity<User>(userService.createUser(user),HttpStatus.OK);
		
		
	}
}

