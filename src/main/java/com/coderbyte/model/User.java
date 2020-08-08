package com.coderbyte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int userid;	
@Column
String Fname;
String Lname;
String Email;
String username;
String Address;
String city;
String State;
String Zip;
String country;
String Company;



public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getZip() {
	return Zip;
}
public void setZip(String zip) {
	Zip = zip;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getCompany() {
	return Company;
}
public void setCompany(String company) {
	Company = company;
}


}
