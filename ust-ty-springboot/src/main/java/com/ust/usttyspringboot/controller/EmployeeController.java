package com.ust.usttyspringboot.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.usttyspringboot.dto.Employee;
import com.ust.usttyspringboot.dto.EmployeeResponse;
import com.ust.usttyspringboot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*", allowedHeaders = "*",allowCredentials = "true")
public class EmployeeController {

	@Autowired
	@Qualifier("jpa")
	private EmployeeService service;
	
	
	@GetMapping(path = "/get-all-name", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployeesByName(@RequestParam("name") String name) {
		EmployeeResponse response = new EmployeeResponse();
		List<Employee> employees = service.getAllEmployeesByName(name);
		if (employees == null) {
			response.setStatuscode(401);
			response.setMesage("Failure");
			response.setDescription("No data Found");
		} else {

			response.setStatuscode(201);
			response.setMesage("Success");
			response.setDescription("Data Found");
			response.setEmployees(employees);
		}
		return response;
	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id) {
		Employee employee = service.getEmployee(id);
		EmployeeResponse response = new EmployeeResponse();
		if (employee == null) {
			response.setStatuscode(401);
			response.setMesage("Failure");
			response.setDescription("No data Found");
		} else {

			response.setStatuscode(201);
			response.setMesage("Success");
			response.setDescription("Data Found");
			response.setEmployees(Arrays.asList(employee));
		}
		return response;
	}

	@GetMapping(path = "/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployees() {
		List<Employee> employee = service.getAllEmployees();
		
		EmployeeResponse response = new EmployeeResponse();
		if (employee.isEmpty()) {
			response.setStatuscode(401);
			response.setMesage("Failure");
			response.setDescription("No data Found");
		} else {
			response.setStatuscode(201);
			response.setMesage("Success");
			response.setDescription("All Data Found");
			response.setEmployees(employee);
		}
		return response;
	}

	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody Employee employee) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.addEmployee(employee)) {
			response.setStatuscode(201);
			response.setMesage("Success");
			response.setDescription("Data Added");
			List<Employee> employees = service.getAllEmployees();
			response.setEmployees(employees);
		} else {
			response.setStatuscode(201);
			response.setMesage("Failure");
			response.setDescription("No Data Added");
		}
		return response;

	}

	@PutMapping(path = "/modify", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody Employee employee) {
		EmployeeResponse response = new EmployeeResponse();
		if ( service.modifyEmployee(employee)) {
			response.setStatuscode(201);
			response.setMesage("Success");
			response.setDescription("Modification Done");
			List<Employee> employees = service.getAllEmployees();
			response.setEmployees(employees);
		} else {
			response.setStatuscode(401);
			response.setMesage("Failure");
			response.setDescription("NO modification Done");
		}
		return response;
	}

	@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse removeEmployee(@PathVariable("id") int id) {
		EmployeeResponse response = new EmployeeResponse();
		if (service.removeEmployee(id)) {
			response.setStatuscode(401);
			response.setMesage("Success");
			response.setDescription("Data Deleted");
		} else {
			response.setStatuscode(201);
			response.setMesage("Failure");
			response.setDescription("No data Deleted");
		}
		return response;
	}
	
	@GetMapping("/exce")
	public String throwsException() throws Exception{
		throw new Exception();
		
	}
	}


