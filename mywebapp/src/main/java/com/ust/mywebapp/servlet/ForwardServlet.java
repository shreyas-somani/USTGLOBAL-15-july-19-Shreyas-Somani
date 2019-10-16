package com.ust.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.mywebapp.dto.EmployeeInfoBean;
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//we need one request Dispatcher Object
		
		//we cannot forwar and include to the external resources
		EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
		employeeInfoBean.setAge(999);
		employeeInfoBean.setEmpName("Hari");
		employeeInfoBean.setAge(5);
		employeeInfoBean.setSalary(546464684);
		employeeInfoBean.setDesignation("Hello");
		req.setAttribute("employee", employeeInfoBean);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/reqAttribute");
		dispatcher.forward(req, resp);
	
	}

	public ForwardServlet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
