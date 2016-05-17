package com.infy.JavaSimpleDemo.Collections;

import java.util.TreeSet;

public class TreeSetExample {

	//child class of abstract set
	//implements NavigableSet, serializable and cloneable.
	//internal data structure balanced tree 
	//no dublicates, insertion order not preserved.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> t=new TreeSet<Object>();
		t.add(101);
		t.add(104);
		t.add(109);
		t.add(123);
		t.add(134);
		
		System.out.println(t);
		//[101, 104, 109, 123, 134]
		
		//Sorted set specific methods.
		System.out.println(t.first());
		//101
		System.out.println(t.last());
		//134
		System.out.println(t.headSet(109));
		//[101, 104]	
		System.out.println(t.tailSet(109));
		//[109, 123, 134]
		System.out.println(t.subSet(104, 123));
		//[104, 109]
	}

}
