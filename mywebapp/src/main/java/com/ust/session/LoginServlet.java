package com.ust.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ust.mywebapp.dao.EmployeeDao;
import com.ust.mywebapp.dao.EmpployeeDaoJPAImpl;
import com.ust.mywebapp.dto.EmployeeInfoBean;
@WebServlet("/login1")
public class LoginServlet extends HttpServlet {
	EmployeeDao dao=new EmpployeeDaoJPAImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the form Data
		
		String emIdVal = req.getParameter("empId");
		String password = req.getParameter("password");
		
		int empId=Integer.parseInt(emIdVal);
		
		EmployeeInfoBean employeeInfoBean=dao.login(empId,password);
		if(employeeInfoBean!=null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("employeeInfo",employeeInfoBean);
			
			resp.sendRedirect("./homePage.html");
			
		}else {
			resp.sendRedirect("./loginForm.html");
		}
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
