package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample4 {

	//yield() - The thread on which this method is called will pause its execution 
	// and checks if there is any other thread with the same priority if there is one then then it will give the 
	// control and go to ready state. 
	// if there is no thread with same priority (i.e low priority) then the current thread will continue processing.
	
	//next turn of current thread cannot be predicted and depends on thread scheduler.
	
	//when Thread.yield is called that thread will go for ready or runnable state.
	public static void main(String[] args) {
		
		MyThread3 thread3=new MyThread3();
		thread3.start();
		for(int i=0;i<=10;i++){
			System.out.println("main Thread");
		}
	}

}

//even though output cannot be predicted 
//here is a sample output
/*main Thread
main Thread
Child Thread --Thread.yield() is called 
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread*/
