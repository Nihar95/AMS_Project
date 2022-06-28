package com.example3.demo3.DAO;

import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
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
public class ServiceIMPL implements ServiceInterface{
	
	
	@Autowired
	LoginRepository loginRepo;

	@Autowired
	HangerRepository hangRepo;

	@Autowired
	OwnerRepository ownRepo;
	@Autowired
	PilotRepository piRepo;
	@Autowired
	PlaneRepository planeRepo;
	@Autowired
	ManagerRepository managerRepo;
	@Autowired
	AddressRepository addRepo;
	
	
	
	
	@Override
	public Optional<Login> getLoginDetailsById(String password) {
		// TODO Auto-generated method stub
		return loginRepo.findById(password);
		
	}


	@Override
	public String savePlaneDetails(Plane_AMS plane) {
		// TODO Auto-generated method stub
		int id=planeRepo.getLastId();
		if(id==0) {
			id=500;
		}
		else
			++id;
		
	plane.setPlaneId(id);
	Plane_AMS aws=	planeRepo.save(plane);
	if(aws.equals(null)) {
		return "Plane details not inserted";
	}
	else 
		return "Successfully inserted";
		
	}
	
	@Override
	public List<Plane_AMS> getALlPlane_AMS() {
		// TODO Auto-generated method stub
		return planeRepo.findAll();
	}
	



	@Override
	public String savePilotDetails(Pilot_AMS pilot) {
		// TODO Auto-generated method stub
		int id=piRepo.getLastId();
		if(id==0) {
			id=600;
		}
		else
			++id;
		pilot.setPilotId(id);
		Pilot_AMS ams=	piRepo.save(pilot);
		if(ams.equals(null)) {
			return "Not Inserted value";
					
		}
		else 
			return "plane details instered successfully";
	}


	@Override
	public String saveHangerDetails(Hanger_AMS hanger) {
		// TODO Auto-generated method stub
		int id=hangRepo.getLastId();
		if(id==0) {
			id=100;
		}
		else
			++id;
		hanger.setHangerId(id);
		Hanger_AMS ams=	hangRepo.save(hanger);
		if(ams.equals(null)) {
			return "Not Inserted value";
					
		}
		else 
			return "plane details instered successfully";
	}
	

	@Override
	public List<Hanger_AMS> getAllHangerAms() {
		// TODO Auto-generated method stub
		return hangRepo.findAll();
	}
	
	

	@Override
	public List<Owner_AMS> getAllOwnerDetails() {
		// TODO Auto-generated method stub
		return ownRepo.findAll();
	}


	@Override
	public Owner_AMS getOwner_AMSById(int id) {
		// TODO Auto-generated method stub
		return ownRepo.findById(id);
	}





	@Override
	public List<Pilot_AMS> getAllPilot_AMS() {
		// TODO Auto-generated method stub
		return piRepo.findAll();
	}


	@Override
	public List<Manager_AWS> getAllManagerDetails() {
		// TODO Auto-generated method stub
		return managerRepo.findAll();
	}


	@Override
	public Address_AMS saveAddress(Address_AMS ams) {
		// TODO Auto-generated method stub
		
		
		int id=addRepo.getLastId();
//		if(id==0) {
//			id=200;
//		}
//		else
		++id;
		ams.setAddressId(id);
		return	addRepo.save(ams);
		
	}


	@Override
	public String saveManager(Manager_AWS manager) {
		// TODO Auto-generated method stub
				int id=managerRepo.getLastId();
				if(id==0) {
					id=300;
				}
				else
					++id;
				
				manager.setManagerId(id);
				Manager_AWS aws=	managerRepo.save(manager);
			if(aws.equals(null)) {
				return "Plane details not inserted";
			}
			else 
				return "Successfully inserted";
	}


	@Override
	public String saveOwner(Owner_AMS ams) {
		int id=ownRepo.getLastId();
		if(id==0) {
			id=400;
		}
		else
			++id;
		
		ams.setOwnerId(id);
		Owner_AMS aws=	ownRepo.save(ams);
	if(aws.equals(null)) {
		return "Plane details not inserted";
	}
	else 
		return "Successfully inserted";
	}


	@Override
	public List<Hanger_AMS> getAllEmptyHangerDetails() {
		// TODO Auto-generated method stub
		return hangRepo.getAllEmptyHangerDetails();
	}


	@Override
	public int updatePlaneHangerId(Hanger_AMS a, int b) {
		// TODO Auto-generated method stub
		int aa=a.getStatus();
		a.setStatus(--aa);
		return planeRepo.updatePlaneHangerId(a, b);
	}


	@Override
	public List<Plane_AMS> getAllPlaneNotAllotted() {
		// TODO Auto-generated method stub
		List<Plane_AMS> a= planeRepo.getAllPlaneNotAllottedDetails();
		if(a.isEmpty())
			System.out.println("Yes empty plane list ");
		return planeRepo.getAllPlaneNotAllottedDetails();
	}


}
