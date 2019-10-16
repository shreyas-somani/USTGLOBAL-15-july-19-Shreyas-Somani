package com.ust.mywebapp.search_employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ust.mywebapp.dao.EmployeeDao;
import com.ust.mywebapp.dao.EmpployeeDaoJPAImpl;
import com.ust.mywebapp.dto.EmployeeInfoBean;
@WebServlet("/searchEmp1")
public class SearchEmployeeServlet  extends HttpServlet{
	
	
	private EmployeeDao dao=new EmpployeeDaoJPAImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
		
		String empIdVal=req.getParameter("empId");
		int empId=Integer.parseInt(empIdVal);
		EmployeeInfoBean employeeInfoBean=dao.searchEmployee(empId);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(employeeInfoBean!=null) {
			out.println("<h2 Employee Details for emp id"+empId+"   </h2>");
			out.println("Employee Id : "+employeeInfoBean.getEmpName());
			out.println("</br>Employee Age :"+employeeInfoBean.getAge());
			out.println("</br>Employee Salary :"+employeeInfoBean.getSalary());
			out.println("</br>Employee Designation :"+employeeInfoBean.getDesignation());
			out.println("</br>Employee Age :"+employeeInfoBean.getEmpId());
			
		}
		else {
			out.println("<h2> No Record For the Employee is Found</h2>");
			
		}
		out.println("</body>");
		out.println("</html>");
		
	}
else {
	resp.sendRedirect("/loginForm.html");
}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
