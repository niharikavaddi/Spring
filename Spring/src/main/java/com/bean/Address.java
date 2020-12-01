package com.bean;

public class Address {
	private String housenumber;
	private String streetnumber;
	private String city;

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreetnumber() {
		return streetnumber;
	}

	public void setStreetnumber(String streetnumber) {
		this.streetnumber = streetnumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String housenumber, String streetnumber, String city) {
		super();
		this.housenumber = housenumber;
		this.streetnumber = streetnumber;
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
}
