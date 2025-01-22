package com.resources;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	 private int roll;
	  private String name;
	  @Autowired
	  private Address address;
	  
	  @Autowired
	  private Courses courses;
	  
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	  public void display()
	  {
		  System.out.println("Roll no "+this.roll);
		  System.out.println("Name "+this.name);
		  System.out.println("Address "+this.address.toString());
		  System.out.println("Courses "+this.courses.toString());
	  }
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
}
