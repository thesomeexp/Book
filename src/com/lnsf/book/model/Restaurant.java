package com.lnsf.book.model;

public class Restaurant {

	public Restaurant(int id, int userid, String name, String address) {
		super();
		this.id = id;
		this.userid = userid;
		this.name = name;
		this.address = address;
	}
	private int id;
	private int userid;
	private String name;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", userid=" + userid + ", name=" + name
				+ ", address=" + address + "]";
	}
}
