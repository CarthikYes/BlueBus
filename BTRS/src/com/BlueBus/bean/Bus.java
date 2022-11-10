package com.redbus.bean;

public class Bus {
	private int busno;
	private String busName; 
	private String source;
	private String destination ;
	private String bustype;
	private int seats;
	private String arrival;
	private String departure;
	private int availability;
	private int busfare;
	public Bus() {

	}
	public Bus(int int1, String string, String string2, String string3, String string4, int int2, String string5,
			String string6,int avail,int busfare) {
		// TODO Auto-generated constructor stub
		this.busno = int1;
		this.busName = string;
		this.source = string2;
		this.destination = string3;
		this.bustype = string4;
		this.seats = int2;
		this.arrival = string5;
		this.departure = string6;
		this.availability = avail;
		this.busfare = busfare;
	}
	
	
	
	public int getBusfare() {
		return busfare;
	}
	public void setBusfare(int busfare) {
		this.busfare = busfare;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Bus [busno=" + busno + ", busName=" + busName + ", source=" + source + ", destination=" + destination
				+ ", bustype=" + bustype + ", seats=" + seats + ", arrival=" + arrival + ", departure=" + departure
				+ ", availability=" + availability + "]";
	}
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
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
	public String getBustype() {
		return bustype;
	}
	public void setBustype(String bustype) {
		this.bustype = bustype;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
}
