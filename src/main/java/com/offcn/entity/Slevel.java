package com.offcn.entity;

public class Slevel {
	
	private Integer sid;
	private String sname;
	private Integer flid;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getFlid() {
		return flid;
	}
	public void setFlid(Integer flid) {
		this.flid = flid;
	}
	@Override
	public String toString() {
		return "Slevel [sid=" + sid + ", sname=" + sname + ", flid=" + flid + "]";
	}
	
	

}
