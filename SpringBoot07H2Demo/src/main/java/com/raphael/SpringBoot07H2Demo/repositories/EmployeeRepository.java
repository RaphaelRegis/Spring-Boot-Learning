package com.raphael.SpringBoot07H2Demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raphael.SpringBoot07H2Demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public Employee findByName(String name);
	public List<Employee> findByPosition(String position);

}
