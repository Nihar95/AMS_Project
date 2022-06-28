package com.example3.demo3.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example3.demo3.Model.Address_AMS;
import com.example3.demo3.Model.Hanger_AMS;
import com.example3.demo3.Model.Login;
import com.example3.demo3.Model.Manager_AWS;
import com.example3.demo3.Model.Owner_AMS;
import com.example3.demo3.Model.Pilot_AMS;
import com.example3.demo3.Model.Plane_AMS;

@Service
public class EndService {

	@Autowired
	ServiceIMPL service;
	// Optional<Login> login=

	public int getLoginDetailById(String name, String pass) {
		Optional<Login> login = service.getLoginDetailsById(pass);
		if (login.get().getName().equals(name) && login.get().getPassword().equals(pass)
				&& login.get().getRole().equalsIgnoreCase("admin")) {
			return 1;
		} else if (login.get().getName().equals(name) && login.get().getPassword().equals(pass)
				&& login.get().getRole().equalsIgnoreCase("manager")) {
			return 2;

		} else
			return 3;
	}

	public String savePlaneDetail(Plane_AMS plane) {
		return service.savePlaneDetails(plane);

	}

	public String savePilotDetail(Pilot_AMS pilot) {
		return service.savePilotDetails(pilot);

	}

	public void saveHangerDetail(Hanger_AMS hanger) {
		service.saveHangerDetails(hanger);

	}
	
	public List<Hanger_AMS> getAllHangerDetails() {
		return service.getAllHangerAms();
	}

	public List<Owner_AMS> getAllOwnerDetails() {
		return service.getAllOwnerDetails();
	}

	public Owner_AMS getOwner_AMSById(int id) {
		return service.getOwner_AMSById(id);
	}

	public List<Plane_AMS> getAllPlane_AMS() {
		return service.getALlPlane_AMS();
	}

	public List<Pilot_AMS> getAllPilot_AMS() {
		return service.getAllPilot_AMS();
	}
	
	public List<Manager_AWS> getAllManagerDetails(){
		return service.getAllManagerDetails();
	}
	
	public Address_AMS saveAddress(Address_AMS ams) {
		System.out.println(ams.getCountry());
		return service.saveAddress(ams);
	}
	
	public String saveOwner(Owner_AMS ams) {
		return service.saveOwner(ams);
	}
	
	public List<Hanger_AMS> getAllEmptyHangerDetails(){
		return service.getAllEmptyHangerDetails();
	}
	
	public int updatePlaneHangerId(Hanger_AMS a,int b) {
	return service.updatePlaneHangerId(a, b);
	}
	
	public List<Plane_AMS> getAllPlaneNotAllotted(){
		return service.getAllPlaneNotAllotted();
	}
}
