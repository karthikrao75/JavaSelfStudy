package com.karthik.JavaSimpleDemo.dataStructure.linkedList1;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws IOException {

		DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
		doubleLinkedList.add(10);
		doubleLinkedList.add(20);
		doubleLinkedList.add(40);

		doubleLinkedList.add(30, 1);
		doubleLinkedList.show();

		System.out.println("after removing");
		doubleLinkedList.remove(1);
		doubleLinkedList.show();
	    
	}
	
}
