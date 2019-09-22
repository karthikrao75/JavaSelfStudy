package com.karthik.JavaSimpleDemo.dataStructure;

public class Runner {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList=new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(13);
		
		linkedList.addFirst(5);
		
		linkedList.add(2, 25);
		
		linkedList.add(0, 23);
		
		linkedList.remvoe(2);
		
		linkedList.removeElement(5);
		
		linkedList.show();
		
		
		System.out.println("Size of the list is: "+linkedList.size());
	}
}
