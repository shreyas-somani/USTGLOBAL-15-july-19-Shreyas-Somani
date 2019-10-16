package com.ust.usttyspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.usttyspringboot.dto.Employee;
import com.ust.usttyspringboot.repository.EmployeeRepository;

@Service("jpa")
public class EmployeeServiceJPAImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;
	@Override
	public boolean addEmployee(Employee employee) {
		repository.save(employee);
		return true;
	}

	@Override
	public boolean removeEmployee(int id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		//make method using interface
		repository.update(employee.getId(), employee.getPassword(), employee.getName());
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		
		return repository.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Employee> getAllEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
