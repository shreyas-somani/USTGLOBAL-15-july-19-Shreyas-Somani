package com.ust.mywebapp.add_employee.dao;

import com.ust.mywebapp.dto.EmployeeInfoBean;

public interface AddEmployeeDao {
	
	public EmployeeInfoBean addEmployee(int id,String name,int age,double sal);
	
	

}
