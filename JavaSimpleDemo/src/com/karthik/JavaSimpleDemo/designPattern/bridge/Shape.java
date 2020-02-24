package com.karthik.JavaSimpleDemo.designPattern.bridge;

public abstract class Shape {

	Color color;

	public Shape(Color c) {
		this.color = c;
	}

	public abstract void drawShape();

}
