package com.atcrowdfunding.bean;

import java.util.ArrayList;
import java.util.List;

public class Permission {

	private Integer id,pid; 
	private String name,url,icon;
	private boolean open = true;
	private boolean checked = false;
	private List<Permission> children = new ArrayList<Permission>();
	private List<Permission> childNodes = new ArrayList<Permission>();
	
	public String getIcon() {
		return icon;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public List<Permission> getChildNodes() {
		return childNodes;
	}
	public void setChildNodes(List<Permission> childNodes) {
		this.childNodes = childNodes;
	}
	public Integer getId() {
		return id;
	}
	public List<Permission> getChildren() {
		return children;
	}
	public void setChildren(List<Permission> children) {
		this.children = children;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
