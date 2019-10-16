package com.ust.usttyspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.print.DocFlavor.STRING;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ust.usttyspringmvc.dto.Employee;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@RequestMapping(path = "/world", method = RequestMethod.GET)
	public String hello(ModelMap map) {
		map.addAttribute("msg", "Hello World!!!!!!!!!!!!!");

		// model map for one request cycle ,then it is destroyed
		return "index";
	}

	@RequestMapping(path = "/query", method = RequestMethod.GET)
	public String getInfo(@RequestParam("id") int id, @RequestParam("name") String name, ModelMap map) {
		map.addAttribute("id", id);
		map.addAttribute("name", name);
		return "info";
	}

	@RequestMapping(path = "/form-page", method = RequestMethod.GET)
	public String getForm() {
		return "form";
	}

	/*
	 * @RequestMapping(path = "/form", method = RequestMethod.POST) public String
	 * formData(String id, String name, String email, String password, ModelMap map)
	 * {
	 * 
	 * map.addAttribute("id", id); map.addAttribute("email", email);
	 * map.addAttribute("password", password); map.addAttribute("name", name);
	 * 
	 * return "info"; }
	 */
	@RequestMapping(path = "/form", method = RequestMethod.POST)
	public String formData(Employee emp, ModelMap map) {
		map.addAttribute("id", emp.getId());
		map.addAttribute("email", emp.getEmail());
		map.addAttribute("password", emp.getPassword());
		map.addAttribute("name", emp.getName());
		map.addAttribute("date", emp.getDate());

		return "info";
	}

	@RequestMapping(path = "/add-cookie", method = RequestMethod.GET)
	public String addCookie(HttpServletResponse response, ModelMap map) {
		Cookie cookie = new Cookie("name", "Sudeep");

		response.addCookie(cookie);
		map.addAttribute("msg", "Cookie added to browser");

		return "cookie";
	}

	@RequestMapping(path="/get-cookie", method = RequestMethod.GET)
	public String getCookie(@CookieValue (name="name",required = false)String name ,ModelMap map) {
		if(name==null) {
			map.addAttribute("msg", "Cookie is Not Present");
		}else {
			map.addAttribute("msg", "Cookie value= "+name);
		}
		return "cookie";
		}
		
		
		@RequestMapping(path = "/path/{id}/{name}" , method = RequestMethod.GET)
		public String getPathValues(@PathVariable ("id") int id,@PathVariable("name")String name,ModelMap map) {
			map.addAttribute("id", id);
			map.addAttribute("name", name);
			
			return "info";
		}
		
		@RequestMapping(path = "/set-attribute",method = RequestMethod.GET)
		public String setSessionAttribute(HttpSession session,ModelMap map) {
			Employee employee=new Employee();
			employee.setId(99);
			employee.setName("SHREYAS");
			employee.setEmail("shreyassomani27@gmail.com");
			employee.setPassword("qwerty");
			session.setAttribute("emp", employee);
			map.addAttribute("msg","sesion attribute added" );
	
			return "index";
		}
		
		@RequestMapping(path = "/get-attribute", method = RequestMethod.GET)
		public String getSessionAttribute( ModelMap map,
				@SessionAttribute(name="emp", required = false)
		Employee employee) {
			
			if(employee==null) {
				map.addAttribute("msg", "No attribute present");
				
			}else {
				System.out.println(employee.getName());
				System.out.println(employee.getId());
				map.addAttribute("msg", "Got the attribute");
			}
			return "index";
		}
		@RequestMapping(path = "/forward", method = RequestMethod.GET)
		public String forward() {
			return "forward:add-cookie";
		}
		@RequestMapping(path = "/redirect", method = RequestMethod.GET)
		public String redirect() {
			return "redirect:http://www.google.com";
		}

}
