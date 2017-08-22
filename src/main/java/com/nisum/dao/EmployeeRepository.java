package com.nisum.dao;

import com.nisum.model.Employee;

public interface EmployeeRepository  {

    public Employee findByName(String firstName);
   // public List<Employee> findByLastName(String lastName);

	public Employee findById(String username);
	public String removeById(String id);

}
