package com.ust.mywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ust.mywebapp.dao.EmployeeDao;
import com.ust.mywebapp.dao.EmpployeeDaoJPAImpl;
import com.ust.mywebapp.dto.EmployeeInfoBean;
@WebServlet("/practice_login")
public class MyLoginServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher=req.getRequestDispatcher("/practice_login.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String password =req.getParameter("password");
		//hibernate request to validate user
		
		EmployeeDao dao=new EmpployeeDaoJPAImpl();
		EmployeeInfoBean bean=dao.login(Integer.parseInt(id), password);
		String url=null;
		if(bean!=null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("bean", bean);
			url="/home.jsp";
			
		
		}else {
			url="/practice_login.jsp";
		}
		
		RequestDispatcher dispatcher=req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
		
	}
	

	public MyLoginServlet() {
		// TODO Auto-generated constructor stub
	}

}
