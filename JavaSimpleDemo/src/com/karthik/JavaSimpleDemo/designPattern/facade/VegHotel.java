package com.karthik.JavaSimpleDemo.designPattern.facade;

public class VegHotel implements Hotel {

	@Override
	public Menue getMenue() {
		Menue vegMenue = new Menue();
		vegMenue.setMenue("Veg Menue");
		return vegMenue;
	}


}
