package com.karthik.JavaSimpleDemo.designPattern.singleton;

public class UserDoubleThreadSafe {

	private static UserDoubleThreadSafe safe;

	private UserDoubleThreadSafe() {
	}

	public static UserDoubleThreadSafe getInstance() {
		if (safe == null) {
			synchronized (UserDoubleThreadSafe.class) {
				if (safe == null) {
					safe = new UserDoubleThreadSafe();
				}
			}
		}
		return safe;
	}

}
