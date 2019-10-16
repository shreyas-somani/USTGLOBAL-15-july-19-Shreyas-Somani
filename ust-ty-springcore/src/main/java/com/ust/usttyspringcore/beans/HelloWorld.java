package com.ust.usttyspringcore.beans;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("hello")
public class HelloWorld implements InitializingBean, DisposableBean {
	
	
	private String msg;
	@Autowired
	@Qualifier("human")
	private Animal animal;
	private Map<String,Integer> map;
	



	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

	public HelloWorld() {
		System.out.println("Hello World object Created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@PreDestroy
	@Override
	public void destroy() throws Exception {
		System.out.println("This is Hello World Destroy Method");
		
	}
	@PostConstruct
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is after Properties Set Method");
		
	}

}
