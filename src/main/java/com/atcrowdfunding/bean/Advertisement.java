package com.atcrowdfunding.bean;

public class Advertisement {
	private Integer id;
	private String name;
	private String iconpath;
	private String status;
	private String url;
	private String userid;
	public String getIconpath() {
		return iconpath;
	}
	public void setIconpath(String iconpath) {
		this.iconpath = iconpath;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
