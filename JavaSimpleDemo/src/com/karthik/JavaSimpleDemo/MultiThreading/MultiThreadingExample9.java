package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample9 {
	
	// public void interrupt() --Thread class
	
	// thread can be interrupted using this method 
	// this method will work only when thread is in waiting or sleeping state.
	// it will actually wait for thread to enter sleep or waiting state 
	public static void main(String[] args) {
		MyThread6 thread6=new MyThread6();
		thread6.start();
		thread6.interrupt();
		System.out.println("end of main");
	}

}
/*output:
	end of main
	I am Lazy
	I am Lazy
	I am Lazy
	I am Lazy
	Interrupted*/