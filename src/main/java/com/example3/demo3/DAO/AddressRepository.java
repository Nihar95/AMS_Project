package com.example3.demo3.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example3.demo3.Model.Address_AMS;



public interface AddressRepository extends JpaRepository<Address_AMS, Integer>{
	@Query(value="select MAX(addressId) from Address_AMS")
	public int getLastId();
}
