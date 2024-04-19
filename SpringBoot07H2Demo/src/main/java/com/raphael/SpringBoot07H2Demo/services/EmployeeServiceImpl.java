package com.raphael.SpringBoot07H2Demo.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphael.SpringBoot07H2Demo.entities.Employee;
import com.raphael.SpringBoot07H2Demo.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findEmployeeById(int id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee employee = findEmployeeById(id);
		employeeRepository.deleteById(id);
		return employee;
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		Employee employeeExistente = findEmployeeById(id);
		
		BeanUtils.copyProperties(employee, employeeExistente);
		
		return employeeRepository.save(employeeExistente);
	}

	@Override
	public Employee findEmployeeByName(String name) {
		return employeeRepository.findByName(name);
	}

	@Override
	public List<Employee> findByPosition(String position) {
		return employeeRepository.findByPosition(position);
	}

}
