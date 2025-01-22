package com.ts.beans;

public class Student {
  private int roll;
  private String name;
  private Address address;
  
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
	  System.out.println("Roll no"+this.roll);
	  System.out.println("Name "+this.name);
	  System.out.println("Address "+this.address.toString());
  }
}
