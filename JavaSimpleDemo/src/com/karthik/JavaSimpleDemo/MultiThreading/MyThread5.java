package com.karthik.JavaSimpleDemo.MultiThreading;

public class MyThread5 extends Thread{
	static Thread main;
	public void run(){
		try{
			main.join();
		}
		catch(InterruptedException exception){
			exception.printStackTrace();
		}
		System.out.println("child thread");
	}
}
