package ua.training.model.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
	String email;
	String password;
	LocalDateTime creationTime;
	
	public User() {
		
	}
	
	public User(String email, String password, LocalDateTime creationTime) {
		super();
		this.email = email;
		this.password = password;
		this.creationTime = creationTime;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	@Override
	public String toString() {
		return "User [email=" + email 
				+ ", password=" + password 
				+ ", creationTime=" 
				+ creationTime + "]";
	}

	
	
	
	
}
