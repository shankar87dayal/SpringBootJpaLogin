package com.example.demo.gradle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login" , schema="mydb")
public class LoginBean {
	
	public LoginBean() {
	}
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		String output= "Id: " + id + "\nUsername: " + username + "\nPassword: "+ password + "\n *****************************************************************************";
		return output + "\n";
	}

}
