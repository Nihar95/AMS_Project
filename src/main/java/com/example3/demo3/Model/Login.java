package com.example3.demo3.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	private String password;
	private String name;
	private String role;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String password, String name, String role) {
		super();
		this.password = password;
		this.name = name;
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	

}
