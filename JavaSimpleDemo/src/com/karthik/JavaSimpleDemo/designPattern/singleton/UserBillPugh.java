package com.karthik.JavaSimpleDemo.designPattern.singleton;

public class UserBillPugh {
	private UserBillPugh() {
	}
	
	private static class UserBillPughHelper{
		private static final UserBillPugh INSTANCE = new UserBillPugh();
	}
	
	public static UserBillPugh getInstance(){
		return UserBillPughHelper.INSTANCE;
	}

}
