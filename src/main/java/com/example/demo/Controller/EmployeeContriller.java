package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.model.Employee;

@RestController
public class EmployeeContriller {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("employee")
	public String addEmployee(@RequestBody Employee employee) {
  
		employeeService.saveEmployee(employee);
		return "saved";
	}

	@GetMapping("employee/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return employeeService.getEmployee(id);
	}

	@DeleteMapping("employee/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
		return "deleted";
	}

}
