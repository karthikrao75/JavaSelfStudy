package com.karthik.JavaSimpleDemo.designPattern.builder;

public class BuilderPattern {

	public static void main(String[] args) {
		PhoneBuilder builder = new PhoneBuilder();
		builder.setBrand("MI").setAndroidVersion(9);
		Phone p = builder.build();
		System.out.println(p.getBrand());
	}
}
