package com.karthik.JavaSimpleDemo.dataStructure.linkedList;

public class Runner {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(13);

		// linkedList.addFirst(5);
		/*
		 * linkedList.add(2, 25);
		 * 
		 * linkedList.add(0, 23);
		 * 
		 * linkedList.remvoe(2);
		 * 
		 * linkedList.removeElement(5);
		 * 
		 * linkedList.show();
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("Size of the list is: "+linkedList.size());
		 * 
		 * System.out.println("get impl: "+linkedList.get(0));
		 * System.out.println("Search element: "+linkedList.search(25));
		 * 
		 * System.out.println("get impl from last: "
		 * +linkedList.getNthFromLast(0));
		 */
		System.out.println(linkedList.findMiddleElement());
		System.out.println(linkedList.findMiddleElementLogic());

		LinkedList<String> stringLinkedList = new LinkedList<>();
		stringLinkedList.add("k");
		stringLinkedList.add("a");
		stringLinkedList.add("k");
		
		System.out.println(stringLinkedList.isAPalindrome());
		System.out.println(stringLinkedList.isAPalindromeLogic());
		stringLinkedList.removeDuplicates();
		stringLinkedList.show();
	}
}
