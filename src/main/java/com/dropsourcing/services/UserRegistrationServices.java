package com.dropsourcing.services;

import java.util.List;

import com.dropsourcing.payloads.UserRegistrationDto;

public interface UserRegistrationServices {

	UserRegistrationDto addNewUser(UserRegistrationDto newUser);
	
	UserRegistrationDto updateUser(String username, String email, String password, String number, String cnic);
	
    List<UserRegistrationDto> getAllRegisterUser();
	
	UserRegistrationDto getUserByemail(String email);
	
    void delUserAccout(String email);
    
    void delAllUser();

}
