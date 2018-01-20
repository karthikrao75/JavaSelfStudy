package com.karthik.JavaSimpleDemo.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 		we can create a thread pool as follow
		
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		
		we can submit runnable job using submit method
		executorService.submit(Runnable task);
		
		stop 
		executorService.shutdown();
		
		In the case of runnable class thread wont written anything.
		but if the thread is required to return anything after complition we need to use callable
		it has one method
		public Object call() throws Exception 
		
		if callable is submitted to executor then it returns Future
		Future object can be used to get result from callable job.
 */
public class MultiThreadingExample96 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		PrintJob[] jobs = { new PrintJob("karthik"), new PrintJob("Srikanth"), new PrintJob("Babishan"),
				new PrintJob("Jay"), new PrintJob("Shakith") };
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (PrintJob printJob : jobs) {
			executorService.submit(printJob);
		}
		executorService.shutdown();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MyCallable[] callables = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), new MyCallable(60), new MyCallable(70), new MyCallable(80) };
		

		ExecutorService executorService1 = Executors.newFixedThreadPool(3);
		for (MyCallable myCallable : callables) {
			Future<Integer> future=executorService1.submit(myCallable);
			System.out.println(future.get());
		}
		executorService1.shutdown();
	}

	
	
}

class PrintJob implements Runnable {
	private String name;

	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + "....pring job started by thread" + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "....pring job completed by thread" + Thread.currentThread().getName());
	}

}

class MyCallable implements Callable<Integer> {

	int num;

	public MyCallable(int num) {
		super();
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(
				Thread.currentThread().getName() + " thread is responsible to find sum of first " + num + " number");
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

}