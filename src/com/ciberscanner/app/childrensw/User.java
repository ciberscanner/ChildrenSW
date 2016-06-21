package com.ciberscanner.app.childrensw;

public class User {
	// --------------------------------------------------------------------
	// Variables
	private String id;
	private String email;
	private String password;
	private String category;

	// --------------------------------------------------------------------
	// Constructor
	public User(String id, String email, String password, String category) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.category = category;
	}
	
	public User(String email, String password, String category) {
		super();
		this.email = email;
		this.password = password;
		this.category = category;
	}

	// --------------------------------------------------------------------
	// Setters and Getters
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
