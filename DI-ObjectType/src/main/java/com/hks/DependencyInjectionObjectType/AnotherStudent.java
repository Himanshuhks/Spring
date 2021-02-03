package com.hks.DependencyInjectionObjectType;

public class AnotherStudent {
	private Mathcheat mathcheat;

	public void setMathcheat(Mathcheat mathcheat) {
		this.mathcheat = mathcheat;
	}
	public void doCheating() {
		mathcheat.cheating();
	}
}
