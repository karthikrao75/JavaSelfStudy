package com.karthik.JavaSimpleDemo.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ls=new LinkedList<>();
		ls.add("karthik");
		ls.add("srikanth");
		ls.add("babi");	
		ls.addFirst("gg");
		ls.addLast("sl");
		
		System.out.println(ls.getFirst());
		//gg
		System.out.println(ls.getLast());
		//sl
		System.out.println(ls.lastIndexOf("gg"));
		//0
		System.out.println(ls.peek());
		//gg
		System.out.println(ls.peekFirst());
		//gg
		System.out.println(ls.peekLast());
		//s1
		//poll will remove the top element
		//it returns null if the list is empty
		System.out.println(ls.poll());
		//gg
		//will remove the first element 
		System.out.println(ls.pollFirst());
		//will remove the last element
		System.out.println(ls.pollLast());
		//will remove the top element element
		//throw NoSuchElementException if no element is present in the list.
		System.out.println(ls.pop());
		
		//adds element into the list
		ls.push("gMan");
		
		System.out.println(ls.removeFirstOccurrence("babi"));
		//true
		System.out.println(ls.removeLastOccurrence("f"));
		//false
		
		//add to perticular index
		ls.add(0, "asas");
		
		ls.set(1, "sf");
		
		ls.subList(1, 1);
		
		//ls.removeLast();
		
		//ls.removeFirst();
		
		Iterator<String> l=ls.iterator();
		while(l.hasNext()){
			System.out.println(l.next());
		}
		for (String string : ls) {
			System.out.print(string+" ");
		}
		
		
	}

}
