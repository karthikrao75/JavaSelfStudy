package com.karthik.JavaSimpleDemo.Collections;

import java.util.Hashtable;

public class HashtableExample {

	// hashtable extends dictionary, implements map, cloneable,serializable
	// insertion order is not preserved, insertion is based on hash function
	// value
	// no duplicate keys, values can be
	// heterogeneous are allowed
	// no null for key and value
	// all methods are synchronized hence are thread safe
	// default initial capacity is 11, fill ratio is 0.75
	// if hashcode value exceeds the hashtable length then modules(%) by length is done and inserted.
	// fetching the hahshtable values are done from top to bottom and right to left.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Temp, String> h = new Hashtable<>();
		h.put(new Temp(1), "A");
		h.put(new Temp(25), "B");
		h.put(new Temp(30), "C");
		h.put(new Temp(10), "D");
		System.out.println(h);
		//{30=C, 10=D, 25=B, 1=A}---when hashcode returns i
		//{25=B, 30=C, 1=A, 10=D}---when hashcode returns i%9
		
		//constructor with initial capacity
		//here if hashcode exceeds 4 then, modules of 5 is done. 
		Hashtable<Temp1, String> h1 = new Hashtable<>(5);
		h1.put(new Temp1(1), "A");
		h1.put(new Temp1(25), "B");
		h1.put(new Temp1(30), "C");
		h1.put(new Temp1(10), "D");
		System.out.println(h1);
		//{25=B, 10=D, 1=A, 30=C}
		
		//constructor using initial capacity and fill ratio.
		Hashtable<Temp1, String> h2 = new Hashtable<>(5,0.4f);
		h2.put(new Temp1(1), "A");
		h2.put(new Temp1(25), "B");
		h2.put(new Temp1(30), "C");
		h2.put(new Temp1(10), "D");
		System.out.println(h2);
		//{30=C, 1=A, 10=D, 25=B}
		//{25=B, 10=D, 1=A, 30=C}
		
		//constructor using Map
		Hashtable<Temp1, String> h3 = new Hashtable<>(h2);
		System.out.println(h3);
	}

}

class Temp {
	int i;

	Temp(int i) {
		this.i = i;
	}

	public int hashcode() {
		return i%9;
	}

	@Override
	public String toString() {
		return i+"";
	}

}

class Temp1 {
	int i;

	Temp1(int i) {
		this.i = i;
	}

	public int hashcode() {
		return i;
	}

	@Override
	public String toString() {
		return i+"";
	}

}
