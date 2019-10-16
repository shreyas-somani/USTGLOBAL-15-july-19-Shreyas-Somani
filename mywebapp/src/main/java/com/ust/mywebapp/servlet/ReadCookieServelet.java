package com.ust.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getCookieDetails")
public class ReadCookieServelet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		
			if(cookies!=null) {
				
			
			resp.setContentType("text/html");
			for(Cookie cookie:cookies) {
				out.print("<h3>Cookie Value Name="+cookie.getName()+"</h3>");
				out.print("<h3>Cookie Value="+cookie.getValue()+"</h3>");
			
		}
			}
			else {
				out.print("<h2>Cookies Not Present</h2>");
			}
		out.print("</body>");
		out.print("</html>");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
