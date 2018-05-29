package com.karthik.JavaSimpleDemo.java8;

public class DefaultOrStaticMethodInInterface1 implements Modern, old {
	// if method is not overriden then
	/*
	 * Duplicate default methods named print with the parameters (String) and
	 * (String) are inherited from the types old and Modern
	 */
	@Override
	public void print(String value) {
		// TODO Auto-generated method stub
		Modern.super.print(value);
	}

}

interface Modern {
	default void print(String value) {
		System.out.println("Old printer");
	}
}

interface old {
	default void print(String value) {
		System.out.println("Old printer");
	}
}