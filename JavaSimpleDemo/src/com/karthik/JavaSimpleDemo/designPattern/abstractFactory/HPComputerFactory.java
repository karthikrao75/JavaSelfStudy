package com.karthik.JavaSimpleDemo.designPattern.abstractFactory;

public class HPComputerFactory extends AbstractComputerFactory{

	private String brand;
	private int ram;
	private float screenSize;
	private String hardDriveSize;

	public HPComputerFactory(String brand, int ram, float screenSize, String hardDriveSize) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.screenSize = screenSize;
		this.hardDriveSize = hardDriveSize;
	}

	@Override
	public Computer getComputer() {
		return new HPComputer(brand, ram, screenSize, hardDriveSize);
	}
}
