package com.ust.usttyspringboottest.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.ust.usttyspringboottest.dto.TaskManager;
import com.ust.usttyspringboottest.dto.TaskResponse;
import com.ust.usttyspringboottest.service.TaskService;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class TaskController {
	@Autowired
	@Qualifier("jpa")
	private TaskService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping(path = "/get-all-tasks", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse getAllTasks() {
		List<TaskManager> manager = service.getAllTasks();

		TaskResponse response = new TaskResponse();
		if (manager.isEmpty()) {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data Found");
		} else {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("All Data Found");
			response.setManager(manager);
		}
		return response;
	}

	@PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse addNewTask(@RequestBody TaskManager manager) {
		TaskResponse response = new TaskResponse();
		if (service.addTask(manager)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Added");
			response.setManager(Arrays.asList(manager));
			
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No Data Added");
		}
		return response;

	}

	@DeleteMapping(path = "/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse deleteTasks(@PathVariable("id") int id) {
		TaskResponse response = new TaskResponse();
		if (service.removeTask(id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Data Deleted");
			
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data Deleted");
		}
		return response;
	}

	@PutMapping(path = "/modify", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse modifyTasks(@RequestBody TaskManager manager) {
		TaskResponse response = new TaskResponse();
		if (service.modifyTask(manager)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Modification Done");
		response.setManager(Arrays.asList(manager));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("NO modification Done");
		}
		return response;
	}
	@GetMapping("/exce")
	public String throwsException() throws Exception{
		throw new Exception();
		
	}

}
