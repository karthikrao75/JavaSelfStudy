package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample5 {

	// join() - if a thread wants to wait for some other thread to complete.
	
	// join( long ms ) -joins for specified milliseconds .
	// join( long ms, int ns) -milliseconds and nanoseconds. 
	
	// it throws InterruptedException
	//if a running thread calls join method then it will go for waiting state.
	//and will be in waiting state until thread4 completes, join time completes or if waiting thread got interrupted
	// after that ready state 
	public static void main(String[] args) throws InterruptedException {
		
		MyThread4 thread4=new MyThread4();
		thread4.start();
		thread4.join();
		for(int i=0;i<=3;i++){
			System.out.println("main Thread");
		}
		System.out.println("after completing thread4");
	}

}
/*output:
	
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	Child Thread
	main Thread
	main Thread
	main Thread
	main Thread
	after completing thread4*/
