package com.karthik.JavaSimpleDemo.Try;

public class ClassCanHaveInterface {

	//by default static
	//private final not allowed
	public interface me {
		int VALUE=10;
		public String test();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try1 t = new try1();
		System.out.println(t.test());
	}

}

class try1 implements ClassCanHaveInterface.me {
	@Override
	public String test() {
		// TODO Auto-generated method stub
		return "Hi hello";
	}

}