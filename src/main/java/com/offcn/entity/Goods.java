package com.offcn.entity;

public class Goods {
	
	private Integer gid;
	private String gname;
	private Double price;
	private Integer slid;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getSlid() {
		return slid;
	}
	public void setSlid(Integer slid) {
		this.slid = slid;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", slid=" + slid + "]";
	}
	
	
	

}
