package com.bean;

import java.util.List;

public class Student {
	private int studentid;
	private String studentname;
	private List<Address> addresses;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentid, String studentname, List<Address> addresses) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.addresses = addresses;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
