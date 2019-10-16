package com.ust.mywebapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.mywebapp.add_employee.dao.AddEmployeeDao;
import com.ust.mywebapp.dto.EmployeeInfoBean;

public class EmpployeeDaoJPAImpl implements EmployeeDao{
	
	public EmployeeInfoBean login(int empId,String password) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em=emf.createEntityManager();
		EmployeeInfoBean eif=null;
		
		String jpaQuery="from EmployeeInfoBean where empId=:id and password=:pwd";
		Query query = em.createQuery(jpaQuery);
		query.setParameter("id",empId);
		query.setParameter("pwd", password);
		
		try {
			eif=(EmployeeInfoBean) query.getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eif;
		
	}//end of login

	@Override
	public void addEmployee(EmployeeInfoBean  bean) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		em.persist(bean);
		transaction.commit();
		
	}
	
	@Override
	public void deleteEmployee(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		EmployeeInfoBean bean=em.find(EmployeeInfoBean.class, id);
		transaction.begin();
		em.remove(bean);
		transaction.commit();
		
	}
	@Override
	public EmployeeInfoBean searchEmployee(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em=emf.createEntityManager();
		EmployeeInfoBean eif=null;
		try {
			eif=em.find(EmployeeInfoBean.class,id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eif;
	}

	

	

}
