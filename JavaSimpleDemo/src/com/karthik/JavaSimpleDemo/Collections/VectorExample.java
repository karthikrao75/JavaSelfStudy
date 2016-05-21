package com.karthik.JavaSimpleDemo.Collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// underline data structure is resizable array
		// implements serializable, cloneable, randomAccess interface
		// takes duplicates and heterogeneous variables
		// initial capacity is 10 and will increase in capacity*10
		// all methods are synchronized hence are thread safe.

		Vector<Object> v = new Vector<Object>();
		// addelement is vector defined method
		v.addElement("karthik");
		// add is collection interface method
		v.add(1);
		v.addElement("karthik");

		System.out.println(v);
		// karthik,1,karthik

		// constructor with initial capacity
		Vector<Object> v1 = new Vector<>(15);

		// constructor with initial capacity and increment by
		Vector<Object> v2 = new Vector<>(10, 5);

		// constructor that takes collection object
		Vector<Object> v3 = new Vector<>(v);

		Object c = v.firstElement();
		System.out.println(c);
		// karthik

		Object c1 = v.lastElement();
		System.out.println(c1);
		// karthik

		int x = v.capacity();
		System.out.println(x);
		// 10

		v.removeElement("karthik");

		System.out.println(v);
		// 1,karthik
		// will remove first occurrence of karthik

		v.removeElementAt(1);
		System.out.println(v);
		// 1t
	}

}
