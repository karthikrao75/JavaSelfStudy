package com.karthik.JavaSimpleDemo.designPattern.builder;

public class PhoneBuilder {

	private long screenSize;
	private long memory;
	private String brand;
	private int androidVersion;
	private String cameraSpec;

	public void setScreenSize(long screenSize) {
		this.screenSize = screenSize;
	}

	public PhoneBuilder setMemory(long memory) {
		this.memory = memory;
		return this;
	}

	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public PhoneBuilder setAndroidVersion(int androidVersion) {
		this.androidVersion = androidVersion;
		return this;
	}

	public PhoneBuilder setCameraSpec(String cameraSpec) {
		this.cameraSpec = cameraSpec;
		return this;
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

	public Phone build() {
		return new Phone(this);
	}

}
