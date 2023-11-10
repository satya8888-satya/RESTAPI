package com.dataJpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;

@Entity
public class Employee {
	 @Id
	 @GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String name;
	private String dept;
	private String desg;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String dept, String department, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.desg = desg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", desg=" + desg + "]";
	}
	
	
	

}
