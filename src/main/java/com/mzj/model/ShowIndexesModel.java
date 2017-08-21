package com.mzj.model;

public class ShowIndexesModel {
	private int id;
	private String title;
	private String picture;
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ShowIndexesModel [id=" + id + ", title=" + title + ", picture=" + picture + ", type=" + type + "]";
	}

	public ShowIndexesModel(int id, String title, String picture, String type) {
		super();
		this.id = id;
		this.title = title;
		this.picture = picture;
		this.type = type;
	}

	public ShowIndexesModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
