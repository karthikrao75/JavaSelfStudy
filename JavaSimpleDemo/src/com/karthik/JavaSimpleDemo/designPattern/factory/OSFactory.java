package com.karthik.JavaSimpleDemo.designPattern.factory;

public class OSFactory {

	public static OS getOSInstance(String osType, int version) {
		if (osType.equals("Android")) {
			return new AndroidOS(version);
		} else if (osType.equals("IOS")) {
			return new IOSOS(version);
		}
		return null;
	}
}
