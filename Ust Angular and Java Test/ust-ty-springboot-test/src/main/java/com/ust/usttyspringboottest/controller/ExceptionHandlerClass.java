package com.ust.usttyspringboottest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ExceptionHandlerClass {
	@ExceptionHandler(Exception.class)
	public String catchException() {
		System.out.println("Handle Exception2");
		return"Handle Exception";
	}
}

