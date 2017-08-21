package com.mzj.model;

public class FriendLinksModel {
  
	private int id;
	private String name;
	private String urls;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrls() {
		return urls;
	}
	public void setUrls(String urls) {
		this.urls = urls;
	}
	@Override
	public String toString() {
		return "FriendLinksModel [id=" + id + ", name=" + name + ", urls=" + urls + "]";
	}
	public FriendLinksModel(int id, String name, String urls) {
		super();
		this.id = id;
		this.name = name;
		this.urls = urls;
	}
	public FriendLinksModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
