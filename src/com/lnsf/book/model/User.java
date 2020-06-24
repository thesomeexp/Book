package com.lnsf.book.model;

public class User {
	
	public User(int id, String name, int identify, String username,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.identify = identify;
		this.username = username;
		this.password = password;
	}
	private int id;
	private String name;
	private int identify;
	private String username;
	private String password;
	private int num;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getIdentify() {
		return identify;
	}
	public void setIdentify(int identify) {
		this.identify = identify;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", identify=" + identify
				+ ", username=" + username + ", password=" + password + "]";
	}
}
