package com.ust.usttyspringrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ust.usttyspringrest.dto.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	

	

	@Override
	public boolean addEmployee(Employee employee) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			manager.persist(employee);
			tx.commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean removeEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		Employee employee = manager.find(Employee.class, id);
		try {
			manager.remove(employee);
			tx.commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		Employee emp = manager.find(Employee.class, employee.getId());
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
	public Employee getEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Employee.class, id);

	}

	@Override
	public List<Employee> getAllEmployees() {
		String jpql = "From Employee ";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		List<Employee> employees = query.getResultList();

		return employees;
	}

}
