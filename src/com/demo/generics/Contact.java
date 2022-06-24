package com.demo.generics;

public class Contact {
	public String city;
	public String landmark;
	public int pincode;

	public Contact(String city, String landmark, int pincode) {
		this.city = city;
		this.landmark = landmark;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
