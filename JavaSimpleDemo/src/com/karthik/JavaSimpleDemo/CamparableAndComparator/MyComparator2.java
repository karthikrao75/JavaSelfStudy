package com.karthik.JavaSimpleDemo.CamparableAndComparator;

import java.util.Comparator;

public class MyComparator2 implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		System.out.println(s1+"compare"+s2);
		System.out.println(s1.compareTo(s2));
		return - s1.compareTo(s2);
	}

}
