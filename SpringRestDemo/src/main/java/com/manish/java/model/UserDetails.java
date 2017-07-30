package com.manish.java.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement(name = "userdetails")
public class UserDetails {
	private List<UserDetail> userDetail = new ArrayList<UserDetail>();

	@XmlElement(name = "userdetail")
	public List<UserDetail> getuserDetail() {
		return userDetail;
	}

	public void setEmployees(List<UserDetail> userDetail) {
		this.userDetail = userDetail;
	}
}