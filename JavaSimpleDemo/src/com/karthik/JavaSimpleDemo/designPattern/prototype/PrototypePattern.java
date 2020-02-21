package com.karthik.JavaSimpleDemo.designPattern.prototype;

import java.util.ArrayList;

public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> emp = new ArrayList<>();
		emp.add("karthik");
		emp.add("Srikanth");
		
		Employees e=new Employees(emp);
		
		Employees eClone =(Employees) e.clone();
		
		System.out.println(eClone.getEmpList());
	}
}
