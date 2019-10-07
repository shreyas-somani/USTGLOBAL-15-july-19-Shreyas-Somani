package com.ust.usttyspringboottest.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ust.usttyspringboottest.dto.TaskManager;

public interface TaskRepository extends JpaRepository<TaskManager, Integer> {
	@Transactional
	@Modifying
	@Query("update TaskManager t set t.endDate=:endDate where t.id=:id")
	public void update (@Param("endDate")Date endDate,@Param("id") int id);

}
