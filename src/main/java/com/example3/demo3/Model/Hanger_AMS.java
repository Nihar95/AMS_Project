package com.example3.demo3.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hanger_AMS {

	@Id
	@Column(length= 15)
	private int hangerId;
	@Column(length= 15)
	private String hangerLoc;
	@Column(length= 15)
	private int capacity;
	private int status;
	
	
	public Hanger_AMS(int hangerId, String hangerLoc, int capacity,int status) {
		super();
		this.hangerId = hangerId;
		this.hangerLoc = hangerLoc;
		this.capacity = capacity;
		this.status =status;
	}
	
	public Hanger_AMS() {
		
	}

	
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getHangerId() {
		return hangerId;
	}

	public void setHangerId(int hangerId) {
		this.hangerId = hangerId;
	}

	public String getHangerLoc() {
		return hangerLoc;
	}

	public void setHangerLoc(String hangerLoc) {
		this.hangerLoc = hangerLoc;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
