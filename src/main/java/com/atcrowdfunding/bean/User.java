package com.atcrowdfunding.bean;

import org.springframework.web.multipart.MultipartFile;

public class User {
	
	private Integer id;
	private String loginacct;
	private String userpswd;
	private String username;
	private String usertype;
	private String email;
	private String createtime;
	private MultipartFile uerIcon;
	public MultipartFile getUerIcon() {
		return uerIcon;
	}
	public void setUerIcon(MultipartFile uerIcon) {
		this.uerIcon = uerIcon;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginacct() {
		return loginacct;
	}
	public void setLoginacct(String loginacct) {
		this.loginacct = loginacct;
	}
	public String getUserpswd() {
		return userpswd;
	}
	public void setUserpswd(String userpswd) {
		this.userpswd = userpswd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
