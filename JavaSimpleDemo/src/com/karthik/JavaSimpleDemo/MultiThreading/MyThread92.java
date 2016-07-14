package com.karthik.JavaSimpleDemo.MultiThreading;

public class MyThread92 extends Thread {
	int total = 0;
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				total = total + i;
			}
			this.notify();
		}

	}
}
