package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.service.EmpService;

@RestController
@CrossOrigin(origins ="*")
public class EmployeeController {

	@Autowired
	public EmpService empService;
	/////////////////////////////////////////////model- object from controller to view
	@GetMapping("/emp")
	public List<Employee> getAllEmployees()
	{
		return empService.getAllEmployee();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	@GetMapping("/emp/{id}")
	public Employee getEmpById(@PathVariable int empId)
	{
		return empService.getEmployeeById(empId);
	}
	/////////////////////////////////////////////////////////////////////	
	@PostMapping("/emp")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return empService.addEmployee(employee);
	}	
//	////////////////////////////////////////////////////
	
	@PutMapping("/emp/{empId}")
	public Employee updateEmp(@RequestBody Employee employee, @PathVariable int empId)
	{
		return empService.updateEmployeeById(employee, empId);
	}
//	///////////////////////////////////////////////////
	@DeleteMapping("/emp/{empId}")
	public void deleteEmp(@PathVariable int empId)
	{
		 empService.deleteEmployee(empId);
	}
	
}
