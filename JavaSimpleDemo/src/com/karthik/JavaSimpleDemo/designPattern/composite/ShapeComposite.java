package com.karthik.JavaSimpleDemo.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ShapeComposite implements Shape {

	List<Shape> shape = new ArrayList<>();

	@Override
	public void draw(String fillColor) {
		for (Shape s : shape) {
			s.draw(fillColor);
		}
	}

}
