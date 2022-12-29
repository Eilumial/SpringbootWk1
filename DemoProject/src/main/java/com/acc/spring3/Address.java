package com.acc.spring3;

public class Address {
	private String location;

	public Address(String location) {
		this.location = location;
	}
	
	public Address() {
		
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

//	@Override
//	public String toString() {
//		return "Location="+location;
//	}
}
