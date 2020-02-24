package com.karthik.JavaSimpleDemo.designPattern.singleton;

public class UserLazy {

	private static UserLazy user;

	private UserLazy() {

	}

	public static UserLazy getInstance() {
		if (user == null) {
			user = new UserLazy();
		}
		return user;
	}
}
