package com.ust.usttyspringcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal {

	public Dog() {
		System.out.println("Dog object Created");
	}

	@PostConstruct
	public void init() {
		System.out.println("Dog init Method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Dog destroy method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void makeSound() {
		System.out.println("Baoooooooooooooo............");

	}

}
