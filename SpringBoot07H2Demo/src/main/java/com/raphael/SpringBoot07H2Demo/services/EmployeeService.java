package com.raphael.SpringBoot07H2Demo.services;

import java.util.List;

import com.raphael.SpringBoot07H2Demo.entities.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> findAllEmployees();

	Employee findEmployeeById(int id);
	
	Employee deleteEmployee(int id);
	
	Employee updateEmployee(int id, Employee employee);
	
	Employee findEmployeeByName(String name);
	
	List<Employee> findByPosition(String position);

}
