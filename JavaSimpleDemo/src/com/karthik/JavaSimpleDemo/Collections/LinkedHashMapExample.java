package com.karthik.JavaSimpleDemo.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

//child class of HashMap, insetion order is maintained 
//under line data structure is LinkedList + hashtable
//from 1.4v
//mainly used for cache based applications

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> m = new LinkedHashMap<>();
		m.put(1, "karthik");
		m.put(2, "srikanth");
		m.put(3, "jai");
		m.put(4, "amnu");

		System.out.println(m);
		// {1=karthik, 2=srikanth, 3=jai, 4=amnu}

		// constructor with default initial capacity
		LinkedHashMap<Integer, String> m1 = new LinkedHashMap<>(10);
		m1.put(1, "karthik");
		
		// constructor with initial capacity and fill ratio
		LinkedHashMap<Integer, String> m2 = new LinkedHashMap<>(10, 0.90f);
		m2.putAll(m);

		// constructor that takes map
		LinkedHashMap<Integer, String> m3 = new LinkedHashMap<>(m1);
		m3.put(null, null);
		m3.put(2, null);
		System.out.println(m3);
		//{1=karthik, null=null, 2=null}
		
		Object s=m3.put(null, "me");
		System.out.println(s);
		//null i.e replaced value
		
		System.out.println(m3);
		//{1=karthik, null=me, 2=null}
		
	}

}
