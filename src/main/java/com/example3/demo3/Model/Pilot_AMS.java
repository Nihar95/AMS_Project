package com.example3.demo3.Model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pilot_AMS {

	@Id
	@Column(length= 15)
	private int pilotId;
	@Column(length= 15)
	private String pilName;
	@Column(length= 15,unique = true)
	private String licNo;
	@Column(length= 15,unique = true)
	private String ssNo;
	@Column(length= 15)
	private String dob;
	@Column(length= 15)
	private String gender;
	@Column(length= 15)
	private int mobNo;
	@Column(length= 15)
	private String email;
	@ManyToOne
	private Address_AMS addressId;
	
	@OneToOne
	@JoinColumn(unique = true)
	private Plane_AMS planeId;
	
	public Pilot_AMS(int pilotId, String pilName, String licNo, String ssNo, String dob, String gender, int mobNo,
			String email, Address_AMS addressId, Plane_AMS planeId) {
		super();
		this.pilotId = pilotId;
		this.pilName = pilName;
		this.licNo = licNo;
		this.ssNo = ssNo;
		this.dob = dob;
		this.gender = gender;
		this.mobNo = mobNo;
		this.email = email;
		this.addressId = addressId;
		this.planeId = planeId;
	}
	
	public Pilot_AMS() {
		
	}

	public int getPilotId() {
		return pilotId;
	}

	public void setPilotId(int pilotId) {
		this.pilotId = pilotId;
	}

	public String getPilName() {
		return pilName;
	}

	public void setPilName(String pilName) {
		this.pilName = pilName;
	}

	public String getLicNo() {
		return licNo;
	}

	public void setLicNo(String licNo) {
		this.licNo = licNo;
	}

	public String getSsNo() {
		return ssNo;
	}

	public void setSsNo(String ssNo) {
		this.ssNo = ssNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMobNo() {
		return mobNo;
	}

	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address_AMS getAddressId() {
		return addressId;
	}

	public void setAddressId(Address_AMS addressId) {
		this.addressId = addressId;
	}

	public Plane_AMS getPlaneId() {
		return planeId;
	}

	public void setPlaneId(Plane_AMS planeId) {
		this.planeId = planeId;
	}
	
	
	
	
}
