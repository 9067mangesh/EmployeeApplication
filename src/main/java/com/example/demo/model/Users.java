package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column
	private String UserName;
	@Column
	private String Password;
	
	public Users(){	}

	public Users(int empId, String username, String password) {
		super();
		this.empId = empId;
		this.UserName = username;
		this.Password = password;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getUsername() {
		return UserName;
	}

	public void setUsername(String username) {
		UserName = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
}
