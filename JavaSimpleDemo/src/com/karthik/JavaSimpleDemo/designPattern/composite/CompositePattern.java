package com.karthik.JavaSimpleDemo.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {

	public static void main(String[] args) {
		ShapeComposite composite=new ShapeComposite();
		List<Shape> s = new ArrayList<>();
		s.add(new Circle());
		s.add(new Square());
		s.add(new Triangle());
		composite.shape.addAll(s);
		
		composite.draw("Red");
		
		composite.draw("Green");
		
	}
}
