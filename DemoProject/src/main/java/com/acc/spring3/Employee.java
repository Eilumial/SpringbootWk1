package com.acc.spring3;

import org.springframework.stereotype.Component;

//@Component
public class Employee {
	private String name;
	private String addr;
	private int number;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public Employee() {}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name="+name+" Number="+number;
	}
	
	
}
