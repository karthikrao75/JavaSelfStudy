package com.karthik.JavaSimpleDemo.Try;

public class LocalInnerClass {
	// local inner class is a class inside a method.
	// local inner class cannot be accessed outside method
	// till JDK 1.7 local inner class can access only final local variable
	// but from 1.8 can access non-final local variable also.

	public void greet() {
		int greetnumber = 10;
		final int num = 10;
		class greeting {
			public void g() {
				// System.out.println("Hi user :"+greetnumber); --compile error
				// for jdk 1.7
				System.out.println("Hi user :" + num);
			}
		}
		greeting greeting = new greeting();
		greeting.g();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// greeting g=new greeting(); --cant access here

		LocalInnerClass class1 = new LocalInnerClass();
		class1.greet();
		// output : Hi user :10
	}

}
