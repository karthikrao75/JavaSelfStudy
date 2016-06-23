package com.karthik.JavaSimpleDemo.MultiThreading;

public class MultiThreadingExample91 {

	// synchronized
	// it helps us in solving data inconsistency and allows only one thread at a
	// time.

	// synchronized keyword can be applied to methods and blocks.

	// every object in java has its unique lock, synchronized uses this lock
	// internally.

	// when method or block completes automatically lock will be released, this
	// will be taken care by JVM.
	// synchronized is usually used on CRUD operation( means add/update/read on
	// dynamic data/delete )
	// when state of the object.

	// usually for static content synchronized is not used. like read operation

	// multiple thread on same object then synchronized is required
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Show show = new Show();
		
			//Show show1=new  Show();
		MyThread7 thread7 = new MyThread7(show, "karthik");
		thread7.start();

		MyThread7 thread72 = new MyThread7(show, "srikanth");
		thread72.start();
	}

}

//output with synchronized and same show object 
			/*Good Morning karthik
			Good Morning karthik
			Good Morning karthik
			Good Morning srikanth
			Good Morning srikanth
			Good Morning srikanth
			Good Morning srikanth*/

//output with synchronized and different show objects for both the threads  
			/*Good Morning srikanth
			Good Morning karthik
			Good Morning srikanth
			Good Morning karthik
			Good Morning karthik
			Good Morning srikanth
			Good Morning srikanth*/ // -i.e random output


//output without synchronized and for same objects on both the threads.
			/*Good Morning karthik
			Good Morning srikanth
			Good Morning karthik
			Good Morning karthik
			Good Morning karthik
			Good Morning srikanth
			Good Morning srikanth
			Good Morning srikanth*/