package com.karthik.JavaSimpleDemo.designPattern.facade;

public class HotelHelper {

	public HotelHelper() {

	}

	public Menue getVegHotelMenue() {
		VegHotel v = new VegHotel();
		return v.getMenue();
	}
	
	public Menue getNonVegHotelMenue() {
		VegHotel v = new VegHotel();
		return v.getMenue();
	}
}
