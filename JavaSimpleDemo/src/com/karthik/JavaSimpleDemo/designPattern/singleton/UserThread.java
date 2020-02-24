package com.karthik.JavaSimpleDemo.designPattern.singleton;

public class UserThread {

	private static UserThread userThread;
	
	private UserThread(){
		
	}
	
	public static synchronized UserThread getInstance(){
		if(userThread==null){
			userThread = new UserThread();
		}
		return userThread;
	}
}
