package com.karthik.JavSimpleDemo.CamparableAndComparator;

import java.util.Comparator;

public class MyComparator1 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
			int l1=o1.getName().length();
			int l2=o2.getName().length();
			if(l1<l2){
				return -1;
			}
			if(l1>l2){
				return +1;
			}
			else{
			return	o1.toString().compareTo(o2.toString());
			}
				
	}

}
