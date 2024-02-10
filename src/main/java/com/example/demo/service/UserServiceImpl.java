package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userrepository;
	
	@Override
	public Users registerUser(Users user) {
		System.out.println(user.getUsername()+"-"+user.getPassword());
		return userrepository.save(user);
	}
	
	
	@Override
	public Users loginUser(Users u) {
		return userrepository.getbyname(u.getUsername());
	}
}
