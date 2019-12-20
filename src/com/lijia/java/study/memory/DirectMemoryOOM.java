package com.lijia.java.study.memory;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * 设置 -XX:MaxDirectMemorySize=10M
 * @author Administrator
 *
 */
public class DirectMemoryOOM {

	private static final int _1MB = 1024 * 1024;

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Field unsafeField = Unsafe.class.getDeclaredFields()[0];
		unsafeField.setAccessible(true);
		Unsafe unsafe = (Unsafe) unsafeField.get(null);
		while (true) {
			unsafe.allocateMemory(_1MB);
		}

	}

}
