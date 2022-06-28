package com.example3.demo3.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Owner_AMS {

	@Id
	@Column(length= 15)
	private int ownerId;
	@Column(length= 15)
	private String ownerName;
	@Column(length= 15)
	private String email_id;
	@OneToOne
	@JoinColumn(name="addressId",unique=true)
	private Address_AMS address;
	
	
	public Owner_AMS(int ownerId, String ownerName ,String email_id, Address_AMS address) {
		super();
		this.ownerId = ownerId;
		this.ownerName=ownerName;
		this.email_id = email_id;
		this.address = address;
		
	}

	public Owner_AMS() {
		
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public Address_AMS getAddress() {
		return address;
	}

	public void setAddress(Address_AMS address) {
		this.address = address;
	}

	
	
	
	
	
	
}
