package com.karthik.JavSimpleDemo.CamparableAndComparator;

import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "karthik");
		Employee e2 = new Employee(2, "srikanth");
		Employee e3 = new Employee(3, "ram");
		Employee e4 = new Employee(4, "babishan");
		
		//implemented comparable interface in Employee class with default sorting 
		TreeSet<Employee> t1=new TreeSet<Employee>();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		
		System.out.println(t1);
		//[babishan, karthik, ram, srikanth]
			
		//add StringBuffer to treeset in reverse sorting order
		TreeSet<StringBuffer> t3=new TreeSet<StringBuffer>(new MyComparator2());
		t3.add(new StringBuffer("karthik"));
		t3.add(new StringBuffer("Srikanth"));
		t3.add(new StringBuffer("babishan"));
		t3.add(new StringBuffer("ram"));
		System.out.println(t3);
		//[ram, karthik, babishan, Srikanth]
	}

}
