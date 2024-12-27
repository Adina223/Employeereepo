package com.example.demo.Service;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee employee);
	
	public Employee getEmployee(int id);
	
	public void deleteEmployee(int id);

}
