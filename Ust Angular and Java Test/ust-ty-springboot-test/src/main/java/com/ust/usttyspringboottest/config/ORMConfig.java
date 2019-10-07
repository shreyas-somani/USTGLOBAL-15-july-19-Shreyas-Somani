package com.ust.usttyspringboottest.config;

import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

public class ORMConfig {
//	@Bean
	public LocalEntityManagerFactoryBean ormConfiguration() {
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("employee-unit");
		return bean;
	}
}
