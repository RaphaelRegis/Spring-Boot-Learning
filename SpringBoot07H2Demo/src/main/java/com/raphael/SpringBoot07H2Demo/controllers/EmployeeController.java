package com.raphael.SpringBoot07H2Demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raphael.SpringBoot07H2Demo.entities.Employee;
import com.raphael.SpringBoot07H2Demo.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;	
	
	//método para salvar um Employee no database
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	//método para retornar todos os Employees do database
	@GetMapping("/employees")
	public List<Employee> findAllEmployees(){
		return employeeService.findAllEmployees();
	}
	
	//método para retornar um Employee de acordo com seu ID
	@GetMapping("/employees/{id}")
	public Employee findEmployeeById(@PathVariable("id") int id) {
		return employeeService.findEmployeeById(id);
	}
	
	//método para excluir um Employee de acordo com seu ID
	@DeleteMapping("/employees/{id}")
	public Employee deleteEmployeeById(@PathVariable("id") int id) {
		return employeeService.deleteEmployee(id);
	}
	
	//método para atualizar um Employee de acordo com seu ID
	@PatchMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
		return employeeService.updateEmployee(id, employee);
	}
	
	//método para encontrar Employee pelo nome
	@GetMapping("/employees/name/{name}")
	public Employee findEmployeeByName(@PathVariable String name) {
		return employeeService.findEmployeeByName(name);
	}
	
	//método para encontrar Employees pela posição
	@GetMapping("employees/position/{position}")
	public List<Employee> findEmployeesByPosition(@PathVariable String position){
		return employeeService.findByPosition(position);
	}
	
}
