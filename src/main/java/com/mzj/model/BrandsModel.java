package com.mzj.model;

public class BrandsModel {
	private int id;
	private String pictures;
	private String type;
	private String Content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPictures() {
		return pictures;
	}

	public void setPictures(String pictures) {
		this.pictures = pictures;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	@Override
	public String toString() {
		return "BrandsModel [id=" + id + ", pictures=" + pictures + ", type=" + type + ", Content=" + Content + "]";
	}

	public BrandsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BrandsModel(int id, String pictures, String type, String content) {
		super();
		this.id = id;
		this.pictures = pictures;
		this.type = type;
		Content = content;
	}

}
