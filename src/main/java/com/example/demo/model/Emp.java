package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)//void null Values in Response
public class Emp {

	private Long id;
	private String fname;
	private String lname;
	private String city;
	private long pincode;
	private String mobileNo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", fname=" + fname + ", lname=" + lname + ", city=" + city + ", pincode=" + pincode
				+ ", mobileNo=" + mobileNo + "]";
	}
	
}