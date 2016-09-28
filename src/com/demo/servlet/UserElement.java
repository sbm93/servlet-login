package com.demo.servlet;

public class UserElement {
	private String user;
	private String password;
	private String age;
	private String gender;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "UserElement [user=" + user + ", password=" + password + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
