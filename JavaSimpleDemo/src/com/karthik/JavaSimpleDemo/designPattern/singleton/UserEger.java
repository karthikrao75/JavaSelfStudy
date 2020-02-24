package com.karthik.JavaSimpleDemo.designPattern.singleton;

public class UserEger {

	private static final UserEger userEger = new UserEger();

	private UserEger() {

	}

	public static UserEger getUserInstance() {
		return userEger;
	}
}
