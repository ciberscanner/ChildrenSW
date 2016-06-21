package com.ciberscanner.app.childrensw;

public class Question {
	// --------------------------------------------------------------------
	// Variables
	String name;
	String description;
	
	// --------------------------------------------------------------------
	// Constructor

	public Question(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	// --------------------------------------------------------------------
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}