package com.ts.beans;

public class Address {
  private int houseno;
  private String city;
  private int pincode;
public int getHouseno() {
	return houseno;
}
public void setHouseno(int houseno) {
	this.houseno = houseno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public void display()
{
	  System.out.println("house no"+this.houseno);
	  System.out.println("City "+this.city);
	  System.out.println("pincode "+this.pincode);
}
@Override
public String toString() {
	return "Address [houseno=" + houseno + ", city=" + city + ", pincode=" + pincode + "]";
}



}