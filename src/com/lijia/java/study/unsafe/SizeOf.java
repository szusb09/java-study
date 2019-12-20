package com.lijia.java.study.unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import sun.misc.Unsafe;

/**
 * <p>
 * sizeOf计算内存大小（Unsafe.getDeclaredFields和Unsafe.objectFieldOffset）
 * <p>
 * 算法的思路：从底层子类开始，依次取出它自己和它的所有超类的非静态域，放置到一个HashSet中
 * （重复的只计算一次，Java是单继承），然后使用objectFieldOffset()获得一个最大偏移，最后还考虑了对齐。
 * 
 * @author lijia
 *
 */
public class SizeOf {
	User arr = new User();

	public static void main(String[] args) throws Exception {
		SizeOf sizeOf = new SizeOf();
		Thread.sleep(100000);

		SizeOf.sizeOf(sizeOf);
	}

	public static Map<String, Integer> TYPE_LENGTH = new HashMap<String, Integer>();
	static {
		TYPE_LENGTH.put("boolean", 1);
		TYPE_LENGTH.put("byte", 1);
		TYPE_LENGTH.put("short", 2);
		TYPE_LENGTH.put("char", 2);
		TYPE_LENGTH.put("int", 4);
		TYPE_LENGTH.put("float", 4);
		TYPE_LENGTH.put("long", 8);
		TYPE_LENGTH.put("double", 8);
	}

	public static long sizeOf(Object o) throws Exception {
		Field field = Unsafe.class.getDeclaredField("theUnsafe");
		field.setAccessible(true);
		Unsafe unsafe = (Unsafe) field.get(null);

		Object targetObject = null;
		Class<? extends Object> c = o.getClass();
		Field maxField = null;
		long length = 0;
		long maxSize = 0;
		while (!c.isInstance(Object.class)) {
			for (Field field2 : c.getDeclaredFields()) {
				/*
				 * <p>通过属性修饰符判断是否为静态属性，对应值参照{@code
				 * java.lang.reflect.Modifier}。<br>有多个修饰符时所有修饰符的值相加返回
				 */
				if ((field2.getModifiers() & Modifier.STATIC) == 0) {
					long offset = unsafe.objectFieldOffset(field2);
					if (offset > maxSize) {
						maxSize = offset;
						maxField = field2;
					}
				}
			}
			c = c.getSuperclass();
		}

		maxSize = maxSize + length;
		Function<Long, Long> test = i -> (i / 8 + 1) * 8;
		Predicate<Long> predicate = i -> (i % 8) == 0;
		System.out.println("before padding:" + maxSize);
		if (predicate.test(maxSize)) {
			System.out.println("non-padding:" + maxSize);
		} else {
			System.out.println("padding:" + test.apply(maxSize));
		}
		// padding
		return test.apply(maxSize);
	}

	public class User {
		String name;
		int age;
		Teacher[] teachers = new Teacher[6];
	}

	public class Teacher {
		String name;
		int age;
		String objectName;
	}
}
