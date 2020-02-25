package com.karthik.JavaSimpleDemo.designPattern.composite;

public class Circle implements Shape{

	@Override
	public void draw(String fillColor) {
		System.out.println("Create Circle with color "+fillColor);
	}

}
