package com.karthik.JavaSimpleDemo.designPattern.composite;

public class Square implements Shape{

	@Override
	public void draw(String fillColor) {
		System.out.println("Create Square with color "+fillColor);
	}

}
