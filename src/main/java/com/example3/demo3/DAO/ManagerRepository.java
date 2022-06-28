package com.example3.demo3.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example3.demo3.Model.Manager_AWS;

public interface ManagerRepository extends JpaRepository<Manager_AWS, Integer> {
	@Query(value="select MAX(managerId) from Manager_AWS")
	public int getLastId();
	
	
}
