package com.example.mongoDB_Proj.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongoDB_Proj.model.Employee;
import com.example.mongoDB_Proj.repository.EmployeeRepository;
import java.util.List;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er ;
	
	// save Employee
	public Employee saveEmployee(Employee employee) {
        return er.save(employee);
    }
	
	public List<Employee> getAllEmployees(){
		return er.findAll();
	}
	
	
	public Optional<Employee> getEmployeeById(String id ){
		return er.findById(id);
	}
}
