package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	public EmployeeDao dao;

	@Override
	public Employee add(Employee emp) {
		return dao.save(emp);

	}

	@Override
	public List<Employee> addall(List<Employee> empl) {
		return dao.saveAll(empl);

	}

	@Override
	public Optional<Employee> get(int id) {
		return dao.findById(id);
		 
	}

	/*
	 * @Override public Employee getEmp(String city) {
	 * 
	 * return dao.findByCity(city); }
	 */

	@Override
	public List<Employee> getall() {
		return dao.findAll();

	}

	@Override
	public String delete(int id) {
		dao.deleteById(id);
		return "Employee was delet from db " + id;

	}

	@Override
	public Employee update(int id, Employee employee) {
		Employee exsitingemployee = dao.findById(id).orElseThrow();
		exsitingemployee.setAge(employee.getAge());
		exsitingemployee.setBloodgroup(employee.getBloodgroup());
		exsitingemployee.setCity(employee.getCity());
		exsitingemployee.setEducation(employee.getEducation());
		exsitingemployee.setEmail(employee.getEmail());
		exsitingemployee.setId(employee.getId());
		exsitingemployee.setMobno(employee.getMobno());
		exsitingemployee.setName(employee.getName());
		exsitingemployee.setWages(employee.getWages());
		return employee;
	}

}
