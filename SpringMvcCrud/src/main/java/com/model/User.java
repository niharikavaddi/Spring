package com.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component("user")
public class User {
	@NotEmpty(message = "please enter the user name")
	@Size(min = 5, max = 10)
	private String username;
	@NotEmpty(message = "please enter the password")
	@Size(min = 1, max = 8, message = "password : not strong")
	private String password;

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

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User : username = " + username + ", password = " + password;
	}
}
