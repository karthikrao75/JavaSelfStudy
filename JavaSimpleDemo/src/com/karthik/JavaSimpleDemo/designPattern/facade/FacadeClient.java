package com.karthik.JavaSimpleDemo.designPattern.facade;

public class FacadeClient {

	public static void main(String[] args) {
		HotelHelper helper = new HotelHelper();
		helper.getVegHotelMenue();
		helper.getNonVegHotelMenue();
	}

}
