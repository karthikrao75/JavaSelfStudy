package com.karthik.JavaSimpleDemo.Cursors;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {
		
		//enumeration is an interface
		//enumerations(cursors) are used to retrieve objects one by one 
		
		Vector<Object> v=new Vector<Object>();
		v.add("ka");
		v.add("ke");
		v.add(1);
		Enumeration<Object> e=v.elements();
		
		while(e.hasMoreElements()){
			Object o=e.nextElement();
			System.out.println(o);
		}
		
/*		Enumeration< Object > enumeration=Collections.enumeration(a);
		while(enumeration.hasMoreElements()){
			Object s=enumeration.nextElement();
			System.out.println(s);
		}*/
		
		// limitations
		// enumerations can be applied only on legacy classes 
		// dosen't have any method to remove the object
	}

}
