package com.usr.http.htppServelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletConfigServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		String nameVal=config.getInitParameter("name");
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Name value in config is"+nameVal+"</h2>");
		out.println("</body>");
		out.println("</html>");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
