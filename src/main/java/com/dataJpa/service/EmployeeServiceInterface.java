package com.dataJpa.service;
import java.util.Optional;
import java.util.*;

import com.dataJpa.entity.Employee;

public interface EmployeeServiceInterface {
	public Employee saveEmployee( Employee employee );
	public Optional <Employee> getEmployeeById(int id);
    List<Employee>getallEmployee();
    Employee updateEmployee(int id,Employee employee);
    public void deletEmployeeById(int id);
	void deleteEmployeeById(int id);   
    
}
 