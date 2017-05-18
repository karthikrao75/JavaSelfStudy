package com.karthik.JavaSimpleDemo.InterviewProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {

	public void search(int [] sortedArray,int element,int min,int max){
		int mid=min+(max-min)/2;
		if(sortedArray[mid]==element){
			System.out.println(element +" at index "+mid);
		}
		else if(element>sortedArray[mid]){
		this.search(sortedArray, element,mid+1,max);	
		}
		else 
			this.search(sortedArray, element,min,mid-1);
	}
	public static void main(String []args){
		System.out.println("sorted array length \n");
		Scanner scanner=new Scanner(System.in);
		int i=0;
		int length=Integer.parseInt(scanner.nextLine());
		int number[]=new int[length];
		System.out.println("Enter the array element \n");
		while(i<length){
			number[i]=Integer.parseInt(scanner.nextLine());
			i++;
		}
		System.out.println("element to be searched \n");
		int elementSearch=Integer.parseInt(scanner.nextLine());
		scanner.close();
		Binary binary=new Binary();
		int min=0;
		int max=number.length-1;
		Arrays.sort(number);
		binary.search(number,elementSearch,min,max);
	}
}
