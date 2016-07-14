package com.karthik.JavaSimpleDemo.Try;

public class InterfaceCanHaveClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		we w = new we();
		System.out.println(w.test());
	}

}

interface Try {

	// static by default
	// abstract is allowed
	// final is also allowed, strictfp
	public String test();

	class me {
		public String test() {
			return "Hi Hello";
		}
	}
}

class we extends Try.me implements Try {
	public String test() {
		String s = super.test();
		return s;
	}
}