package com.ust.usttyspringcore.config;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ust.usttyspringcore.beans.Animal;
import com.ust.usttyspringcore.beans.Dog;
import com.ust.usttyspringcore.beans.HelloWorld;
import com.ust.usttyspringcore.beans.Human;
@Configuration
public class BeanConfig {
	//@Bean(name="obj",autowire = Autowire.BY_TYPE)
	@Bean(name="obj")
	public HelloWorld getHelloWorld() {
		HelloWorld helloWorld=new HelloWorld();
		helloWorld.setMsg("Hello World");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("xyz",987);
		helloWorld.setMap(map);
		Animal animal= getDog();
		//helloWorld.setAnimal(getDog());
		return helloWorld;
	}
	@Bean(name="dog")
	//@Scope(value = "prototype")
	public Dog getDog() {
		
		
		return new Dog();
	}
	public BeanConfig() {
	
		
	}
	@Bean(name="human")
	public Human getHuman() {
		return new Human();
	}

	public static void main(String[] args) {
		

	}

}
