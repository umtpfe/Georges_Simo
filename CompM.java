package com.formafast.beans;

public class CompM {
	private int id;  
	private String name; 
	private String email;
	private String company; 
	private String country;
	private String gender;
	private int contact;
	private String password;
	public CompM() {
		super();
	}
	public CompM(int id, String name, String email, String company, String country, String gender, int contact,String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.company = company;
		this.country = country;
		this.gender = gender;
		this.contact = contact;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
