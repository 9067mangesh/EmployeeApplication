package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmpRepository;

@Service
public class EmpServiceImp  implements EmpService{
	
	@Autowired
	public EmpRepository empRepository;
	
	@Override
	public List<Employee> getAllEmployee() {	
		return empRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		Employee employee=null;
//		employee=empRepository.findById(empId);
		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		Employee employee2= empRepository.save(employee);
		return employee2;
	}

	@Override
	public Employee updateEmployeeById(Employee employee, int empId) {
		employee.setEmpId(empId);
		return empRepository.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		empRepository.deleteById(empId);
		
	}

	

}
