package com.karthik.JavaSimpleDemo.CamparableAndComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "karthik");
		Employee e2 = new Employee(2, "srikanth");
		Employee e3 = new Employee(3, "ram");
		Employee e4 = new Employee(4, "babishan");

		// implemented comparable interface in Employee class with default
		// sorting
		TreeSet<Employee> t1 = new TreeSet<Employee>();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);

		System.out.println(t1);
		// [babishan, karthik, ram, srikanth]

		// add StringBuffer to treeset in reverse sorting order
		TreeSet<StringBuffer> t3 = new TreeSet<StringBuffer>(new MyComparator2());
		t3.add(new StringBuffer("karthik"));
		t3.add(new StringBuffer("srikanth"));
		t3.add(new StringBuffer("babishan"));
		t3.add(new StringBuffer("ram"));
		System.out.println(t3);
		// [srikanth, ram, karthik, babishan]

		Comparator<Employee> comparator = Comparator.comparing(Employee::getId);
		// to reverse order
		// Comparator<Employee> comparator = Comparator.comparing(Employee::getId).reversed();
		TreeSet<Employee> t4 = new TreeSet<Employee>(comparator);
		t4.add(e1);
		t4.add(e2);
		t4.add(e3);
		t4.add(e4);
		System.out.println(t4);
		// [karthik, srikanth, ram, babishan]

		Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName, (s1, s2) -> {
			return s2.compareTo(s1);
		});
		TreeSet<Employee> t5 = new TreeSet<Employee>(employeeNameComparator);
		t5.add(e1);
		t5.add(e2);
		t5.add(e3);
		t5.add(e4);
		System.out.println(t5);
		// [srikanth, ram, karthik, babishan]
		
		 Comparator<Employee> comparator1= Comparator.nullsFirst(Comparator.comparing(Employee::getId));
		TreeSet<Employee> t6 = new TreeSet<Employee>(comparator1);

		t6.add(e1);
		t6.add(e2);
		t6.add(e3);
		t6.add(e4);
		t6.add(null);
		t6.add(null);
		
		System.out.println(t6);
		// [null, karthik, srikanth, ram, babishan]
		
		// Comparator<Employee> comparator1= Comparator.nullsLast(Comparator.comparing(Employee::getId));
		// [karthik, srikanth, ram, babishan, null]	
	}

}
