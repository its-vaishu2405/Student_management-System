package com.bo;

public class Student {
	private String name;
	private String email;
	private String user;
	private String pwd;
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getUser() {
		return user;
	}
	public String getPwd() {
		return pwd;
	}
	public Student(String name, String email, String user, String pwd) {
		super();
		this.name = name;
		this.email = email;
		this.user = user;
		this.pwd = pwd;
	}
	

}