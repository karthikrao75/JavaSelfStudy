package com.karthik.JavaSimpleDemo.designPattern.facade;

public class NonVegHotel implements Hotel {

	@Override
	public Menue getMenue() {
		Menue vegMenue = new Menue();
		vegMenue.setMenue("Non-Veg Menue");
		return vegMenue;
	}

}
