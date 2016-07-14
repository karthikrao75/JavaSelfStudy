package com.karthik.JavaSimpleDemo.Try;

public class MemberInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myName myName=new myName();
		myName.name name=myName.new name();
		System.out.println(name.whatISYourName());
		
	}

}

class myName{
	private int value=10;
	
	private String getName(){
		return "karthik";
	}
	
	 class name{
		public String whatISYourName(){
			
			System.out.println(value);
			return "My Name Is "+getName();
		}
		
	}
}