package com.infy.JavaSimpleDemo.Collections;

import java.util.TreeSet;

public class TreeSetExample {

	//child class of abstract set
	//implements NavigableSet, serializable and cloneable.
	//internal data structure balanced tree 
	//no dublicates, insertion order not preserved.
	//heterogeneous //null only once and as only data in treeset in java 1.6 
	
	//if we try to add heterogeneous will give class cast exception
	//try to add null-null pointer exception  
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
		
		//constructor that takes object of class that has implemented comparator interface
		//TreeSet<Object> t1=new TreeSet<>(comparator);
		
		//constract takes collection object
		TreeSet<Object> t2=new TreeSet<>(t);
	}

}
