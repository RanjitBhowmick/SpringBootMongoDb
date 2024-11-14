package com.vtech.SpringBootMongoDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtech.SpringBootMongoDb.bean.Employee;
import com.vtech.SpringBootMongoDb.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/get-all-employee")
	public List<Employee> getAllData() {
		return empService.getAllEmployeeData();
	}

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		Employee savedEmployee = empService.saveEmployee(emp);
		return savedEmployee;
	}

	@GetMapping("/get-employee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		Employee employee = empService.getEmployee(id);
		return employee;
	}

	@DeleteMapping("/delete-employee/{id}")
	public void deleteEmployee(@PathVariable String id) {
		empService.deleteEmployee(id);
	}

	@PutMapping("/update-employee/{id}")
	public String updateEmployee(@RequestBody Employee emp, @PathVariable String id) {
		String updateMessage = empService.updateEmployee(emp, id);
		return updateMessage;
	}

}
