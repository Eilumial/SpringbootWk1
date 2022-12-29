package com.acc.spring2;

public class Student {
	private String name;
	private String address;
	private int age;

	public Student() {

	}

	public Student(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void displayStudentInfo() {
		System.out.println("Student name=" + name);
		System.out.println("Student address=" + address);
		System.out.println("Student age=" + age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
