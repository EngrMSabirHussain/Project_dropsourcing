package com.dropsourcing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dropsourcing.entities.UserRegistration;

public interface UserRegistrationRepo extends  JpaRepository<UserRegistration, Integer>{

}
