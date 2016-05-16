package com.infy.JavaSimpleDemo.Collections;

import java.util.LinkedHashSet;

public class LinkedHashsetExample {

	// it is the child class of hashset
	// same including constructors and methods 
	//but
	// underline data structure is linkedlist+hashtable
	//1.4v
	//insertion order is maintained 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> h=new LinkedHashSet<>();
		h.add(null);
		h.add(true);
		h.add(1);
		h.add("karthik");
		System.out.println(h);
		//[null, true, 1, karthik]
	}

}
