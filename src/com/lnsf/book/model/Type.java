package com.lnsf.book.model;

public class Type {


	public Type(int id, String name, int rid) {
		super();
		this.id = id;
		this.name = name;
		this.rid = rid;
	}
	private int id;
	private String name;
	private int rid;
	
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
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", name=" + name + ", rid=" + rid + "]";
	}

	
}
