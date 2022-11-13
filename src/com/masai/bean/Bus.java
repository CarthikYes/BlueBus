package com.masai.bean;


public class Bus {

	

	private int bus_No;
	private int passenger_Capacity;
	private int available_Seats;
	private String bus_Type;

	public Bus(int bus_No, int passenger_Capacity, int available_Seats, String bus_Type) {
		super();
		this.bus_No = bus_No;
		this.passenger_Capacity = passenger_Capacity;
		this.available_Seats = available_Seats;
		this.bus_Type = bus_Type;
	}

	@Override
	public String toString() {
		return "Bus [bus_No=" + bus_No + ", passenger_Capacity=" + passenger_Capacity + ", available_Seats="
				+ available_Seats + ", bus_Type=" + bus_Type + "]";
	}

	
	public int getBus_No() {
		return bus_No;
	}

	
	public void setBus_No(int bus_No) {
		this.bus_No = bus_No;
	}

	
	public int getPassenger_Capacity() {
		return passenger_Capacity;
	}

	
	public void setPassenger_Capacity(int passenger_Capacity) {
		this.passenger_Capacity = passenger_Capacity;
	}

	
	public int getAvailable_Seats() {
		return available_Seats;
	}

	
	public void setAvailable_Seats(int available_Seats) {
		this.available_Seats = available_Seats;
	}

	
	public String getBus_Type() {
		return bus_Type;
	}

	
	public void setBus_Type(String bus_Type) {
		this.bus_Type = bus_Type;
	}

	public static void main(String[] args) {
		
	}

}
