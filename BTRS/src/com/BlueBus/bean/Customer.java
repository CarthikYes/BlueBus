package com.redbus.bean;

public class Customer {
  private int  cust_id;
  private String cname;
  private String gender;
  private int age;
  private String Contact_address;
  
  public Customer() {
	  
  }
public Customer(int int1, String string, String string2, int int2, String string3) {
	this.cust_id = int1;
	this.cname = string;
	this.gender = string2;
	this.age = int2;
	this.Contact_address = string3;
	// TODO Auto-generated constructor stub
}
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "Customer [cust_id=" + cust_id + ", cname=" + cname + ", gender=" + gender + ", age=" + age
			+ ", Contact_address=" + Contact_address + "]";
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getContact_address() {
	return Contact_address;
}
public void setContact_address(String contact_address) {
	Contact_address = contact_address;
}
  
}
