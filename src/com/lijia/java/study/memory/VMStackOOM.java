package com.lijia.java.study.memory;

/**
 * 运行时jvm参数的设置 -Xss104K
 * @author Administrator
 *
 */
public class VMStackOOM {

	public static void main(String[] args) {
		Recursion recursion = new Recursion();
		try {
			recursion.recursionSelf();
		} catch (Throwable e) {
			System.out.println("current value :" + recursion.currentValue);
			throw e;
		}
	}

}
