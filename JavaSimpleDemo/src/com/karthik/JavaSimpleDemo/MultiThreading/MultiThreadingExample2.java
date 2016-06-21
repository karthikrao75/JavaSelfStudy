package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample2 {

	public static void main(String[] args) {
		//every thread in java has name. may be default name or customized.
		
		System.out.println(Thread.currentThread());
		// Thread[main,5,main]
		
		System.out.println(Thread.currentThread().getName());
		//main 				-default name.
		
		MyThread1 thread1=new MyThread1();
		System.out.println(thread1.getName());
		//Thread-0
		
		MyThread2 thread2=new MyThread2();
		Thread thread=new Thread(thread2);
		System.out.println(thread.getName());
		//Thread-1
		
		//if u want to change name of current thread then
		Thread.currentThread().setName("mine");
		
		System.out.println(Thread.currentThread().getName());
		//mine
		
		//set any thread with a name 
		thread1.setName("MyThread1");
		System.out.println(thread1.getName());
		//MyThread1
		
		//thread constructor with name
		Thread thread3=new Thread("thread");
		
		//constructor with runnable and name
		Thread thread4=new Thread(thread2, "name");
	}
}
