package com.karthik.JavaSimpleDemo.InterviewProgram;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1={10,33,5 ,2,23,14,4};
		
		for(int i=0;i<a1.length-1;i++){
			for(int j=i;j>=0;j--){
				if(a1[j+1]<a1[j]){
					a1[j]=a1[j]+a1[j+1];
					a1[j+1]=a1[j]-a1[j+1];
					a1[j]=a1[j]-a1[j+1];
				}
				else
					break;
			}
			for (int ij : a1) {
				System.out.print(ij+" ");
			}
			System.out.println();
		}
	}

}
