package com.example3.demo3.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address_AMS {
	
	
	@Id
	@Column(length= 15)
	private int addressId;
	@Column(length= 15)
	private String houseNo;
	@Column(length= 15)
	private String Locality;
	@Column(length= 15)
	private String city;
	@Column(length= 15)
	private String State;
	@Column(length= 15)
	private String country;
	@Column(length= 15)
	private String pinNo;
	
	
	
	public Address_AMS( String houseNo, String locality, String city, String state, String country,
			String pinNo) {
		super();
		
		this.houseNo = houseNo;
		Locality = locality;
		this.city = city;
		State = state;
		this.country = country;
		this.pinNo = pinNo;
	}
	
	
	public Address_AMS() {
		
	}


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public String getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}


	public String getLocality() {
		return Locality;
	}


	public void setLocality(String locality) {
		Locality = locality;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPinNo() {
		return pinNo;
	}


	public void setPinNo(String pinNo) {
		this.pinNo = pinNo;
	}
	
	
	

}
