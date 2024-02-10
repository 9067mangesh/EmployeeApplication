package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmpService {
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById(int empId);      //get employee
	
	public Employee addEmployee(Employee employee);      //add employee
	 
	public Employee updateEmployeeById(Employee employee, int empId);        //update employee
	
	public void deleteEmployee(int empId);

}

