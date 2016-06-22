package com.karthik.JavaSimpleDemo.MultiThreading;

public class MyThread3 extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
