package com.ust.usttyspringboot.dto;

import java.util.List;

public class EmployeeResponse {
	public int getStatuscode() {
		return statuscode;
	}


	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}


	public int statuscode;
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


	public String mesage;
	private String description;
	private List<Employee> employees;

	public EmployeeResponse() {
		// TODO Auto-generated constructor stub
	}

}
