package com.ust.usttyspringboottest.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.usttyspringboottest.dto.TaskManager;
import com.ust.usttyspringboottest.repository.TaskRepository;

@Service("jpa")
public class TaskServiceJPAImpl implements TaskService {
	@Autowired
	TaskRepository repository;

	@Override
	public boolean addTask(TaskManager task) {
		Date startDate= new Date();
	task.setStartDate(startDate);
		repository.save(task);
		return true;
	}

	@Override
	public boolean removeTask(int id) {
		repository.deleteById(id);
		return true;
	}

	@Override
	public boolean modifyTask(TaskManager task) {
		Date endDate = new Date();
		task.setEndDate(endDate);
		repository.update(endDate,task.getId());
		return true;
	}

	@Override
	public List<TaskManager> getAllTasks() {
		return repository.findAll();
	}

}
