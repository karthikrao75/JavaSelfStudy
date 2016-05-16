package com.karthik.JavaSimpleDemo.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ListIterator is an Interface
		// ListIterator Object we can get by ListIterator method in List(I)
		// public ListIterator listIterator(){}
		// ListIterator is a child interface of Iterator hence it has all the 3
		// methods of Iterator

		// it can read /remove/replace(set new object)
		// move in both the direction

		// limitations
		// applicable only to list
		ArrayList<Object> a = new ArrayList<>();
		a.add(1);
		a.add("23");
		a.add("kar");

		ListIterator<Object> li = a.listIterator();
		while (li.hasNext()) {
			Object o = (Object) li.next();
			if (o == "kar") {
				li.set("sri");
			}
			li.nextIndex();// (1,2,3)
			System.out.println(o);
			// 1
			// 23
			// kar
		}
		while (li.hasPrevious()) {
			Object o = (Object) li.previous();
			li.previousIndex();// (1,0,-1)
			if (o == "23") {
				li.remove();
			} else {

				System.out.println(o);
				// sri
				// 1
			}

		}
	}

}
