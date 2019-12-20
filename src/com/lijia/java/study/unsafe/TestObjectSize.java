package com.lijia.java.study.unsafe;

import java.io.IOException;

import com.javamex.classmexer.MemoryUtil;
import com.lijia.java.study.unsafe.SizeOf.User;

/**
 * VM options:
 * -javaagent:/Users/sangjian/dev/source-files/classmexer-0_03/classmexer.jar
 * -XX:+UseCompressedOops
 */
public class TestObjectSize {

	long[] arr = new long[6];

	public static void main(String[] args) throws IOException {
		TestObjectSize testObjectSize = new TestObjectSize();
		// 打印对象的shallow size
		System.out.println("Shallow Size: " + MemoryUtil.memoryUsageOf(testObjectSize) + " bytes");
		// 打印对象的 retained size
		System.out.println("Retained Size: " + MemoryUtil.deepMemoryUsageOf(testObjectSize) + " bytes");
		System.in.read();
	}
}