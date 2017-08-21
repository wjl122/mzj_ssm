package com.mzj.model;

public class UsersModel {
	private int id;
	private String username;
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

	@Override
	public String toString() {
		return "UsersModel [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	public UsersModel(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public UsersModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
