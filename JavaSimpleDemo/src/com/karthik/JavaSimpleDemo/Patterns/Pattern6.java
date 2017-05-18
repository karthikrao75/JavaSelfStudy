package com.karthik.JavaSimpleDemo.Patterns;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
				int r=0;
		for(int i=0;i<n;i++){
			r=i;
			for(int j=0;j<n-i;j++){
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++){
				System.out.print(r+" ");
				r=r-1;
			}
			for(int k=1;k<=i;k++){
				System.out.print(-r--+" ");
			}
			System.out.println();
		}
	}

}
