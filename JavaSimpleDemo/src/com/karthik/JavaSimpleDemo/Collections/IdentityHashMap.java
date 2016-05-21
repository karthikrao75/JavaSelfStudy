package com.karthik.JavaSimpleDemo.Collections;

import java.util.HashMap;


public class IdentityHashMap {

	// every thing is same as HashMap but it is not generic
	//In HashMap - JVM uses .equals() method to identify duplicate key
	//In IdentityHashMap - JVM uses '==' method to check duplicate 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> m = new HashMap<>();
		m.put("Employee", "karthik");
		m.put(new String("Employee"), "kark");

		System.out.println(m);
		//{Employee=kark}
		//HashMap will consider m.put(new String("Employee"), "kark") as duplicate
		
		java.util.IdentityHashMap<String, String> m1 = new java.util.IdentityHashMap<String,String>();
		m1.put("Employee", "karthik");
		m1.put(new String("Employee"), "kark");
		
		System.out.println(m1);
		//{Employee=kark, Employee=karthik}
	}

}
