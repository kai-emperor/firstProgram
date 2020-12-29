package com.offcn.entity;

public class Flevel {
	
	private Integer fid;
	private String fname;
	private String ficon;
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFicon() {
		return ficon;
	}
	public void setFicon(String ficon) {
		this.ficon = ficon;
	}
	@Override
	public String toString() {
		return "Flevel [fid=" + fid + ", fname=" + fname + ", ficon=" + ficon + "]";
	}
	
	

}
