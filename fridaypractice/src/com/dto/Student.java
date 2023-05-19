package com.dto;

public class Student {
	private int rool;
	private String name;
	private String Address;
	public Student(int rool, String name, String address) {
		super();
		this.rool = rool;
		this.name = name;
		Address = address;
	}
	public int getRool() {
		return rool;
	}
	public void setRool(int rool) {
		this.rool = rool;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [rool=" + rool + ", name=" + name + ", Address=" + Address + "]";
	}
	
	

}
