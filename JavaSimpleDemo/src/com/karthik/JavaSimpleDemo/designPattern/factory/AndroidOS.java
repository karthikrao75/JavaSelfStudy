package com.karthik.JavaSimpleDemo.designPattern.factory;

public class AndroidOS extends OS {

	private int version;

	@Override
	public void getOSType() {
		System.out.println("Android "+version);
	}

	public AndroidOS(int version) {
		super();
		this.version = version;
	}


	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
