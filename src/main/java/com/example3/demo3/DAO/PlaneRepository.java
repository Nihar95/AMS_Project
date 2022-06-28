package com.example3.demo3.DAO;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example3.demo3.Model.Hanger_AMS;

import com.example3.demo3.Model.Plane_AMS;

public interface PlaneRepository extends JpaRepository<Plane_AMS, Integer> {
//	public Plane_AMS findById(String id);
	
//	@Query(value = "select id, name from Customer ")
//	List<Object[]> myFindCustomerIds();
	
	@Query(value="select MAX(planeId) from Plane_AMS")
	public int getLastId();
	
	 @Modifying
	  @Transactional
	@Query(value="update Plane_AMS p set p.hanger_AMS=?1 where p.planeId=?2")
	public int updatePlaneHangerId(Hanger_AMS a,int b);
	 
		@Query(value="select * from Plane_AMS  where HANGER_AMS_HANGER_ID = null", nativeQuery = true)
		public List<Plane_AMS> getAllPlaneNotAllottedDetails();
}
