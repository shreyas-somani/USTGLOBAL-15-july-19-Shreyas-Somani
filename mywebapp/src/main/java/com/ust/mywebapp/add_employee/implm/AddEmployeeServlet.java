package com.ust.mywebapp.add_employee.implm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ust.mywebapp.add_employee.dao.AddEmployeeDao;
import com.ust.mywebapp.add_employee.dao.AddEmpployeeDaoJPAImpl;
import com.ust.mywebapp.dao.EmployeeDao;
import com.ust.mywebapp.dao.EmpployeeDaoJPAImpl;
import com.ust.mywebapp.dto.EmployeeInfoBean;
@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet{
	
	private AddEmployeeDao daoone=new AddEmpployeeDaoJPAImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		
		String empIdVal=req.getParameter("empId");
		int empId=Integer.parseInt(empIdVal);
		
		String empName=req.getParameter("emp_name");

		
		String empAgeVal=req.getParameter("age");
		int empAge=Integer.parseInt(empAgeVal);
		
		String empSalVal=req.getParameter("salary");
		double empSalary=Double.parseDouble(empSalVal);
		
		String empDesignation=req.getParameter("designation");
		
		EmployeeInfoBean employeeInfoBean=daoone.addEmployee(empId,empName,empAge,empSalary);
		
			
		
		if(employeeInfoBean.getEmpId()==empId) {
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2> employee Cannot Be Added</h2>");
			out.println("</body>");
			out.println("</html>");
			
		}else {
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2> employee has been Added</h2>");
			out.println("</body>");
			out.println("</html>");
			
		}
		}
		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
	}

}
