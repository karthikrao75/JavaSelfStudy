package com.karthik.JavaSimpleDemo.MultiThreading;

public class Show3 {
	public  void moringShow(String name) {
		for (int i = 0; i <= 3; i++) {
			synchronized (this) {
				System.out.println("Good Morning " + name);
			}
			
		}
	}
}
