package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.MIN_PRIORITY);
		//1
		
		System.out.println(Thread.NORM_PRIORITY);
		//5
		System.out.println(Thread.MAX_PRIORITY);
		//10
		
		//will get main thread or current thread priority 
		System.out.println(Thread.currentThread().getPriority());
		
		//child thread will inherit parent thread priority 
		
		MyThread1 myThread1=new MyThread1();
		System.out.println(myThread1.getPriority());
		//5
		
		//set main thread priority 
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		//10

		//now child thread wont inherit priority.
		System.out.println(myThread1.getPriority());
		//5
		
		myThread1.setPriority(8);
		System.out.println(myThread1.getPriority());
		//8
		
		
		myThread1.setPriority(17);
		//thread priority should be in the range of 1-10 or else will give 
		//java.lang.IllegalArgumentException
		
	}

}
