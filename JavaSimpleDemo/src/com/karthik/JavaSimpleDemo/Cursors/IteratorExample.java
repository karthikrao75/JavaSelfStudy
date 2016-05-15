package com.karthik.JavaSimpleDemo.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	
	// Iterator is an interface
	//can get Iterator object by collection interface iterator method 
	//public Iterator iterator(){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> a=new ArrayList<>();
		a.add(1);
		a.add("23");
		a.add("kar");
		
		
		Iterator<Object> i=a.iterator();
		//instead of a it could be any other collection object
	while (i.hasNext()) {
		Object o = (Object) i.next();
		if(o=="kar"){
			i.remove();
		}
		else{
			System.out.println(o);
			//1
			//23
		}
	}
	System.out.println(a);
	//[1, 23]
		
	}

}
