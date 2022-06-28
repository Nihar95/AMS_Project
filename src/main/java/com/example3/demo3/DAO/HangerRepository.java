package com.example3.demo3.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example3.demo3.Model.Hanger_AMS;



public interface HangerRepository extends JpaRepository<Hanger_AMS,Integer>{
	@Query(value="select MAX(hangerId) from Hanger_AMS")
	public int getLastId();
	
	@Query(value="select * from Hanger_AMS where status <> 0", nativeQuery = true)
	public List<Hanger_AMS> getAllEmptyHangerDetails();
	
}
