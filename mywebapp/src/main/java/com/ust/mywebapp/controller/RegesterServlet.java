package com.ust.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.mywebapp.dao.EmployeeDao;
import com.ust.mywebapp.dao.EmpployeeDaoJPAImpl;
import com.ust.mywebapp.dto.EmployeeInfoBean;
import com.ust.mywebapp.util.EmployeeDaoFactory;
@WebServlet("/regester")

public class RegesterServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher=req.getRequestDispatcher("/regestration.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String salary=req.getParameter("salary");
		String designation=req.getParameter("designation");
		String password=req.getParameter("password");
		
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setEmpId(Integer.parseInt(id));
		bean.setEmpName(name);
		bean.setAge(Integer.parseInt(age));
		bean.setSalary(Double.parseDouble(salary));
		bean.setDesignation(designation);
		bean.setPassword(password);
		
		EmployeeDao dao=EmployeeDaoFactory.getEmployeeDao();
		dao.addEmployee(bean);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("practice_login.jsp");
		dispatcher.forward(req, resp);
	}

	public RegesterServlet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
