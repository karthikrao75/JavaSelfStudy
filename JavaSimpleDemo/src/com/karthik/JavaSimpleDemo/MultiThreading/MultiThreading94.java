package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreading94 {

	// wait(), notify(), notifyAll()

	// threads communicate with each other using wait and notify methods
	// Thread which needs updation will call wait() and go on waiting state.
	// Thread which is responsible for updation will call notify and notifyAll
	// methods.

	// wait, notify, notifyAall methods are in object calls bcoz it is called on
	// object not thread.

	// to call these method that object lock should be there
	// hence these methods only work inside synchronized area.
	// or else we will runtime exception IllegalMonitorSateException

	// if a thread call wait() then it releases lock on that object and goes to
	// waiting state.

	// if a thread notify methods it will release lock on those object (may not
	// be immediately)

	// 3 wait methods
	// public final void wait(){ wait until it gets notified }
	// public final native void wait(long ms){wait for specified milliseconds}
	// public final void wait(long ms,int ns){wait for millisecond and nano
	// seconds}

	// public final native void notify()
	// public final native void notifyAll()

	// while running thread calls wait() it will go for waiting state
	// when it is notified or time outs it will go for another waiting state
	// when it will be waiting for lock
	// once it gets lock it will go for runnable state.
	public static void main(String[] args) {
		MyThread92 thread92 = new MyThread92();
		thread92.start();
		try {
			synchronized (thread92) {
				thread92.wait(1000);
			}
			System.out.println(thread92.total);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
