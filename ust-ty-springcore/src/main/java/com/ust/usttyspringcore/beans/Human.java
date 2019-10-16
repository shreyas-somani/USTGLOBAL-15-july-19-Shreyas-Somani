package com.ust.usttyspringcore.beans;

import org.springframework.stereotype.Component;

@Component("human")
public class Human implements Animal {

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void makeSound() {
		System.out.println("Bla bla bla bla bla...............");
		
	}

}
