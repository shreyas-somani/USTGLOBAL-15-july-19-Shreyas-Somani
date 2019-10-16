package com.ust.contect_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/myContext")
public class MyServletContextServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext  context=getServletContext();
		String mynameVal=context.getInitParameter("myname");
		
		
		String mynameVal1=context.getInitParameter("myname2");
		
		
		
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Name value in config is"+mynameVal+"</h2>");
		out.println("<h2>Name value in config is"+mynameVal1+"</h2>");
		out.println("</body>");
		out.println("</html>");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
