package com.karthik.JavaSimpleDemo.designPattern.abstractFactory;

public class ComputerFactory {

	public static Computer getComputerInstance(AbstractComputerFactory abstractComputerFactory) {

		return abstractComputerFactory.getComputer();
	}

}
