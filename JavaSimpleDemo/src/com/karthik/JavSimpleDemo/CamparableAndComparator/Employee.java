package com.karthik.JavSimpleDemo.CamparableAndComparator;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.getName());
		// return - this.name.compareTo(o.getName()); -----reverse sorting order
		// return +1 ----insertion order is maintained
		// return -1 ----reverse of insertion order
		// return 0 -----only one element will be inserted
	}

	@Override
	public String toString() {
		return name;
	}

}
