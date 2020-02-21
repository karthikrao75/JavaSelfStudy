package com.karthik.JavaSimpleDemo.designPattern.abstractFactory;

public class DellComputerFactory  extends AbstractComputerFactory{

	private String brand;
	private int ram;
	private float screenSize;
	private String hardDriveSize;

	public DellComputerFactory(String brand, int ram, float screenSize, String hardDriveSize) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.screenSize = screenSize;
		this.hardDriveSize = hardDriveSize;
	}

	@Override
	public Computer getComputer() {
		return new DellComputer(brand, ram, screenSize, hardDriveSize);
	}

}
