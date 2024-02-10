package com.example.demo.service;

import com.example.demo.model.Users;


public interface UserService {

	Users registerUser(Users user);
	
	Users loginUser(Users user);
}
