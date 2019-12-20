package com.lijia.java.study.memory;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		int size = 1024 * 1024 * 8;
		List<byte[]> list = new ArrayList<byte[]>();
		for (int i = 0; i < 1024; i++) {
			System.out.println("JVM 写入数据" + (i + 1) + "M");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list.add(new byte[size]);
		}

	}

}