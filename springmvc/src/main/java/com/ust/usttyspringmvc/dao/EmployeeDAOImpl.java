package com.ust.usttyspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.hibernate.cfg.CreateKeySecondPass;
import org.springframework.stereotype.Repository;

import com.ust.usttyspringmvc.dto.Employee;

@Repository // no difference, we use repository instead of component
public class EmployeeDAOImpl implements EmployeeDAO {
	@PersistenceUnit // it is auto wire function only but as it is orm we use this name
	EntityManagerFactory factory;

	public static void main(String[] args) {

	}

	@Override
	public Employee auth(String email, String password) {

		EntityManager em = factory.createEntityManager();
		String jpql = "From Employee where email=:email and password=:pwd";
		Query query = em.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("pwd", password);
		try {
			
			return (Employee) query.getSingleResult();
		}catch (Exception e) {
			return null;
		}
		
	}	

	@Override
	public boolean register(Employee employee) {
		if (checkEmail(employee.getEmail())) {
			return false;
		}
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(employee);
		tx.commit();
		return true;

	}

	private boolean checkEmail(String email) {
		String jpql = "From Employee where email=:email";
		EntityManager em = factory.createEntityManager();
		Query query = em.createQuery(jpql);
		query.setParameter("email", email);
		try {
			query.getSingleResult();
			return true;
		} catch (Exception e) {
			return false;

		}

	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Employee employee = em.find(Employee.class, id);
		if (employee == null) {
			return false;
		}
		em.remove(employee);
		tx.commit();
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Employee emp = em.find(Employee.class, employee.getId());
		if (emp == null) {
			return false;
		}
		emp.setName(employee.getName());
		emp.setPassword(employee.getPassword());
		emp.setDate(employee.getDate());
		tx.commit();
		return true;

	}

	@Override
	public List<Employee> getAllEmployee() {
		String jpql = "From Employee ";
		EntityManager em = factory.createEntityManager();
		Query query = em.createQuery(jpql);
//		@SuppressWarnings("unchecked")
		List<Employee> employees = query.getResultList();

		return employees;
	}

}
