package com.karthik.JavaSimpleDemo.InterviewProgram;

/*
Time Complexity:
The time complexity of Binary Search can be written as
T(n) = T(n/2) + c 
The above recurrence can be solved either using Recurrence T ree method or Master method. It falls in case II of Master Method and solution of the recurrence is \Theta(Logn).
Auxiliary Space: O(1) in case of iterative implementation. In case of recursive implementation, O(Logn) recursion call stack space.
Algorithmic Paradigm: Divide and Conquer */
public class BinarySearch {
	public void recursiveSearch(int l, int r, int[] arr, int x) {
		int m = l + (r - l) / 2;
		if (arr[m] == x) {
			System.out.println(x + " in rec index =" + m);
		} else if (arr[m] < x) {
			this.recursiveSearch(m + 1, r, arr, x);
		} else
			this.recursiveSearch(l, m - 1, arr, x);

	}

	public void search(int[] arr, int x) {

		int l = 0;
		int r = arr.length - 1;

		while (r > 1) {
			int m = l + (r - l) / 2;
			if (arr[m] == x) {
				System.out.println(x + " in index =" + m);
				break;
			} else if (arr[m] < x) {
				l = m + 1;
			} else
				r = m - 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		BinarySearch search = new BinarySearch();
		search.search(arr, 5);

		int l = 0, r = arr.length - 1;

		search.recursiveSearch(l, r, arr, 6);

	}

}
