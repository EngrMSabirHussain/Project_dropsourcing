package com.dropsourcing.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRegistrationDto {

	String username;
	String email;
	String password;
	String whatsappNumber;
	String cnic;
	String userType;
}
