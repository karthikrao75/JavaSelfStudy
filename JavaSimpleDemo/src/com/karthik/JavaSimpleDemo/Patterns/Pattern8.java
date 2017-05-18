package com.karthik.JavaSimpleDemo.Patterns;

public class Pattern8 {

	public static void main(String []args){
		
		for(int i=0;i<5;i++){
			int a=i+1;
			for (int k=5-i-1;k>0;k--){
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++){
				if(j<i-1){
					a--;
				}
				else 
					a++;
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
	
	
}
