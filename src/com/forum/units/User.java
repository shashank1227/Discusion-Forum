package com.forum.units;

public class User extends AbstractEntity {
	private String username;
	private String password;
	private String email;
	private UserRole userRole;
	private static Long lastEntry = 0L;
	public void autoGenerateId() {
		lastEntry = lastEntry + 1L;
		super.setId(lastEntry);
	}
	
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public UserRole getUserRole() {
		return userRole;
	}
	
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	
}
