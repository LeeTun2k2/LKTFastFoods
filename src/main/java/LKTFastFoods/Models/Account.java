package LKTFastFoods.Models;

public class Account {
	public Account(String username, String password, boolean role, boolean active) {
		this.username = username;
		this.password = password;
		this.role = role;
		this.active = active;
	}
	public Account() {
		
	}
	private String username;
	private String password;
	private boolean role;
	private boolean active;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isRole() {
		return role;
	}
	public void setRole(boolean role) {
		this.role = role;
	}
	
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
