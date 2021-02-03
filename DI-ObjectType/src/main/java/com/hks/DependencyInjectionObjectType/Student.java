package com.hks.DependencyInjectionObjectType;

public class Student {
	private Mathcheat mathcheat;

	public void setMathcheat(Mathcheat mathcheat) {
		this.mathcheat = mathcheat;
	}
	public void doCheating() {
		mathcheat.cheating();
	}
	
}
