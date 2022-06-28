package com.example3.demo3.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example3.demo3.Model.Manager_AWS;
import com.example3.demo3.Model.Pilot_AMS;

public interface PilotRepository extends JpaRepository<Pilot_AMS, Integer> {
	public List<Pilot_AMS> findAll();
	
	@Query(value="select MAX(id) from Pilot_AMS")
	public int getLastId();
}
