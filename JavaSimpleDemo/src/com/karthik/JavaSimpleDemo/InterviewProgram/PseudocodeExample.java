package com.karthik.JavaSimpleDemo.InterviewProgram;

import java.util.Arrays;

public class PseudocodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accept double value store it in 2 variable and display the same.
		
		// input num;
		// num <- 4.8
		// number<-num%10;
		// fraction<-num-number
		// output fraction number 

		double num;
		num=4.8;
		int number=(int)num%10;
		double fraction=num-number;
		System.out.println(fraction);
		System.out.println(number);
		
		// largest and second largest of 3 numbers
		
		
		// input 
		
		//given N, sum of all the odd number accept N.
		
		int n=100;
		int sum=0;
		for(int i=0;i<n;i++){
			if((i%2)!=0){
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
		
		//reverse a number
		
		int reverseNumber=12345;
	 StringBuilder builder=new StringBuilder(reverseNumber+"");
	 int reverse=Integer.parseInt(builder.reverse().toString());
	 System.out.println(reverse);
	 
	 //display number in words
	 
	 String displayNum=4334521+"";
	 String word="";
	 for(char ch:displayNum.toCharArray()){
		 switch (ch) {
			case '1':
				word=word+"One"+" ";
				break;
			case '2':
				word=word+"Two"+" ";
				break;
			case '3':
				word=word+"Three"+" ";
				break;
			case '4':
				word=word+"Four"+" ";
				break;
			case '5':
				word=word+"Five"+" ";
				break;
			case '6':
				word=word+"Six"+" ";
				break;
			case '7':
				word=word+"Seven"+" ";
				break;
			case '8':
				word=word+"Eight"+" ";
				break;
			case '9':
				word=word+"Nine"+" ";
				break;
			case '0':
				word=word+"Zero"+" ";
				break;
			default:
				break;
			}

	 }
	 	 System.out.println(word);
		
	 	 
	 	 //number series 
	 	 int ng=20;
	 	 for(int i=2;i<=ng;i=i+2){
	 		 System.out.print(i*i+",");
	 	 }
	 	 System.out.println();
	 	 int na=20;
	 	 for(int i=3;i<=na;i++){
	 		 if ((i%2)==0){
	 			 
	 			 System.out.print(i-1+",");
	 		 }
	 		 else 
	 		 System.out.print(1-i+",");
	 	 }
	 	System.out.println();
	 	 int np=20;
	 	 for(int i=1;i<=np;i++){
	 		 System.out.print((int)Math.pow(i, i)+",");
	 	 }
	}


	
}
