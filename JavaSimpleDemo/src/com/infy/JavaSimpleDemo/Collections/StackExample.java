package com.infy.JavaSimpleDemo.Collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//stack is a child class of vector
		//last in first out
		
		Stack<Object> s=new Stack<Object>();
		s.push("karthik");
		s.push(1);
		s.push(1);
		s.push("karthik");
		System.out.println(s);
		//[karthik, 1, 1, karthik]
		s.pop();
		
		System.out.println(s);
		//[karthik, 1, 1]
		//last element is gone
		
		Object c=s.peek();
		System.out.println(c);
		//1
		//will give last element i.e at top of the stack.
		
		System.out.println(s.empty());
		//false
		
		System.out.println(s.search(1));
		//1
		
		//will internal check for lastIndexOf(Object)
		//if present then return 1 if not -1
	}

}
