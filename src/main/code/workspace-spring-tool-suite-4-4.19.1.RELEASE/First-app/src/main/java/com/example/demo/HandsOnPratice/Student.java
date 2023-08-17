package com.example.demo.HandsOnPratice;

public class Student {
	// using javaBean which implements getter and setter with boilerplate code.
	// Boilerplate code is the code which has been written multiple times in the program 
	// either with some changes or with no changes.
	
	private String firstName;
	private String lastName;
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	// It is simple sample of boilerplate code with some variations
}
