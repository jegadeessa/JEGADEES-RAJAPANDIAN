package org.web.model;
import javax.persistance.Column;
import javax.persistance.Embeddable;

@Embeddable
public class Address {

	private String doorNo;
	private String streetName;
	private String location;
	private String city;
	private Integer pinCode;
	
	@Column(name="doorno",nullable=false,length=100)
	public String getDoorNo() {
		return doorNo;
	}
	
	@Column(name="streetname",nullable=false,length=100)
	public String getStreetName() {
		return streetName;
	}
	
	@Column(name="location",nullable=false,length=100)
	public String getLocation() {
		return location;
	}
	
	@Column(name="city",nullable=false,length=100)
	public String getCity() {
		return city;
	}
	
	@Column(name="pincode",nullable=false,length=100)
	public Integer getPinCode() {
		return pinCode;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
}
