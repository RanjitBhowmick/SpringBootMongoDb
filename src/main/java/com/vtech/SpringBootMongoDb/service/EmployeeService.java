package com.vtech.SpringBootMongoDb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtech.SpringBootMongoDb.bean.Employee;
import com.vtech.SpringBootMongoDb.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	public List<Employee> getAllEmployeeData() {
		List<Employee> allEmp = empRepo.findAll();
		return allEmp;
	}

	public Employee saveEmployee(Employee emp) {
		Employee savedEmp = empRepo.save(emp);
		return savedEmp;
	}

	public Employee getEmployee(String id) {
		Optional<Employee> optEmp = empRepo.findById(id);
		Employee employee = optEmp.get();
		return employee;
	}

	public void deleteEmployee(String id) {
		empRepo.deleteById(id);
	}

	public String updateEmployee(Employee emp, String id) {
		Optional<Employee> existingEmp = empRepo.findById(id);
		if (existingEmp.isPresent()) {
			emp.setId(id);
			empRepo.save(emp);
			return "Data save successfully";
		} else {
			return "No data exist";
		}

	}

}
