package com.karthik.JavaSimpleDemo.designPattern.abstractFactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		Computer computer = ComputerFactory.getComputerInstance(new HPComputerFactory("HP", 8, 15.6f, "500GB"));

		computer.getComputerConfig();
	}

}
