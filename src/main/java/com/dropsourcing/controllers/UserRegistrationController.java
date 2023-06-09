package com.dropsourcing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dropsourcing.payloads.UserRegistrationDto;
import com.dropsourcing.services.UserRegistrationServices;

@RestController
@RequestMapping("/userRegistration")
public class UserRegistrationController {
	
	@Autowired
	UserRegistrationServices userService; 

	@GetMapping("/test")
	public ResponseEntity<?> test(){
		return new ResponseEntity<>("Test API Run Successfully", HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<?> addNewUser(@RequestBody UserRegistrationDto user){
		UserRegistrationDto addUser=this.userService.addNewUser(user);
		return new ResponseEntity<>(addUser,HttpStatus.CREATED);
	}
	
}
