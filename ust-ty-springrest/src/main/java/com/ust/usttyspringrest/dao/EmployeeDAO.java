package com.ust.usttyspringrest.dao;

import java.util.List;

import com.ust.usttyspringrest.dto.Employee;



public interface EmployeeDAO {
	public boolean addEmployee(Employee employee); 
	public boolean removeEmployee(int id);
	public boolean modifyEmployee(Employee employee);
	public List <Employee> getAllEmployees();
	public Employee getEmployee(int id);

	

}
