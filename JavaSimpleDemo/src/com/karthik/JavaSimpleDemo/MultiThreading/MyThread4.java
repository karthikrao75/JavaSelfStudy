package com.karthik.JavaSimpleDemo.MultiThreading;

public class MyThread4 extends Thread {
	public void run() {
		for (int i = 0; i <= 7; i++) {
			System.out.println("Child Thread");
		}
	}
}
