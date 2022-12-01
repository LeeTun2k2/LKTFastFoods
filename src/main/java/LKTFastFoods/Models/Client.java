package LKTFastFoods.Models;

import java.sql.Date;

public class Client{
	public Client(String username, String name, Date birthDate, boolean gender, String phoneNumber, String email,
			String address) {
		super();
		this.username = username;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	private String username;
	private String name;
	private Date birthDate;
	private boolean gender;
	private String phoneNumber;
	private String email;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
