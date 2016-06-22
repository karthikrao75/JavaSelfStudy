package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample6 {
	//example for child thread waiting for main thread to complete.
	public static void main(String[] args) {
		MyThread5.main=Thread.currentThread();
		MyThread5 thread5=new MyThread5();
		thread5.start();
		for(int i=0;i<=3;i++){
			System.out.println("main Thread");
		}
		System.out.println("after main");

	}

}

/*output:
		main Thread
		main Thread
		main Thread
		main Thread
		after main
		child thread*/
