package com.ust.mywebapp.dao;

import com.ust.mywebapp.dto.EmployeeInfoBean;

public interface EmployeeDao {
	
	public EmployeeInfoBean searchEmployee(int id);
	public void addEmployee(EmployeeInfoBean  bean);
	public EmployeeInfoBean login(int empId,String password);
	public void deleteEmployee(int empId);
	
	

}
