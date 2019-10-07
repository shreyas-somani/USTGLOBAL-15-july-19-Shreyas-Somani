package com.ust.usttyspringboottest.service;

import java.util.List;

import com.ust.usttyspringboottest.dto.TaskManager;



public interface TaskService {
	public boolean addTask(TaskManager task); 
	public boolean removeTask(int id);
	public boolean modifyTask(TaskManager task);
	public List <TaskManager> getAllTasks();
	

}
