package com.dropsourcing.services.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dropsourcing.entities.UserRegistration;
import com.dropsourcing.payloads.UserRegistrationDto;
import com.dropsourcing.repositories.UserRegistrationRepo;
import com.dropsourcing.services.UserRegistrationServices;

@Service
public class UserRegistrationServicesImpl implements UserRegistrationServices {

	@Autowired
	UserRegistrationRepo userRepo;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public UserRegistrationDto addNewUser(UserRegistrationDto newUser) {
		UserRegistration user=this.modelMapper.map(newUser, UserRegistration.class);
		return this.modelMapper.map(this.userRepo.save(user), UserRegistrationDto.class);
	}

	@Override
	public UserRegistrationDto updateUser(String username, String email, String password, String number, String cnic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserRegistrationDto> getAllRegisterUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRegistrationDto getUserByemail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delUserAccout(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delAllUser() {
		// TODO Auto-generated method stub

	}

}
