package com.karthik.JavaSimpleDemo.Try;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		my m=new my("karthik");
		
		System.out.println(m.getName());

	}

}

final class my {
 private final String name;
 
  my(String name){
	 this.name=name;
 }
  
  public String getName(){
	  return this.name;
  }
            
}