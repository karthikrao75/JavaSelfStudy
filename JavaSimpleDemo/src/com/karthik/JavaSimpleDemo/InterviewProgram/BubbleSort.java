package com.karthik.JavaSimpleDemo.InterviewProgram;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1={10,33,5 ,2,23,14,4};
		
		for(int i=a1.length;i>=0;i--){
			for(int j=0;j<i-1;j++){
				if(a1[j]>a1[j+1]){
					a1[j]=a1[j]+a1[j+1];
					a1[j+1]=a1[j]-a1[j+1];
					a1[j]=a1[j]-a1[j+1];
				}
			}
			for (int ij : a1) {
				System.out.print(ij+" ");
			}
			System.out.println();
		}
	}

}
