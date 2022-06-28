package com.example3.demo3.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example3.demo3.Model.Manager_AWS;
import com.example3.demo3.Model.Owner_AMS;

public interface OwnerRepository extends JpaRepository<Owner_AMS, Integer> {
	public Owner_AMS findById(int id);
	
	@Query(value="select MAX(ownerId) from Owner_AMS")
	public int getLastId();
}