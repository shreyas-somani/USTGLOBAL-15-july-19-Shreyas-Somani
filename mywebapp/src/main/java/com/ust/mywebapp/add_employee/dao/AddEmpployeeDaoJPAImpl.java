package com.ust.mywebapp.add_employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.mywebapp.dao.EmployeeDao;
import com.ust.mywebapp.dto.EmployeeInfoBean;

public class AddEmpployeeDaoJPAImpl implements AddEmployeeDao{
	@Override
	public EmployeeInfoBean addEmployee(int id, String name, int age, double sal) {
		EmployeeInfoBean info=new EmployeeInfoBean();
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(info);
		et.commit();
		
		return null;
		
//		EmployeeInfoBean eif=null;
//		
//		try {
//			eif=em.find(EmployeeInfoBean.class,id);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return eif;
		
	}


}
