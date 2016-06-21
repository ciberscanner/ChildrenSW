package com.ciberscanner.app.childrensw;

public class Punto {
	// --------------------------------------------------------------------
	// Variables
	String latitude, longitude;
	String descripcion;
	String url_image;
	String date;

	// --------------------------------------------------------------------
	// Constructor
	public Punto(String latitude, String longitude, String descripcion, String url_image, String date) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.descripcion = descripcion;
		this.url_image = url_image;
		this.date = date;
	}

	// --------------------------------------------------------------------
	// Setters and Getters
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrl_image() {
		return url_image;
	}

	public void setUrl_image(String url_image) {
		this.url_image = url_image;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
