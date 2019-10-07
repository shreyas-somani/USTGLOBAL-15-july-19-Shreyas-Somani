package com.ust.usttyspringboottest.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="task")
public class TaskManager {
	@Id
	@Column
	@GeneratedValue
	private Integer id;
	@Column(nullable=false)
	private String task;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Column
	@GeneratedValue
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date startDate;
	
	@Column
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date endDate;


}
