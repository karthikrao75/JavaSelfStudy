package com.karthik.JavaSimpleDemo.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysExample {

	// Arrays is an utility class for array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 101, 102, 104, 105, 108, 109, 106, 107, 103 };
		String[] a1 = { "karthik", "kar", "karthik r rao", "karthik rao" };

		// sorting methods
		Arrays.sort(a); // void method //any primitive type and object can be
						// sorted.
		for (int i : a) {
			System.out.print(i + " ");
		}
		// 101 102 103 104 105 106 107 108 109

		// sorting along with comparator
		Arrays.sort(a1, new ArrayComp());
		for (String i : a1) {
			System.out.print(i + " ");
		}
		// karthik rao karthik r rao karthik kar

		List<int[]> i = Arrays.asList(a);
		// this new list internally behaves as array itself
		// i.e size cannot be varied
		// has to be heterogeneous
		// System.out.println(i.add(new int[32]));
		// Exception in thread "main" java.lang.UnsupportedOperationException
		System.out.println();

		//primitive 
		int s = Arrays.binarySearch(a, 103);
		System.out.println(s);
		// 2 --will return index

		System.out.println(Arrays.binarySearch(a, 3));
		// -1 ---since not present

		//object
		System.out.println(Arrays.binarySearch(a1, "karthik"));
		//-1 //this is applicable only for default natural sorting 
		//since we have done customized sorting before it wont work here. 
		
		System.out.println(Arrays.binarySearch(a1, "karthik",new ArrayComp()));
		//2
		
		int[] i1=Arrays.copyOf(a, 3);
		for (int ij : i1) {
			System.out.print(ij + " ");
		}
		// 101 102 103
		System.out.println();
		
		int[] i2=Arrays.copyOf(a, 12);
		for (int ij : i2) {
			System.out.print(ij + " ");
		}
		//101 102 103 104 105 106 107 108 109 0 0 0 
		System.out.println();
		
		int[] i3=Arrays.copyOfRange(a, 3, 7);
		for (int ij : i3) {
			System.out.print(ij + " ");
		}
		//104 105 106 107 
		System.out.println();
		int [] a2=a;
		
		System.out.println(Arrays.equals(a, a2));
		//true
		
		Arrays.fill(a1, "kg");
		for (String ij : a1) {
			System.out.print(ij + " ");
		}
		//kg kg kg kg
		
		System.out.println(Arrays.toString(a));
		//[101, 102, 103, 104, 105, 106, 107, 108, 109]--array in readable format
	}

}

class ArrayComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

}
