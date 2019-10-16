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
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String id=req.getParameter("id");
			EmployeeDao dao = new EmpployeeDaoJPAImpl();
			dao.deleteEmployee(Integer.parseInt(id));
			HttpSession session=req.getSession(false);
			session.invalidate();
			resp.sendRedirect("./practice_login");
			}
	

	public DeleteServlet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
