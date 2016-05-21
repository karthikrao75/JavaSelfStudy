package com.karthik.JavaSimpleDemo.Collections;

import java.util.HashSet;

public class HashSetExample {

	
	//hashSet implements set interface 
	//underline data structure is hashtable
	//duplicates are not allowed, no insertion order is maintained.
	//insertion order is based on hashcode
	//null is allowed only once, heterogeneous objects are allowed 
	//best suited for searching operation
	//implements serializable and cloneable interface 
	// initial capacity is hashtable is 16
	// default fill ratio (load factor) is 0.75
	// i.e it will provide with new space only after 75% of current space is occupied 
	
	//note: add() method return type is boolean when the return type is false, data is not inserted 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Object> h=new HashSet<Object>();
		h.add(3);
		h.add("k");
		h.add(1);
		h.add(true);
		h.add(3);
		h.add(null);
		h.add(null);
		
		System.out.println(h);
		//[null, 1, 3, true, k]
		
		//with initial capacity
		HashSet<Object> h1=new HashSet<>(10);
		h1.addAll(h);
		
		// with intial capacity and fill factor
		HashSet<Object> h2=new HashSet<>(10, 0.94f);
		h2.addAll(h1);
		
		HashSet<Object> h3=new HashSet<>(h2);
		h3.addAll(h);
		System.out.println(h3);
		//[null, 1, 3, true, k]
	}

}
