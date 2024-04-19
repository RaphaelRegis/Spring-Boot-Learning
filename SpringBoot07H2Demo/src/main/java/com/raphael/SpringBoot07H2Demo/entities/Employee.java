package com.raphael.SpringBoot07H2Demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long EmployeeId;
	
	private String name;
	private String position;
	
	//construtores
	public Employee() {
	}
	
	public Employee(long EmployeeId, String name, String position) {
		this.EmployeeId = EmployeeId;
		this.name = name;
		this.position = position;
	}

	//encapsulamento
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	//toString
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", name=" + name + ", position=" + position + "]";
	}

	
	
	
	
	
}
