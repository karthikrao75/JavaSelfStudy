package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample7 {

	// if two thread are calling join on each other then it will create a
	// deadlock.
	public static void main(String[] args) throws InterruptedException {
		MyThread5.main=Thread.currentThread();
		MyThread5 thread5 = new MyThread5();
		thread5.start();
		thread5.join();
		for (int i = 0; i <= 3; i++) {
			System.out.println("main Thread");
		}
		System.out.println("after completing thread4");
	}

}

// no output because of deadlock 