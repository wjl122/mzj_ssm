package com.mzj.model;

public class SigalPagesModel {
	private int id;
	private String type;
	private String contents;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "SigalPagesModel [id=" + id + ", type=" + type + ", contents=" + contents + "]";
	}

	public SigalPagesModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SigalPagesModel(int id, String type, String contents) {
		super();
		this.id = id;
		this.type = type;
		this.contents = contents;
	}

}
