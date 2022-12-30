package com.acc.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.acc.spring.tire.Tyre;
@Configuration
@ComponentScan(basePackages = {"com.acc.spring.autowired","com.acc.spring.tire"})
@Component()
public class Car {
	
	@Autowired
	private Tyre t;

	public Tyre getT() {
		return t;
	}

	public void setT(Tyre t) {
		this.t = t;
	}
	
	
}
