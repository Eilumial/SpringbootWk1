package com.acc.spring3;

import org.springframework.stereotype.Component;

//@Component("address2")
public class Address2 {
	//<bean id="address" class="address2"/>
	
	String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
