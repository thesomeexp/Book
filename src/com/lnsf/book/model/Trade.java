package com.lnsf.book.model;

public class Trade {
	
	public Trade(int id, int userid, String usertele, int rid, String status,
			String address, int money) {
		super();
		this.id = id;
		this.userid = userid;
		this.usertele = usertele;
		this.rid = rid;
		this.status = status;
		this.address = address;
		this.money = money;
	}
	private int id;
	private int userid;
	private String usertele;
	private int rid;
	private String status;
	private String address;
	private int money;
	
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
	public String getUsertele() {
		return usertele;
	}
	public void setUsertele(String usertele) {
		this.usertele = usertele;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Trade [id=" + id + ", userid=" + userid + ", usertele="
				+ usertele + ", rid=" + rid + ", status=" + status
				+ ", address=" + address + ", money=" + money + "]";
	}
	
}
