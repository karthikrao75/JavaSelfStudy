package com.karthik.JavaSimpleDemo.Try;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person(){
/*			public void eat(){
			System.out.println("north meal");	
			}*/
			
			//if eat method is written then output is : north meal
			//if eat method not there then will give : south meal
			
			
		
			
		};
		
		p.eat();
		WelcomeAll all=new WelcomeAll();
		all.displayMessage(new welcome() {		
			@Override
			public void greet() {
			System.out.println("hi all");
				
			}
		});
	}

}

class person{
	public void eat(){
		System.out.println("south meal");
	}
}

interface welcome{
	public abstract void greet();
}

class WelcomeAll {

	public void displayMessage(welcome w) {
		// TODO Auto-generated method stub
		w.greet();
		
	}
	
}