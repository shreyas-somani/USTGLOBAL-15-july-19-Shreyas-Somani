package com.ust.springcore.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("author.xml");
		WriterBean obj=context.getBean(WriterBean.class);
		System.out.println(obj.getName());
		obj.getWriter().write();
		
	}

}
