package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample92 {

	//class level lock -every class in java has class level lock
	// if a thread has to execute static synchronized method it will use class level lock. 
	
	//this example is of synchronized only not static synchronized.
	public static void main(String[] args) {
		
		Show1 show1=new Show1();
		MyThread8 thread8=new MyThread8(show1);
		MyThread9 thread9=new MyThread9(show1);
		thread8.start();
		thread9.start();

	}

}
