package com.karthik.JavaSimpleDemo.designPattern.decorator;

public class LaxuryCar extends CarDecorator {

	public LaxuryCar(Car car) {
		super(car);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.println("Laxury Car");
	}

}
