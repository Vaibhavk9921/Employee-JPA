package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String name;
private String post;
private String department;
private int salary;
public Employee() {
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
public Employee(Integer id, String name, String post, String department, Integer salary) {
	super();
	this.id = id;
	this.name = name;
	this.post = post;
	this.department = department;
	this.salary = salary;
}
}
