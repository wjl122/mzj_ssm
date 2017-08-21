package com.mzj.model;

public class ProductsModel {
	private String id;
	private String type;
	private String name;
	private String picture;
	private String protype;
	private boolean isnew;
	private String isnews;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getProtype() {
		return protype;
	}

	public void setProtype(String protype) {
		this.protype = protype;
	}

	public boolean isIsnew() {
		return isnew;
	}

	public void setIsnew(boolean isnew) {
		this.isnew = isnew;
	}

	public String getIsnews() {
		return isnews;
	}

	public void setIsnews(String isnews) {
		this.isnews = isnews;
	}

	@Override
	public String toString() {
		return "ProductsModel [id=" + id + ", type=" + type + ", name=" + name + ", picture=" + picture + ", protype="
				+ protype + ", isnew=" + isnew + ", isnews=" + isnews + "]";
	}

	public ProductsModel(String id, String type, String name, String picture, String protype, boolean isnew,
			String isnews) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.picture = picture;
		this.protype = protype;
		this.isnew = isnew;
		this.isnews = isnews;
	}

	public ProductsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
