package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component("employee") //pojo
//@Service("employee") //service package
@Repository("employee") // dao layer
public class Employee {
	@Value("35")
	private int empnum;
	@Value("Vani")
	private String empname;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Employee(@Value("22") int empnum, @Value("Niharika") String empname) {
		super();
		this.empnum = empnum;
		this.empname = empname;
	}

	public int getEmpnum() {
		return empnum;
	}

	@Value("90")
	public void setEmpnum(int empnum) {
		this.empnum = empnum;
	}

	public String getEmpname() {
		return empname;
	}

	@Value("Mounika")
	public void setEmpname(String empname) {
		this.empname = empname;
	}

}
