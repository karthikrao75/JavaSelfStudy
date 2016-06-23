package com.karthik.JavaSimpleDemo.MultiThreading;

public class Show1 {
	public synchronized void showChar() {
		for (int i = 65; i <= 75; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void shownumber() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
