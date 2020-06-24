package com.lnsf.book.model;

public class Car {

	public Car(int id, int menuid, int num, int tid) {
		super();
		this.id = id;
		this.menuid = menuid;
		this.num = num;
		this.tid = tid;
	}
	private int id;
	private int menuid;
	private int num;
	private int tid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", menuid=" + menuid + ", num=" + num
				+ ", tid=" + tid + "]";
	}


	
}
