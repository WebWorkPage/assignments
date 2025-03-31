package com.example.mongoDB_Proj.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongoDB_Proj.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee , String>{

}
