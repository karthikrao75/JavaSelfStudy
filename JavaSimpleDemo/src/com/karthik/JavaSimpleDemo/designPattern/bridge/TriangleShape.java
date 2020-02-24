package com.karthik.JavaSimpleDemo.designPattern.bridge;

public class TriangleShape extends Shape {

	public TriangleShape(Color c) {
		super(c);
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing Triangle with Color");
		color.applyColor();
	}

}
