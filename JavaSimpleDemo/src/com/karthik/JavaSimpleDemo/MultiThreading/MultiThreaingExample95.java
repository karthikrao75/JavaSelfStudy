package com.karthik.JavaSimpleDemo.MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreaingExample95 {

	// Lock

	/*
	 * 
	 * Java.util.concurrent.lock
	 * 
	 * 
	 * In Synchronized keyword there is no facility to try for lock.and also
	 * there is no maximum waiting time to get lock so thread will wait until it
	 * gets lock which may cause performance issue or dead lock. Also once the
	 * lock is released we are not sure which waiting thread will get the lock.
	 * There is no api to list out all waiting thread for lock. Synchronized key
	 * word is used at method level or within the method but not possible to use
	 * across multiple method.
	 * 
	 * To solve the above problem Java.util.concurrent.lock package in 1.5
	 * version
	 * 
	 * Lock(I) Implicit lock acquired by thread to execute synchronized method
	 * or block . lock(I)has more extensive operations than traditional implicit
	 * locks.
	 * 
	 */
	public static void main(String[] args) {

		// ReentrantLock implements lock and extends object
		// ReentrantLock can acquire lock N number of times with out any issue
		// internally ReentrantLock increases the thread hold count when we call
		// lock and decreases the hold count when we call unlock.
		ReentrantLock lock = new ReentrantLock();

		// ReentrantLock with fair (truly)
		// if true , if multiple thread are waiting longest thread will get the
		// chance first.
		// default vAlue is false.
		ReentrantLock lock2 = new ReentrantLock(true);
		// important methods from Lock Interface
		// if the lock is available it will immediately get the lock or else it
		// will wait(Same as synchronized lock).
		lock.lock();

		// if the lock is available it will immediately get the lock or else it
		// will continue.
		lock.tryLock(); // returns boolean so alternative execution can be given
						// if false.

		try {
			// if the lock is available it will immediately get the lock or else
			// it will wait until specified amount of time.
			lock.tryLock(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Acquires the lock unless the current thread is interrupted. Acquires
		 * the lock if it is not held by another thread and returns immediately,
		 * setting the lock hold count to one.
		 * 
		 * If the current thread already holds this lock then the hold count is
		 * incremented by one and the method returns immediately.
		 * 
		 * If the lock is held by another thread then the current thread becomes
		 * disabled for thread scheduling purposes and lies dormant until one of
		 * two things happens: •The lock is acquired by the current thread; or
		 * •Some other thread interrupts the current thread.
		 * 
		 * If the lock is acquired by the current thread then the lock hold
		 * count is set to one.
		 */

		try {
			lock.lockInterruptibly();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(lock.getHoldCount()); // 4

		// current thread should having the lock or else it will throw run time
		// exception saying illegalMonitiorStateException.
		// it will release one hold at a time . when hold count decreases to 0
		// it releases the lock.
		lock.unlock();
		System.out.println(lock.getHoldCount()); // 3
		lock.unlock();
		System.out.println(lock.getHoldCount()); // 2

		System.out.println(lock.isFair()); // fasle

		System.out.println(lock.isHeldByCurrentThread()); // true

		System.out.println(lock.isLocked()); // true

		System.out.println(lock.hasQueuedThreads()); // false

		System.out.println(lock.getQueueLength()); // 0

/*		Display display=new Display();
		MyThreadNew new1 = new MyThreadNew(display, "karthik");
		MyThreadNew new2 = new MyThreadNew(display, "srikanth");
		new1.start();
		new2.start();*/

		MyThreadNew1 myThreadNew1=new MyThreadNew1();
		MyThreadNew1 myThreadNew12= new MyThreadNew1();
		myThreadNew1.start();
		myThreadNew12.start();
		
		MyThreadNew2 myThreadNew2=new MyThreadNew2();
		MyThreadNew2 myThreadNew22= new MyThreadNew2();
		myThreadNew2.start();
		myThreadNew22.start();
	}



}

class Display {
	private ReentrantLock lock = new ReentrantLock();

	public void wish(String name) {
		lock.lock();
		for (int i = 0; i <= 5; i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		lock.unlock(); // if unlock is not written dead lock situation will be created
	}
}
class MyThreadNew extends Thread {
	private Display display;
	private String name;

	public MyThreadNew(Display display, String name) {
		super();
		this.display = display;
		this.name = name;
	}

	public void run() {
		display.wish(name);
	}
}

class MyThreadNew1 extends Thread{

	private ReentrantLock lock = new ReentrantLock();
	public void run(){
		if(lock.tryLock()){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" - trying with lock");
			lock.unlock();
		}else {
			System.out.println(Thread.currentThread().getName()+"trying without lock");
		}
	}
}



class MyThreadNew2 extends Thread{

	private ReentrantLock lock = new ReentrantLock();
	public void run(){
	do{
		try {
			if(lock.tryLock(5000,TimeUnit.MILLISECONDS)){
				Thread.sleep(10000);
				System.out.println(Thread.currentThread().getName()+" got lock");
				Thread.sleep(30000);
				lock.unlock();
				break;
			}
			else{
				System.out.println("unable to get lock will keep on trying");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}while(true);
	}
}