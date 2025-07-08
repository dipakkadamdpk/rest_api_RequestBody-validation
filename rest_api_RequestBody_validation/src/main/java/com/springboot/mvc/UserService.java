package com.springboot.mvc;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.mvc.request.UserSignupRequest;

@Service
public class UserService {

	public String createUser(UserSignupRequest signupReq) {
		
		System.out.println(" -- Request body at service layer -- "+signupReq);

		return "user created successdully.!!";
	}

}
