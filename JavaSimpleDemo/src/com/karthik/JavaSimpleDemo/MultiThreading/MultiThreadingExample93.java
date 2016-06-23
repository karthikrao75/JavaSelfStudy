package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample93 {
	//synchronized block - if very few line of method needs to be synchronized then instead of 
	// using synchronized whole method ---which will slow the process .
	//then that code can be put inside synchronized block
	
	//to get lock of current object
	// synchronized (this){if the thread gets lock of current object only then it will execute }
	// synchronized (object){ if thread gets lock of that object only then will execute }
	// synchronized (name.class){ if thread gets class level lock of specified class }
	
	//synchronized (10){ will give compile time exception}
	
	//race condition -multiple thread working on same object,causing data inconsistency is called 
	
	//thread can access multiple lock at a time.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Show3 show = new Show3();
		MyThread91 thread91 = new MyThread91(show, "karthik");
		thread91.start();

		MyThread91 thread92 = new MyThread91(show, "srikanth");
		thread92.start();
	}
//output
		/*	Good Morning karthik
			Good Morning karthik
			Good Morning karthik
			Good Morning srikanth
			Good Morning srikanth
			Good Morning srikanth
			Good Morning srikanth*/
}
