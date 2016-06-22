package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample8 {

//	sleep() - pausing for particular amount of time 
	//  2 methods for sleep 
		// sleep(long ms)
		// sleep(long ms,int ns)
	
		// gives checked exception Interrupted Exception 
	//if running thread calls sleep(ms) then it will go for sleeping state 
	//will wait in sleeping state until sleep time gets over or Interrupted
	//then will go for runnable or ready state.
	
	//example slide rotator every 5 seconds.
	public static void main(String[] args) {
		for(int i=1;i<=6;i++){
			System.out.println("slide_"+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
