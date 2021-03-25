package com.example.main.model;

import java.util.Date;

public class User {
	
	private String id;
	private String username;
	private String firstName;
	private String lastName;
	private Date dob;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public User(String id, String username, String firstName, String lastName, Date dob) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
