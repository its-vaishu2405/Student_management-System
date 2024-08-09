package com.bo;

public class Addstudents {
	private int id;
	private String name;
	private String email;
	private String phone;
	private String stream;
	private String clgname;
	private String dob;
	private String city;
	private String state;
	private String country;
	private int zip;
	
	public String getClgname() {
		return clgname;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getStream() {
		return stream;
	}
	public String getDob() {
		return dob;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public int getZip() {
		return zip;
	}

	
	public Addstudents(String name, String email, String phone, String stream, String clgname, String dob, String city,
			String state, String country, int zip) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.stream = stream;
		this.clgname = clgname;
		this.dob = dob;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phone
	 * @param stream
	 * @param clgname
	 * @param dob
	 * @param city
	 * @param state
	 * @param country
	 * @param zip
	 */
	public Addstudents(int id, String name, String email, String phone, String stream, String clgname, String dob,
			String city, String state, String country, int zip) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.stream = stream;
		this.clgname = clgname;
		this.dob = dob;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	public Addstudents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public void setClgname(String clgname) {
		this.clgname = clgname;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

}

