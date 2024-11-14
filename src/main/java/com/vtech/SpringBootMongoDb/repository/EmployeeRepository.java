package com.vtech.SpringBootMongoDb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vtech.SpringBootMongoDb.bean.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
