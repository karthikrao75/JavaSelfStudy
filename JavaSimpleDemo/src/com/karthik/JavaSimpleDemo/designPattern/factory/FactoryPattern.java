package com.karthik.JavaSimpleDemo.designPattern.factory;

public class FactoryPattern {

	public static void main(String[] args) {
		OS os = OSFactory.getOSInstance("Android", 8);
		os.getOSType();
	}

}
