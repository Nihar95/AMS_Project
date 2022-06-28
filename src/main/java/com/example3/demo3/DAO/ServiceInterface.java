package com.example3.demo3.DAO;

import java.util.List;
import java.util.Optional;

import com.example3.demo3.Model.Address_AMS;
import com.example3.demo3.Model.Hanger_AMS;
import com.example3.demo3.Model.Login;
import com.example3.demo3.Model.Manager_AWS;
import com.example3.demo3.Model.Owner_AMS;
import com.example3.demo3.Model.Pilot_AMS;
import com.example3.demo3.Model.Plane_AMS;

public interface ServiceInterface {
	
	public Optional<Login> getLoginDetailsById(String password); 
	public String savePlaneDetails(Plane_AMS plane);
	public String savePilotDetails(Pilot_AMS pilot);
	public String saveHangerDetails(Hanger_AMS manager);
	
	public List<Owner_AMS> getAllOwnerDetails();
	
	public Owner_AMS getOwner_AMSById(int id);
	
	public List<Plane_AMS> getALlPlane_AMS();
	
	public List<Pilot_AMS> getAllPilot_AMS();
	
	public List<Hanger_AMS> getAllHangerAms();
	
	public List<Manager_AWS> getAllManagerDetails();
	
	public Address_AMS saveAddress(Address_AMS ams);
	public String saveManager(Manager_AWS manager);
	
	public String saveOwner(Owner_AMS ams);
	
	public List<Hanger_AMS> getAllEmptyHangerDetails();
	public int updatePlaneHangerId(Hanger_AMS a,int b);
	
	public List<Plane_AMS> getAllPlaneNotAllotted();
}
