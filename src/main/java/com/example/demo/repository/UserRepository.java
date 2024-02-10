package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

	@Query(nativeQuery = true, value = "select * from users where Username=:Username")
	Users getbyname(String Username);
	

}
