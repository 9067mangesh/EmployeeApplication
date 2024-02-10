package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Users;
import com.example.demo.service.UserServiceImpl;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class UserController {

	@Autowired
	public UserServiceImpl userservice;
	
	@PostMapping("/register")
	public Users registerUser(@RequestBody Users user1){
		System.out.println(user1.getUsername()+"-"+user1.getPassword());
		userservice.registerUser(user1);
		return user1;
	}
	
	@PostMapping("/login")
	public Users loginUser(@RequestBody Users u) {
		Users u1=userservice.loginUser(u);
		if(u1.getUsername().equals(u.getUsername())&& u1.getPassword().equals(u.getPassword())) {
			return u1;
		}
		return u;
	}
	
}
