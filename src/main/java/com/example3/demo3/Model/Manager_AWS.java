package com.example3.demo3.Model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Manager_AWS {

	@Id
	@Column(length= 15)
	private int managerId;
	@Column(length= 15)
	private String managerName;
	@Column(length= 15,unique = true)
	private String ssNo;
	
	@OneToOne
	@JoinColumn(name="hangerId",unique=true)
	private Hanger_AMS hangerId;
	@Column(length= 15)
	private String dob;
	@Column(length= 15)
	private String gender;
	@Column(unique = true)
	private int mobNo;
	@Column(length= 15)
	private String email;
	@OneToOne
	private Address_AMS addressId;
	

	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getSsNo() {
		return ssNo;
	}
	public void setSsNo(String ssNo) {
		this.ssNo = ssNo;
	}
	public Hanger_AMS getHangerId() {
		return hangerId;
	}
	public void setHangerId(Hanger_AMS hangerId) {
		this.hangerId = hangerId;
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
	public Manager_AWS(int managerId, String managerName, String ssNo, Hanger_AMS hangerId, String dob,
			String gender, int mobNo, String email, Address_AMS addressId) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.ssNo = ssNo;
		this.hangerId = hangerId;
		this.dob = dob;
		this.gender = gender;
		this.mobNo = mobNo;
		this.email = email;
		this.addressId = addressId;
	}
	public Manager_AWS() {
		super();
	}
	
	
}
