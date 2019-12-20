package com.lijia.java.study.memory;

public class Recursion {
	public int currentValue = 0;
	
	public void recursionSelf() {
		currentValue += 1;
		recursionSelf();
	}
}
