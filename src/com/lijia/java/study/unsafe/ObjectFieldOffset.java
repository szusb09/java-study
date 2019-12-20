package com.lijia.java.study.unsafe;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * <p>
 * unsafe.objectFieldOffset内存修改,绕过安全检查器
 * <p>
 * 通过获取目标对象的字段在内存中的offset(偏移量)，并使用putInt()方法，类的ACCESS_ALLOWED
 * 被修改。在已知类结构的时候，数据的偏移总是可以获得的（与C++中的类中数据的偏移计算是一样的）。
 * 
 * @author lijia
 *
 */
public class ObjectFieldOffset {

	public static void main(String[] args) throws Exception {
		Field f = Unsafe.class.getDeclaredField("theUnsafe");
		f.setAccessible(true);
		Unsafe unsafe = (Unsafe) f.get(null);

		Guard guard = new Guard();
		System.out.println(guard.giveAccess()); // false,no access

		// bypass
		Field field = guard.getClass().getDeclaredField("ACCESS_ALLOWED");
		unsafe.putInt(guard, unsafe.objectFieldOffset(field), 42);// memory corruption
		System.out.println(guard.giveAccess()); // true,access

	}

	static class Guard {
		private int ACCESS_ALLOWED = 1;

		public boolean giveAccess() {
			return 42 == ACCESS_ALLOWED;
		}
	}

}
