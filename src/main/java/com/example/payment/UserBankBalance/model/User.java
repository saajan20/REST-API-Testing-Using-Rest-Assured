package com.example.payment.UserBankBalance.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	int userid;
	String name;
	
	
	public User() {
		
	}
	
	public User(int userid, String name) {
		this.userid = userid;
		this.name = name;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
