package com.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	//Employee findByCity(String city);

}
