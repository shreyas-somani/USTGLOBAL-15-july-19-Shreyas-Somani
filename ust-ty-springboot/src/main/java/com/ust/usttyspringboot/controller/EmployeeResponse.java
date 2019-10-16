package com.ust.usttyspringboot.controller;

import java.util.List;

import com.ust.usttyspringboot.dto.Employee;

public class EmployeeResponse {

	private int statuscode;
	private String mesage;
	private String description;
	private List<Employee> employees;
	
	public int getStatusCode() {
		return statuscode;
	}
	public void setStatusCode(int statusCode) {
		this.statuscode = statusCode;
	}
	
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMesage() {
		return mesage;
	}
	public void setMesage(String mesage) {
		this.mesage = mesage;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}