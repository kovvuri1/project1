package com.tns.multilevelinheritance;

public class country {
	private String countryname;
	
	public country(String countryname) {
		super();
		this.countryname=countryname;
		
	}
    
	public String getcountryname() {
		
		return countryname;
	}
	
	public void setCountryname(String countryname) {
		this.countryname=countryname;
	}

	public String tostring() {
		return "Country [countryname=" + countryname +"]";
	}
	
	
}
