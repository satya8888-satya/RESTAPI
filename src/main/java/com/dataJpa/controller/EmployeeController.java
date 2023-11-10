package com.dataJpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.dataJpa.entity.Employee;
import com.dataJpa.service.EmployeeService;

@RestController

public class EmployeeController{
	@Autowired
	private EmployeeService service; //We are bringing  instance
	//This is post request URL
	 @PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return service.saveEmployee(emp);
	}
	 //This is get Request URL with out any Constraint
	 @GetMapping("/getEmployees")
	public List <Employee> getAllEmployees(){
		 return service.getallEmployee();
	 }
	 //This is get request URL Based on Single Object
	 
	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int  id){
		return service.getEmployeeById(id);
		
	}
	// This is Update request URL Based on Single Object 
	
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable int id ,@RequestBody Employee emp) {
		return service.updateEmployee(id,emp);
		
	}
	//This is Delete request URL Based On Single Object
	  
	@DeleteMapping("/deleteEmp/{id}")
	public void  deleteEmployee(int id){
		  service.deleteEmployeeById(id);	
		
	}
} 