package com.hks.autowiring;

public class Heart {
	String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void pump() {
		System.out.println("Pumping");
	}
}
