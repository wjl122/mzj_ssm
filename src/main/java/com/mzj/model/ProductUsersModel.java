package com.mzj.model;

public class ProductUsersModel {
  private int id;
  private String usename;
  private String password;
  private String remark;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsename() {
	return usename;
}
public void setUsename(String usename) {
	this.usename = usename;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
@Override
public String toString() {
	return "ProductUsersModel [id=" + id + ", usename=" + usename + ", password=" + password + ", remark=" + remark
			+ "]";
}
public ProductUsersModel(int id, String usename, String password, String remark) {
	super();
	this.id = id;
	this.usename = usename;
	this.password = password;
	this.remark = remark;
}
public ProductUsersModel() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
  
  
}
