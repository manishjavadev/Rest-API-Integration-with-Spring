package com.manish.java.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement(name = "userdetail")
@XmlAccessorType(XmlAccessType.NONE)
public class UserDetail implements Serializable {

	private static final long serialVersionUID = -7788619177798333712L;

	@XmlElement
	private String firstName;
	@XmlElement
	private String lastName;
	@XmlElement
	private String gender;
	@XmlElement
	private String city;

	public UserDetail() {
	}

	public UserDetail(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UserDetail(String firstName, String lastName, String gender, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.city = city;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}