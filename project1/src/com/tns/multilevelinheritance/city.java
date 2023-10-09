package com.tns.multilevelinheritance;

public class city extends state{
	public city(String countryname) {
		super(countryname);
	}
	
	private String cityname;
	
	public String getcityname() {
		return cityname;
	}
	
	public void setcityname(String cityname) {
		this.cityname = cityname;
	}
	
}