package com.karthik.JavaSimpleDemo.MultiThreading;

public class MyThread6 extends Thread{
	public void run(){
		try{
			for(int i=0;i<5;i++){
				System.out.println("I am Lazy");
				if(i==3){
					Thread.sleep(2000);
				}
			}
		}
		catch(InterruptedException exception){
			System.out.println("Interrupted");
		}
	}
}
