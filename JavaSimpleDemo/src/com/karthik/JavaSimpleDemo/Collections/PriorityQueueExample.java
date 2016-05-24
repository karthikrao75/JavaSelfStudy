package com.karthik.JavaSimpleDemo.Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	// queue
	// first in first out
	// before processing if you want to store anything then use queue
	// it is an interface implements collection

	// LinkedList also implements queue along with List from 1.5v

	// priority queue
	// based on priority
	// it may be default natural sorting or customized sorting --same rule as
	// other .
	// no duplicates
	// no null
	// default size is 11

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(1);
		q.add(25);
		q.add(49);
		q.add(123);
		q.add(345);
		q.add(3);
		System.out.println(q);
		// [1, 25, 3, 123, 345, 49]

		// constructor using initial capacity
		PriorityQueue<Integer> q1 = new PriorityQueue<>(10);
		q1.addAll(q);

		// constructor using initial capacity and comparator
		PriorityQueue<Integer> q2 = new PriorityQueue<>(11, new Mycompare());
		q2.addAll(q1);
		System.out.println(q2);
		// [345, 123, 49, 1, 25, 3]

		// collection object
		PriorityQueue<Integer> q3 = new PriorityQueue<>(q1);
		System.out.println(q3);
		// [1, 25, 3, 123, 345, 49]

		// queue specific methods
		q.offer(34); // add object to queue
		System.out.println(q);
		// [1, 25, 3, 123, 345, 49, 34]

		System.out.println(q.poll()); // remove head if empty returns null
		// 1
		System.out.println(q.remove());// removes head and returns object if not
										// present returns
										// NoSuchElementException
		// 3

		System.out.println(q.peek()); // return head if not returns null

		System.out.println(q.element()); // return head if not returns
											// nosuchElementException

		// priority methods
		System.out.println(q.add(55));// returns boolean
		System.out.println(q);
		// [25, 49, 34, 123, 345, 55]

		System.out.println(q.offer(22));
		// true

		System.out.println(q.contains(49));
		// true

		System.out.println(q.remove(49));// returns true if present if not
											// returns false

	}

}

class Mycompare implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}
