package com.ust.usttyspringrest.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.usttyspringrest.dto.Employee;
import com.ust.usttyspringrest.dto.EmployeeResponse;
import com.ust.usttyspringrest.service.EmployeeService;

import antlr.collections.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id) {
		Employee  employee = service.getEmployee(id);
		EmployeeResponse response = new EmployeeResponse();
		if (employee == null) {
			response.setStatuscode(401);
			response.setMesage("Failure");
			response.setDescription("No Data Found");

		} else {
			response.setStatuscode(201);
			response.setMesage("Success");
			response.setDescription("Data Found");
			response.setEmployees(Arrays.asList(employee));

		}
		return response;
	}

	@GetMapping(path = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() {
		java.util.List<Employee> employee =service.getAllEmployees();
		EmployeeResponse response = new EmployeeResponse();
		if (employee == null) {
			response.setStatuscode(401);
			response.setMesage("Failure");
			response.setDescription("No Data Found");
			
			
			
			
			

		} else {
			response.setStatuscode(201);
			response.setMesage("Success");
			response.setDescription("Data Found");
			response.setEmployees(employee);
			
			

		}
		return response;
		
	}

	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody Employee employee) {
		boolean emp=service.addEmployee(employee);
		EmployeeResponse response = new EmployeeResponse();
		
		if (emp !=true) {
			response.setStatuscode(401);
			response.setMesage("Failure");
			response.setDescription("No Data Added");
			java.util.List<Employee> employees =service.getAllEmployees();
			response.setEmployees(employees);

		} else {
			response.setStatuscode(201);
			response.setMesage("Success");
			response.setDescription("Data Added");
			java.util.List<Employee> employees =service.getAllEmployees();
			response.setEmployees(employees);
		

		}
		return response;
	}

	@PutMapping(path = "/modify", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody Employee employee) {
		
		boolean emp=service.modifyEmployee(employee);
		EmployeeResponse response = new EmployeeResponse();
		if (emp !=true) {
			response.setStatuscode(401);
			response.setMesage("Failure");
			response.setDescription("No Change Made");
			java.util.List<Employee> employees =service.getAllEmployees();
			response.setEmployees(employees);
			
			
			

		} else {
			response.setStatuscode(201);
			response.setMesage("Success");
			response.setDescription("Changes Made");
			java.util.List<Employee> employees =service.getAllEmployees();
			response.setEmployees(employees);
			

		}
		return response;
	}

	@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse removeEmployee(@PathVariable("id") int id) {
		
		boolean emp = service.removeEmployee(id);
		EmployeeResponse response = new EmployeeResponse();
		if (emp !=true) {
			response.setStatuscode(401);
			response.setMesage("Failure");
			response.setDescription("No Data Deleted");
			java.util.List<Employee> employee =service.getAllEmployees();
			response.setEmployees(employee);
			

		} else {
			response.setStatuscode(201);
			response.setMesage("Success");
			response.setDescription("Data Found");
			java.util.List<Employee> employee =service.getAllEmployees();
			response.setEmployees(employee);
			

		}
		return response;

	}

}
