package com.ust.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateCookie")
public class CreateCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("name", "Guru");
		// cookie will be stored in browser at the client side
		resp.addCookie(cookie);
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<h2> Cookie Created Successfully</h2>");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
