package com.atcrowdfunding.bean;

import java.util.ArrayList;
import java.util.List;

public class Tag {
	private Integer id;
	private Integer pid;
	private String name;
	private String icon;
	private boolean open=true;
	private List<Tag> children  = new ArrayList<Tag>();
	private List<Tag> childNodes  = new ArrayList<Tag>();
	
	
	public String getIcon() {
		return icon;
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
	public List<Tag> getChildNodes() {
		return childNodes;
	}
	public void setChildNodes(List<Tag> childNodes) {
		this.childNodes = childNodes;
	}
	public List<Tag> getChildren() {
		return children;
	}
	public void setChildren(List<Tag> children) {
		this.children = children;
	}
	public Integer getId() {
		return id;
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
	
}
