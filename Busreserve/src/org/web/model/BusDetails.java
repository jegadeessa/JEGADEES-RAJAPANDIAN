package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity

@Table(name = "Brs_BusDetails", catalog = "bus", uniqueConstraints = {
		@UniqueConstraint(columnNames = "route_no", name = "Brs_route_no_unq") })

public class BusDetails {
	private String bus_no;
	private String bus_name;
	private String source;
	private String Destination;
	private String duration;
	private Integer fare;
	
	@Column(name="Bus_no",nullable=false,length=100)
	public String getBus_no() {
		return bus_no;
	}
	@Column(name="Bus_name",nullable=false,length=100)
	public String getBus_name() {
		return bus_name;
	}
	@Column(name="Source",nullable=false,length=100)
	public String getSource() {
		return source;
	}
	
	@Column(name="Destination",nullable=false,length=100)
	public String getDestination() {
		return Destination;
	}
	
	@Column(name="Duration",nullable=false,length=100)
	public String getDuration() {
		return duration;
	}
	
	@Column(name="Fare",nullable=false,length=100)
	public Integer getFare() {
		return fare;
	}

	

}
