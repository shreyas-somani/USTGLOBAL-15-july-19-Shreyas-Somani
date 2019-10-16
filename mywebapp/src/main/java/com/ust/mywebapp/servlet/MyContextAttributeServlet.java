package com.ust.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.mywebapp.dto.EmployeeInfoBean;

@WebServlet("/contextAttr")
public class MyContextAttributeServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
		employeeInfoBean.setEmpId(99);
		employeeInfoBean.setEmpName("Hara");
		employeeInfoBean.setAge(65000);
		employeeInfoBean.setSalary(546464684);
		employeeInfoBean.setDesignation("Best");
		
		ServletContext context= getServletContext();
		context.setAttribute("emp", employeeInfoBean);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<head>");
		out.println("<body>");
		out.println("<h3>Context Attributes hs been set............</h3>");
		out.println("</body>");
		out.println("</head>");
	
	
	
	}

	public MyContextAttributeServlet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
