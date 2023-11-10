package com.dataJpa.repoo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataJpa.entity.Employee;
@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
