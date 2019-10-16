package com.ust.usttyspringboot.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ust.usttyspringboot.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Transactional
	@Modifying
	@Query("Update Employee set name=:name ,password=:password where id=:id")
	public void update (@Param("id") int id,@Param("password") String password,@Param("name")String name);
	
	

}
