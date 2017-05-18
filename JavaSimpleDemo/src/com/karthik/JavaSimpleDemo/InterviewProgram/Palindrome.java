package com.karthik.JavaSimpleDemo.InterviewProgram;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="RaaR";
		StringBuilder s2=new StringBuilder(s1);
		s2.reverse();
		if(s1.equals(s2.toString())){
			System.out.println("is Palindrome");
		}
		
	}

}
