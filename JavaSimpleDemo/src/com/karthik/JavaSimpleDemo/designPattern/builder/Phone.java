package com.karthik.JavaSimpleDemo.designPattern.builder;

public class Phone {

	private long screenSize;
	private long memory;
	private String brand;
	private int androidVersion;
	private String cameraSpec;

	public Phone(long screenSize, long memory, String brand, int androidVersion, String cameraSpec) {
		super();
		this.screenSize = screenSize;
		this.memory = memory;
		this.brand = brand;
		this.androidVersion = androidVersion;
		this.cameraSpec = cameraSpec;
	}
	
	public Phone(PhoneBuilder builder){
		this.screenSize = builder.getScreenSize();
		this.memory = builder.getMemory();
		this.brand = builder.getBrand();
		this.androidVersion = builder.getAndroidVersion();
		this.cameraSpec = builder.getCameraSpec();	
	}

	public long getScreenSize() {
		return screenSize;
	}

	public long getMemory() {
		return memory;
	}

	public String getBrand() {
		return brand;
	}

	public int getAndroidVersion() {
		return androidVersion;
	}

	public String getCameraSpec() {
		return cameraSpec;
	}
	
	
}
