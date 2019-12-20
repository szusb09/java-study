package com.lijia.java.study.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时设置jvm参数-Xms5M -Xmx5M,出现java.lang.OutOfMemoryError: Java heap space异常
 * 运行时设置jvm参数-XX:MetaspaceSize=2M -XX:MaxMetaspaceSize=2M,这出现java.lang.OutOfMemoryError:
 * PermGen space异常
 * 
 * @author Administrator
 *
 */
public class HeapOOM {
	static class OOMObject {
	}

	public static void main(String[] args) {
		List<UserBean> users = new ArrayList<UserBean>();
		while (true) {
			users.add(new UserBean());
		}
	}
}
