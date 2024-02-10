//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.model.Employee;
//import com.example.demo.service.EmpService;
//
//@CrossOrigin(origins= "http://localhost:4200")
//@RestController
//public class EmpController {
//	
//	@Autowired
//	public EmpService empService;
//	/////////////////////////////////////////////model- object from controller to view
//	@GetMapping("/emp")
//	public String getAllEmp(Model model)
//	{
//		System.out.println("first");
//		List<Employee> list=empService.getAllEmployee();
//		model.addAttribute("employee", list);
//		return "employee_list";
//	}	
//	/////////////////////////////////////////////////////////////////////////////////////
//	@GetMapping("/emp/{id}")
//	public Employee getEmpById(@PathVariable int id)
//	{
//		System.out.println("second");
//		return empService.getEmployeeById(id);
//	}
//	/////////////////////////////////////////////////////////////////////
//	@GetMapping("/emp/new")
//	public String newEmployeeForm(Model model) 
//	{
//		System.out.println("third");
//		model.addAttribute("employee", new Employee());
//		return "employee_form";
//	}
//	////////////////////////////////////////////////////////////	
//	@PostMapping("/emp/save")
//	public String addEmp(@ModelAttribute Employee employee)
//	{
//		System.out.println("four");
//		empService.addEmployee(employee);
//		return "redirect:/emp";
//	}	
//	////////////////////////////////////////////////////
//	@PutMapping("/emp/{id}")
//	public Employee updateEmp(@RequestBody Employee employee, @PathVariable int id)
//	{
//		return empService.updateEmployeeById(employee, id);
//	}
//	///////////////////////////////////////////////////
//	@DeleteMapping("/emp1/{id}")
//	public void deleteEmp(@PathVariable int id)
//	{
//		 empService.deleteEmployee(id);
//	}
//	
//	
//}
