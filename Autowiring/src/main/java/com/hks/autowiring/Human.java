package com.hks.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	public Human() {}
	
	
	public Human(Heart heart) {
		this.heart = heart;
	}
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//	}
	
	public void pumping() {
		heart.pump();
	}
	
}
