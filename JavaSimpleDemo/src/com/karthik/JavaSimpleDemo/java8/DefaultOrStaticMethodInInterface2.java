package com.karthik.JavaSimpleDemo.java8;

public class DefaultOrStaticMethodInInterface2 implements Printer {

	public static void main(String[] args) {
		Printer printer = new DefaultOrStaticMethodInInterface2();
		printer.defaultPrint();
		Printer.print("My name is karthik");
	}
}

interface Printer {

	// trying to override Object method gives compile time error as
	// "A default method cannot override a method from java.lang.Object"

	// default String toString(){
	// return "i1";
	// }
	/*
	 * if Object class are allowed to implement then when a class implements
	 * that interface it would have already have object as super class and
	 * methods will be duplicate.
	 * 
	 */
	static void print(String t) {
		System.out.println(t);
	}

	default void defaultPrint() {
		System.out.println("*********************************88");
	}
}