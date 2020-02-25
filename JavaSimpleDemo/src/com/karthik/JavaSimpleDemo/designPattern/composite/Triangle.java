package com.karthik.JavaSimpleDemo.designPattern.composite;

public class Triangle implements Shape{

	@Override
	public void draw(String fillColor) {
		System.out.println("Create Triangle with color "+fillColor);
	}

}
