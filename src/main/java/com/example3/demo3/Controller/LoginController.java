package com.example3.demo3.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example3.demo3.DAO.EndService;
import com.example3.demo3.Model.Address_AMS;
import com.example3.demo3.Model.Hanger_AMS;
import com.example3.demo3.Model.Manager_AWS;
import com.example3.demo3.Model.Owner_AMS;
import com.example3.demo3.Model.Pilot_AMS;
import com.example3.demo3.Model.Plane_AMS;

@Controller
public class LoginController {
	@Autowired
	EndService service;
	
	String message = "";

	@RequestMapping("/")
	public String Home() {

		return "LoginPage2";
		
	
	}

	@RequestMapping("home")
	public ModelAndView Home(@RequestParam("name") String name, @RequestParam("pass") String pass) {

		ModelAndView mv = null;
		int login = service.getLoginDetailById(name, pass);
		if (login == 1) {
			// ctrl.AdminLogin();
			mv = new ModelAndView("AdminLogin");

		} else if (login == 2) {
			mv = new ModelAndView("AvailableHanger1");
		} else
			mv = new ModelAndView("/redirect:LoginPage");

		return mv;
	}

	@GetMapping("/AdminLogin")
	public String AdminLogin(Model model) {

		model.addAttribute("msg", message);
		return "AdminLogin";
	}

	@GetMapping("/AddPlane")
	public String home23(Model model) {
		model.addAttribute("Plane_AMS", new Plane_AMS());
		List<Owner_AMS> ownerDetails = service.getAllOwnerDetails();

		model.addAttribute("msg", ownerDetails);
		return "AddPlane2";
	}

	@PostMapping("/AddPlane")
	public String AddPlane(@ModelAttribute("Plane_AMS") Plane_AMS plane, Model model,
			@RequestParam("OwnerId") String id) {
		System.out.println(id);
		Owner_AMS owner = service.getOwner_AMSById(Integer.parseInt(id));
		plane.setOwner_AMS(owner);
		message = service.savePlaneDetail(plane);
		// model.addAttribute("msg",msg);
		return "AdminLogin";

	}

	@GetMapping("/AddPilot")
	public String AddPilot(Model model) {
		model.addAttribute("Pilot_AMS", new Pilot_AMS());
		// List<Plane_AMS> planeList=service.getAllPlane_AMS();
		// model.addAttribute("planeList",planeList);
		return "AddPilot";
	}
	
	
	


	@PostMapping("/AddPilot")
	public String addPilot(@ModelAttribute("Pilot_AMS") Pilot_AMS pilot,Model model) {
		
		System.out.println(pilot.getAddressId().getCity());
		
		
		System.out.println(pilot.getAddressId().getCity());
		Address_AMS address=service.saveAddress(new Address_AMS(pilot.getAddressId().getHouseNo(),pilot.getAddressId().getLocality(),pilot.getAddressId().getCity(),pilot.getAddressId().getState(),pilot.getAddressId().getCountry(),pilot.getAddressId().getPinNo()));
		//model.addAttribute("Address_AMS",new Address_AMS());
		pilot.setAddressId(address);
		pilot.setPlaneId(null);
		message = service.savePilotDetail(pilot);
		return "AdminLogin";

	}
	
//	@PostMapping("/AddAddress")
//	public String AddAddress(@ModelAttribute("Address_AMS")Address_AMS ams) {
//		message=service.saveAddress(ams);
//		return "AdminLogin";
//	}
	
	@RequestMapping("PilotDetails")
	public String pilotDetails(Model model) {
		List<Pilot_AMS> list = service.getAllPilot_AMS();
		model.addAttribute("pilotDetails", list);
		return "DisplayPilotDetails";
	}

	@RequestMapping("planeDetails")
	public String detas(Model model) {
		List<Plane_AMS> list = service.getAllPlane_AMS();
		model.addAttribute("planeDetails", list);
		return "DisplayPlaneDetails";
	}

	@GetMapping("/AddHanger")
	public String AddHangerDetails(Model model) {
		model.addAttribute("Hanger_AMS", new Hanger_AMS());
		return "AddHangerDetails";
	}

	@PostMapping("/AddHanger")
	public String saveHangerDetails(@ModelAttribute("Hanger_AMS") Hanger_AMS ams) {
		service.saveHangerDetail(ams);
		return "AdminLogin";

	}
	
	@RequestMapping("HangerDetails")
	public String Hanger(Model model) {
		List<Hanger_AMS> list = service.getAllHangerDetails();
		model.addAttribute("hangerDetails", list);
		return "DisplayHangerDetails";
	}
	
	
	
	@RequestMapping("/ManagerDetails")
	public String Manager(Model model) {
		List<Manager_AWS> managerlist = service.getAllManagerDetails();
		model.addAttribute("managerDetails", managerlist);
		return "DisplayManagerDetails";
	}
	
	@RequestMapping("availableHanger")
	public String AvHanger(Model model) {
	
		List<Plane_AMS> list = service.getAllPlaneNotAllotted();
		List<Hanger_AMS> managerlist = service.getAllEmptyHangerDetails();
		List<Plane_AMS> list2 = service.getAllPlane_AMS();
		model.addAttribute("planeDetails2",list2);
		model.addAttribute("planeDetails",list);
		model.addAttribute("availableHanger",managerlist);
		return "AvailableHanger";
	}
	
	@RequestMapping("Allotment")
	public String allotment(@RequestParam("plane")int id,@RequestParam("select")Hanger_AMS HId) {
		System.out.println("Messageghjkhjhgjhhjj "+HId.getHangerLoc()+" id "+HId.getHangerId());
		service.updatePlaneHangerId(HId, id);
		return "AvailableHanger";
		
		
	}

}
