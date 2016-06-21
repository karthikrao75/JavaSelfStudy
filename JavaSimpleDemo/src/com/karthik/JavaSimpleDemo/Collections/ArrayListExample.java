package com.karthik.JavaSimpleDemo.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array lists are heterogeneous 
		//duplicates are allowed, null values are allowed,underline data structure 
		//is re-sizable array implements serializable,cloneable and random access Interface
		// initial capacity of array list is 10, then (capacity*3/2)+1
		
		//default constructor
		List<Object> al=new ArrayList<Object>();
		al.add(1);
		al.add("Karthik");
		al.add("srikanth");
		al.add("karthik");
		al.add(1);
		al.add(null);
		al.add(null);
		
		for (Object l : al) {
			System.out.println(l);
		}
		//constructor with initial capacity
		ArrayList<Object> al1=new ArrayList<>(20);
		al1.add("me");
		al1.add("mine");
		
		LinkedList<Object> l=new LinkedList<>();
		
		//constructor that takes collection
		ArrayList<Object> al2=new ArrayList<>(l);
		al2.add("u");
		al2.add("yours");
		
		//array list specific methods
		System.out.println("****************************************");
		
		//add object to particular index
		al.add(2, "babishan");
		
		//add collection object in a go
		al.addAll(al2);
		
		//add collection to particular index.
		al.addAll(3, al1);
		
		for (Object l1 : al) {
			System.out.println(l1);
		}
		//remove by index
		Object o=al.remove(2);
		System.out.println(o);
		//babishan
		
		//get object by index
		Object o1=al.get(4);
		System.out.println(o1);
		//srikanth
		
		//index of an object
		int i=al.indexOf("srikanth");
		System.out.println(i);
		//4
		
		int i1=al.lastIndexOf(1);
		System.out.println(i1);
		//6
		

		//set index with object
		al.set(6, 3);
		
		al.subList(3, 6);
	
	}

}
