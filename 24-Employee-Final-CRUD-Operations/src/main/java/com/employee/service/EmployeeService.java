package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.employee.entity.Employee;

@Service
public interface EmployeeService {
	public Employee add(Employee emp);

	public List<Employee> addall(List<Employee> empl);

	public Optional<Employee> get(int id);
	
	//public Employee getEmp(String city);

	public List<Employee> getall();

	public String delete(int id);

	public Employee update(int id, Employee employee);
}
