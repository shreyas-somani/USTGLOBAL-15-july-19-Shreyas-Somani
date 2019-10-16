package com.ust.usttyspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.usttyspringcore.beans.Animal;
import com.ust.usttyspringcore.beans.HelloWorld;
import com.ust.usttyspringcore.beans.Pet;

/**
 * Hello world!
 *
 */
public class XmlConfigApp 
{
    public static void main( String[] args )
    {
      HelloWorld obj1 =new HelloWorld();
		
		  obj1.setMsg("Hello World...................");
		  System.out.println(obj1.getMsg());
		  
		  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		  HelloWorld obj2=context.getBean(HelloWorld.class);
		  System.out.println(obj2.getMsg()); 
		  System.out.println(obj2.getMap()); //
		
		  obj2.getAnimal().makeSound(); // Animal animal =
		/*
		 * context.getBean(Animal.class); Animal animal
		 * =(Animal)context.getBean("human"); animal.makeSound();
		 * 
		 * 
		 * 
		 * Pet pet=context.getBean(Pet.class); System.out.println(pet.getName());
		 * pet.getAnimal().makeSound();
		 */
		 
		 
      
      
     
    }
}
