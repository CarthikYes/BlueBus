
package com.masai.bean;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;


public class Bus_Route {

	

	private int route_Id;
	private int bus_No;
	private String source;
	private String destination;
	private int distance;
	private int fare_Per_Km;
	private Date day;
	private Time arrival_Time;
	private Time departure_Time;

	
	public Bus_Route(int route_Id, int bus_No, String source, String destination, int distance, int fare_Per_Km,
			Date day, Time arrival_Time, Time departure_Time) {
		super();
		this.route_Id = route_Id;
		this.bus_No = bus_No;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.fare_Per_Km = fare_Per_Km;
		this.day = day;
		this.arrival_Time = arrival_Time;
		this.departure_Time = departure_Time;
	}

	@Override
	public String toString() {
		return "Bus_Route [route_Id=" + route_Id + ", bus_No=" + bus_No + ", source=" + source + ", destination="
				+ destination + ", distance=" + distance + ", fare_Per_Km=" + fare_Per_Km + ", day=" + day
				+ ", arrival_Time=" + arrival_Time + ", departure_Time=" + departure_Time + "]";
	}

	
	public int getRoute_Id() {
		return route_Id;
	}

	
	public void setRoute_Id(int route_Id) {
		this.route_Id = route_Id;
	}

	public int getBus_No() {
		return bus_No;
	}

	
	public void setBus_No(int bus_No) {
		this.bus_No = bus_No;
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

	
	public int getDistance() {
		return distance;
	}

	
	public void setDistance(int distance) {
		this.distance = distance;
	}

	
	public int getFare_Per_Km() {
		return fare_Per_Km;
	}

	
	public void setFare_Per_Km(int fare_Per_Km) {
		this.fare_Per_Km = fare_Per_Km;
	}

	
	public Date getDay() {
		return day;
	}

	
	public void setDay(Date day) {
		this.day = day;
	}

	
	public Time getArrival_Time() {
		return arrival_Time;
	}

	
	public void setArrival_Time(Time arrival_Time) {
		this.arrival_Time = arrival_Time;
	}

	
	public Time getDeparture_Time() {
		return departure_Time;
	}

	
	public void setDeparture_Time(Time departure_Time) {
		this.departure_Time = departure_Time;
	}

	public static void main(String[] args) {
		

	}

}
