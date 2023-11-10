package com.dataJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataJpa.entity.Employee;
import com.dataJpa.repoo.EmployeeRepository;
@Service

public class EmployeeService implements EmployeeServiceInterface{
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Optional<Employee> getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<Employee> getallEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		 Employee employeeToUpdate = repo.findById(id).orElseThrow();
		 employeeToUpdate.setName(employee.getName());
		 employeeToUpdate.setDept(employee.getDept());
		 employeeToUpdate.setDesg(employee.getDesg());
		return repo.save(employeeToUpdate);
		 
	}

	@Override
	public void deleteEmployeeById(int id) {
			repo.deleteById(id);
			
		
		
	}

	@Override
	public void deletEmployeeById(int id) {
		// TODO Auto-generated method stub
		
	}


}
