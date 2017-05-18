package com.karthik.JavaSimpleDemo.Patterns;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1;
		int n=5;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num+++" ");
			}
			System.out.println();
		}
		
	}

}
