package com.ust.mywebapp.util;

import java.security.PublicKey;

import com.ust.mywebapp.dao.EmployeeDao;
import com.ust.mywebapp.dao.EmpployeeDaoJPAImpl;

public class EmployeeDaoFactory {

	private EmployeeDaoFactory() {}
		public static EmployeeDao getEmployeeDao() { 
			return new EmpployeeDaoJPAImpl();
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
