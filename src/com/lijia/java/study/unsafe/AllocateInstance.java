package com.lijia.java.study.unsafe;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * <p>
 * unsafe.allocateInstance方法创建一个类的实例，不需要调用它的构造函数、初使化代码、
 * 各种JVM安全检查以及其它的一些底层的东西。即使构造函数是私有，我们也可以通过这个方法创建它的实例, 对于单例模式，简直是噩梦。
 * 
 * @author lijia
 *
 */
public class AllocateInstance {

	public static void main(String[] args) throws Exception {
		Field f = Unsafe.class.getDeclaredField("theUnsafe");
		f.setAccessible(true);
		Unsafe unsafe = (Unsafe) f.get(null);

		A o1 = new A(); // constructor
		System.out.println(o1.a()); // prints 1
		A o2 = A.class.newInstance(); // reflection
		System.out.println(o2.a()); // prints 1
		A o3 = (A) unsafe.allocateInstance(A.class); // unsafe
		System.out.println(o3.a()); // prints 0
	}

	static class A {
		private long a; // not initialized value, default 0

		public A() {
			this.a = 1; // initialization
		}

		public long a() {
			return this.a;
		}
	}

}
