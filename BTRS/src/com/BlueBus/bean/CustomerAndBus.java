package com.redbus.bean;

public class CustomerAndBus {
  private int cust_id;
  private String cname;
  private String gender;
  private int age;
  private String contact_address;
  private int busno;
  private String bname;
  private String source;
  private String destination;
  private int busfare;
  
  public CustomerAndBus() {
	  
  }
  
  public CustomerAndBus(int cust_id,String cname, String gender, int age,String 
		  contact_address,int busno, String bname,String source,String destination ,int busfare) {
	  this.cust_id = cust_id;
	  this.cname = cname;
	  this.gender = gender;
	  this.age = age;
	  this.contact_address = contact_address;
	  this.busno = busno;
	  this.bname = bname;
	  this.source = source;
	  this.destination = destination;
	  this.busfare = busfare;
  }


public int getBusfare() {
	return busfare;
}

public void setBusfare(int busfare) {
	this.busfare = busfare;
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
	return "Ticket Details [cust_id=" + cust_id + ", cname=" + cname + ", gender=" + gender + ", age=" + age
			+ ", contact_address=" + contact_address + ", busno=" + busno + ", bname=" + bname + ", source=" + source
			+ ", destination=" + destination + "]";
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}


public String getContact_address() {
	return contact_address;
}
public void setContact_address(String contact_address) {
	this.contact_address = contact_address;
}


public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getBusno() {
	return busno;
}

public void setBusno(int busno) {
	this.busno = busno;
}

public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
}
