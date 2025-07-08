package com.springboot.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mvc.UserService;
import com.springboot.mvc.request.UserSignupRequest;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user/signup")
	public String createUser(@Valid @RequestBody UserSignupRequest signupReq) {
		//Service layer integration.
		
		String result = userService.createUser(signupReq);;
		
		return result;
		
	}
	
	
	

}
