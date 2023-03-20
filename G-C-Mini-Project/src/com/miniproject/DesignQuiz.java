package com.miniproject;

public class DesignQuiz {
	private String firstname;
	private String lastname;
	private String username;
	private String city;
	private String email;
	private int password;
	private long mobileNumber;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	
	
	}
	
	DesignQuiz(){
		
	}
	public DesignQuiz(String firstname, String lastname, String username, String city, String email, int password,
			int mobileNumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.city = city;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}
	
	
	
	
	@Override
	public String toString() {
		return "DesignQuiz [firstname=" + firstname + ", lastname=" + lastname + ", username=" + username + ", city="
				+ city + ", email=" + email + ", password=" + password + ", mobileNumber=" + mobileNumber + "]";
	}

}
