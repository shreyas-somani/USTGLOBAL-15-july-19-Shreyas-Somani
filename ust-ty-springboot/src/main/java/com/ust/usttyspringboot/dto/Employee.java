package com.ust.usttyspringboot.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column
	@GeneratedValue
	private Integer id;
	@Column(nullable=false)
	private String name;
	@Column(unique=true, nullable=false,updatable=false)
	private String email;
	@Column
	private String password;
	@Column(updatable=true)
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
