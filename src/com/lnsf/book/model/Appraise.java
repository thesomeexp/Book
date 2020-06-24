package com.lnsf.book.model;

public class Appraise {
	
	public Appraise(int uid, int rid, String about) {
		super();
		this.uid = uid;
		this.rid = rid;
		this.about = about;
	}
	private int uid;
	private int rid;
	private String about;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "Appraise [uid=" + uid + ", rid=" + rid + ", about=" + about
				+ "]";
	}
	
	
}
