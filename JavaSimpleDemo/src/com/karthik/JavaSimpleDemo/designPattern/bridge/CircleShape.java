package com.karthik.JavaSimpleDemo.designPattern.bridge;

public class CircleShape extends Shape {

	public CircleShape(Color c) {
		super(c);
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing Circular Shape with");
		color.applyColor();
	}

}
