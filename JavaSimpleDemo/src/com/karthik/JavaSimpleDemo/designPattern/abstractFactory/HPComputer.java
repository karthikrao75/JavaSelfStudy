package com.karthik.JavaSimpleDemo.designPattern.abstractFactory;

public class HPComputer extends Computer {

	private String brand;
	private int ram;
	private float screenSize;
	private String hardDriveSize;

	@Override
	public void getComputerConfig() {
		System.out.println("Welcome to HP Corp.");
		System.out.println("Brand:" + brand);
		System.out.println("RAM:" + ram);
		System.out.println("Screen Size:" + screenSize);
		System.out.println("Hard Drive Size :" + hardDriveSize);
	}

	public HPComputer(String brand, int ram, float screenSize, String hardDriveSize) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.screenSize = screenSize;
		this.hardDriveSize = hardDriveSize;
	}

}
