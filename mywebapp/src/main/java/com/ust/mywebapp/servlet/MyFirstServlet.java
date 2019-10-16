package com.ust.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myFirstServlet")
public class MyFirstServlet extends HttpServlet {
	public MyFirstServlet() {
		System.out.println("Instantiation");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("init");
		System.out.println("Service");
	}
	@Override
	public void destroy() {
		System.out.println("Destroy");
	}
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		Date date =new Date();
		
		
		ServletConfig config=getServletConfig();
		String nameVal=config.getInitParameter("name");
		
		ServletContext context= getServletContext();
		String mynameVal=context.getInitParameter("myname");
		
		
		resp.setContentType("text/html");
//		resp.setHeader("refresh", "1");
		PrintWriter out=resp.getWriter();
		
		out.println("<head>");
		out.println("<meta http-equiv=\"refresh\" content=\"1\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Current System Date and Time<br/>");
		out.println(date);
		out.println("<h2>Name value in config is"+nameVal+"</h2>");
		out.println("<h2>Name value in config is"+mynameVal+"</h2>");
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
