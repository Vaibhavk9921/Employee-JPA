package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository emp;

	@PostMapping("/create")
	public String insertData(@RequestParam("name") String name,@RequestParam("post") String post,@RequestParam("department") String department,@RequestParam("salary") int salary) {
		// add
		Employee ep = new Employee();
		ep.setName(name);
		ep.setPost(post);
		ep.setDepartment(department);
		ep.setSalary(salary);
		emp.save(ep);
		return "Data Inserted!!";
	}
	@PutMapping("/update/name")
	public String updateName(@RequestParam("id") int id, @RequestParam("name") String name) {
	Employee ep = emp.findById(id).get();
		ep.setName(name);
		emp.save(ep);
		return "Name Updated!!!!";
	}

	@PutMapping("/update/department")
	public String updateDepartment(@RequestParam("id") int id, @RequestParam("department") String department) {
		Employee ep = emp.findById(id).get();
		ep.setDepartment(department);
		emp.save(ep);
		return "Department Updated!!!!";
	}

	@PutMapping("/update/post")
	public String updatePost(@RequestParam("id") int id, @RequestParam("post") String post) {
		Employee ep = emp.findById(id).get();
		ep.setPost(post);
		emp.save(ep);
		return "Post Updated!!!!";
	}

	@PutMapping("/update/salary")
	public String updateSalary(@RequestParam("id") int id, @RequestParam("salary") int salary) {
		Employee ep = emp.findById(id).get();
		ep.setSalary(salary);
		emp.save(ep);
		return "Salary Updated!!!!";
	}
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam("id") int id) {
		Employee ep = emp.findById(id).get();
		emp.delete(ep);
		return "Data deleted!!";
	}
	@GetMapping("/get")
	public Employee getDataById(@RequestParam("id") int id) {
		if(emp==null) 
		{
			throw new EmployeeNotFoundException();
		}
		return emp.findById(id).get();
	}

	@GetMapping("/getall")
	public Iterable<Employee> getAll() {

		return emp.findAll();
	}
}
