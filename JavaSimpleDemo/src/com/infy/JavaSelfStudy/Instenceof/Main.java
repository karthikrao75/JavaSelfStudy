package com.infy.JavaSelfStudy.Instenceof;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b1=new B();
		//A b1=new C();
		if(b1 instanceof B){
			b1.a=5;
			((B) b1).b=7;
		}
		if(b1 instanceof C){
			b1.a=8;
			((C) b1).c=8;
		}
		//based on the object type it will go into any one of the if loop

	}

}
