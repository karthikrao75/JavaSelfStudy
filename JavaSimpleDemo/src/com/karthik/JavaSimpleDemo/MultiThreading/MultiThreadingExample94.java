package com.karthik.JavaSimpleDemo.MultiThreading;

/*
 * Thread Group
 * 
 * every thread in java has thread group 
 * 
 * Main thread is in Main Thread group which is intern is part of system Thread group.
 * some other thread in system thread group are garbage collection thread(finalizer), reference handler, signal dispatcher etc.
 * All system threads are daemon thread.
 * 
 * ThreadGroup is present in java.lang package and it is also child class of object.
 */
public class MultiThreadingExample94 {

	public void getknowledgeOnThreadGroup(){
		// constructor that takes group name
		ThreadGroup group1=new ThreadGroup("MyThreadGroup");
		System.out.println(group1.getName()); //MyThreadGroup
		System.out.println(group1.getParent().getName()); // main
		
		//constructor which takes parent group and group name
		ThreadGroup group2=new ThreadGroup(group1, "MyChildGroup");
		System.out.println(group2.getName()); //MyChildGroup
		System.out.println(group2.getParent().getName()); // MyThreadGroup
		
		// gets max priority of thread group , default max priority is 10 
		System.out.println(group1.getMaxPriority()); //10
		
		Thread thread=new Thread(group1, "first Thread");
		group1.setMaxPriority(3);
		Thread thread2=new Thread(group1, "Second thread");
		System.out.println(group1.getMaxPriority()); // 3
		System.out.println(thread.getPriority());//5
		System.out.println(thread2.getPriority());//3
		thread2.setPriority(7);
		System.out.println(thread2.getPriority()); // 3
		
		// prints thread information into the console.
		group1.list();
		
		System.out.println(group1.activeCount()); //0
		
		//return active sub groups groups in current thread group
		
		System.out.println(group1.activeGroupCount());// 1
		
		// other methods are 
		
		// group1.enumerate(thread array); copies call the active threads and sub threads in the group into the array.		
		// group1.enumerate(thread group array); copies all the thread group sub groups into the array.
		
		System.out.println(group1.isDaemon()); // false
		
		group1.interrupt();// to interrupt all the waiting or sleeping thread in the thread group.
		group1.destroy(); // to destroy thread and its sub thread group.
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getThreadGroup().getName()); // Main 
		
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); // system
		
		MultiThreadingExample94 example94=new MultiThreadingExample94();
		example94.getknowledgeOnThreadGroup();
		
		ThreadGroup threadGroup=new ThreadGroup("testerParentThreadGroup");
		ThreadGroup threadGroup2=new ThreadGroup(threadGroup, "testerChildThreadGroup");
		Thread thread1=new Thread(threadGroup, "child Thread1");
		Thread thread2=new Thread(threadGroup2, "child Thread2");
		thread1.start();
		thread2.start();
		System.out.println(threadGroup.activeCount()); //2
		System.out.println(threadGroup.activeGroupCount()); //1
		threadGroup.list();
		
		Thread[] threads=new Thread[threadGroup.activeCount()];
		threadGroup.enumerate(threads);
		for(Thread thread:threads){
			System.out.println(thread.getName());
			/*
			child Thread1
			child Thread2
			*/
		}
		
		
		Thread.sleep(10000);
		System.out.println(threadGroup.activeCount()); //0
		System.out.println(threadGroup.activeGroupCount());//1
		threadGroup.list();
		
		
		
	}
	

}


class MyThread extends Thread{
	public MyThread(ThreadGroup group,String threadName){
		super(group,threadName);
	}
	public void Run(){
		System.out.println("Child Thread ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}