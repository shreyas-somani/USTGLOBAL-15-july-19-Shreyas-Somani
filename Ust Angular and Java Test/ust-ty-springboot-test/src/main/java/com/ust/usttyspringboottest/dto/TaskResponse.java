package com.ust.usttyspringboottest.dto;

import java.util.List;

public class TaskResponse {
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<TaskManager> getManager() {
		return manager;
	}
	public void setManager(List<TaskManager> manager) {
		this.manager = manager;
	}

	public int statusCode;
	public String message;
	private String description;
	private List<TaskManager> manager;


}
