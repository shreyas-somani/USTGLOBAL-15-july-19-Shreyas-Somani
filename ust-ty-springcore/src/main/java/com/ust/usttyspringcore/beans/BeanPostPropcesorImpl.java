package com.ust.usttyspringcore.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostPropcesorImpl implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("Bean name : "+beanName);
	return bean;
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("Bean name : "+beanName);
		if(beanName.equals("obj")) {
			System.out.println("Hello World Before Init");
			
		}else if(beanName.equals("dog")) {
			System.out.println("Dog before init");
			
		}
		return bean;
	}

	public BeanPostPropcesorImpl() {
		// TODO Auto-generated constructor stub
	}

}
