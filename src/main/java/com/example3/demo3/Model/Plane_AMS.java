package com.example3.demo3.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Plane_AMS {

	@Id
	@Column(length=15)
	private int planeId;
	@Column(length=15)
	private String plaName;
	@Column(length=15,unique = true)
	private int regNo;
	@Column(length=15)
	private String manufac;
	@Column(length=15)
	private String modelNo;
	@Column(length=15)
	private int capacity;
	@Column(length=15)
	private String email;
	@OneToOne
	private Owner_AMS owner_AMS;
	@OneToOne
	private Hanger_AMS hanger_AMS;
	
	
	
	public int getPlaneId() {
		return planeId;
	}
	public void setPlaneId(int planeId) {
		this.planeId = planeId;
	}
	public String getPlaName() {
		return plaName;
	}
	public void setPlaName(String plaName) {
		this.plaName = plaName;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getManufac() {
		return manufac;
	}
	public void setManufac(String manufac) {
		this.manufac = manufac;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Owner_AMS getOwner_AMS() {
		return owner_AMS;
	}
	public void setOwner_AMS(Owner_AMS owner_AMS) {
		this.owner_AMS = owner_AMS;
	}
	public Plane_AMS() {
		super();
	}
	public Hanger_AMS getHanger_AMS() {
		return hanger_AMS;
	}
	public void setHanger_AMS(Hanger_AMS hanger_AMS) {
		this.hanger_AMS = hanger_AMS;
	}
	public Plane_AMS(int planeId, String plaName, int regNo, String manufac, String modelNo, int capacity,String email,
			Owner_AMS owner_AMS, Hanger_AMS hanger_AMS) {
		super();
		this.planeId = planeId;
		this.plaName = plaName;
		this.regNo = regNo;
		this.manufac = manufac;
		this.modelNo = modelNo;
		this.capacity = capacity;
		this.email=email;
		this.owner_AMS = owner_AMS;
		this.hanger_AMS = hanger_AMS;
	}
	
	
}
