package com.mzj.model;

public class SalesModel {

	private int id;
	private String province;
	private String city;
	private String name;
	private String adress;
	private String phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "SalesModel [id=" + id + ", province=" + province + ", city=" + city + ", name=" + name + ", adress="
				+ adress + ", phone=" + phone + "]";
	}

	public SalesModel(int id, String province, String city, String name, String adress, String phone) {
		super();
		this.id = id;
		this.province = province;
		this.city = city;
		this.name = name;
		this.adress = adress;
		this.phone = phone;
	}

	public SalesModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
