package com.karthik.JavaSimpleDemo.designPattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> empList = new ArrayList<String>();
	
	
	public Employees(List<String> empList) {
		super();
		this.empList = empList;
	}

	public List<String> getEmpList() {
		return empList;
	}




	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
