package com.nisum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.dao.EmployeeRepositoryImpl;
import com.nisum.model.Employee;

@Service("employeeService")
public class EmployeeService {

	@Autowired
	EmployeeRepositoryImpl empRepository;
	
	public void save(Employee emp) {
		empRepository.saveEmp(emp);
	}
	
	public void update(Employee emp) {
		empRepository.updateEmp(emp);
	}
	public Employee getById(String empid) {
		return empRepository.findById(empid);
	}
	public String remove(String empid) {
		return empRepository.removeById(empid);
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return empRepository.getAll();
	}
	
}
