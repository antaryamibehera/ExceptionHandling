package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	public EmployeeServiceImpl service;

	
	@PostMapping("/addEmployee")
	public Employee save(@RequestBody Employee employee) {
		return service.add(employee);
	}

	@PostMapping("/addallEmployee")
	public List<Employee> saveall(@RequestBody List<Employee> employee) {
		return service.addall(employee);
	}

	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> featch(@PathVariable int id) {
		return service.get(id);

	}

	/*
	 * public Employee featchEmpl(@RequestBody city) { return service.getEmp(city);
	 * }
	 */

	@GetMapping("/getallEmployee")
	public List<Employee> featchall() {
		return service.getall();
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public String remove(@PathVariable int id) {
		return service.delete(id);
	}

	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(service.update(id, employee), HttpStatus.OK);
	}
}
