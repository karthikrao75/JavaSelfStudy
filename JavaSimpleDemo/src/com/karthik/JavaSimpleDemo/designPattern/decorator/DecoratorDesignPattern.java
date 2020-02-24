package com.karthik.JavaSimpleDemo.designPattern.decorator;

public class DecoratorDesignPattern {

	public static void main(String[] args) {
		// hybrid car 
		Car c = new SportsCar(new LaxuryCar(new BasicCar()));
		c.assemble();
	}

}
