package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	private @Id @GeneratedValue Long id;
	private String name;
	private String emailId;
	private String mobileNo;
	private String address;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User( String name, String emailId, String mobileNo, String address) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.address = address;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, emailId, id, mobileNo, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(emailId, other.emailId)
				&& Objects.equals(id, other.id) && mobileNo == other.mobileNo && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", address="
				+ address + "]";
	}

}
