package com.mzj.model;

import java.sql.Date;

public class NewdsModel {
	private int id;
	private String title;
	private String type;
	private String picture;
	private String summry;
	private Date date;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getSummry() {
		return summry;
	}

	public void setSummry(String summry) {
		this.summry = summry;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "NewdsModel [id=" + id + ", title=" + title + ", type=" + type + ", picture=" + picture + ", summry="
				+ summry + ", date=" + date + "]";
	}

	public NewdsModel(int id, String title, String type, String picture, String summry, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.picture = picture;
		this.summry = summry;
		this.date = date;
	}

	public NewdsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
