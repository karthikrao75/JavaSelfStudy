package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample1 {

	// Thread - independent flow of execution,
	
	//two ways of to create a thread 
		// By extending thread class.
		// By implementing runnable.
	
	//Thread class is present in lang package.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//main thread is the default thread that the JVM starts with priority 5
		MyThread1 thread1=new MyThread1();
		thread1.start();  //this will start the thread and call the run method.
		
		//after this step child thread is also created and inherits the parent properties hence priority will be 5.
		
		//after this line there is two thread 
		
		//output:Thread implementation by extending Thread class
		
		MyThread2 thread2=new MyThread2();
		Thread thread=new Thread(thread2); // new state or born state
	
		thread.start(); //Ready or runnable state
		
		//once thread completes running it will be in dead state.
		
		
		//Runnable interface dosen't have start() of its own so we have to use thread class to start the thread.
		//output:Thread implementation using Runnable interface
		
		
		thread.start();
		//if u try to re-start the same thread
		//will give java.lang.IllegalThreadStateException
		
		//note:
		//start() -method will register the thread to thread scheduler and performs all mandatory activities and Invokes run();
		
		//overriding of run method will be as normal method which dosen't have any significance 
		//overriding of start method will act as normal method super.start() within the overriden method 
		//will call thread class start method.  
	}

}
