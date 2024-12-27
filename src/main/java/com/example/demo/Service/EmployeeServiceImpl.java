package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee e) {
		employeeRepository.save(e);

	}

	@Override
	public Employee getEmployee(int id) {

		return employeeRepository.findById(id).get();

	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);

	}

}