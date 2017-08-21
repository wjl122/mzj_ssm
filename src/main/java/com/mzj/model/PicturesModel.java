package com.mzj.model;

public class PicturesModel {
	private String id;
	private String name;
	private String type;
	private String pictures;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPictures() {
		return pictures;
	}

	public void setPictures(String pictures) {
		this.pictures = pictures;
	}

	@Override
	public String toString() {
		return "PictuersModel [id=" + id + ", name=" + name + ", type=" + type + ", pictures=" + pictures + "]";
	}

	public PicturesModel(String id, String name, String type, String pictures) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.pictures = pictures;
	}

	public PicturesModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
