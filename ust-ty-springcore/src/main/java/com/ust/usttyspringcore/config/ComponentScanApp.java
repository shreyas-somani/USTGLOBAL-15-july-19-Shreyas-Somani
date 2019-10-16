package com.ust.usttyspringcore.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.usttyspringcore.beans.HelloWorld;

public class ComponentScanApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloWorld obj=context.getBean(HelloWorld.class);
		obj.getAnimal().makeSound();
		
		// TODO Auto-generated method stub

	}

}
