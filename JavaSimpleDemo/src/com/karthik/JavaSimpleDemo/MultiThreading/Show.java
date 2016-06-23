package com.karthik.JavaSimpleDemo.MultiThreading;

public class Show {
	public  void moringShow(String name) {
		for (int i = 0; i <= 3; i++) {
			System.out.println("Good Morning " + name);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
