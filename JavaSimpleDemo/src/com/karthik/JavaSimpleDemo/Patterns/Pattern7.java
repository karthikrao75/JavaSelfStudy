package com.karthik.JavaSimpleDemo.Patterns;

public class Pattern7 {

	public static void main(String [] args){
		int val=65;
		for (int i=0;i<5;i++){
			
			for(int j=0;j<=i;j++){
				System.out.print((char)val+" ");
			}
			val++;
			System.out.println();
		}
	}
}
/*
A 
B B 
C C C 
D D D D 
E E E E E 

*/