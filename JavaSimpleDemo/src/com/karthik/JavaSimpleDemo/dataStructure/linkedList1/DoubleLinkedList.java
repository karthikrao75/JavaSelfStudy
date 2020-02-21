package com.karthik.JavaSimpleDemo.dataStructure.linkedList1;

public class DoubleLinkedList<T> {

	Node head;

	public void add(T data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			n.prev = temp;
			temp.next = n;
		}
	}

	public void addFirst(T data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head.prev = n;
		}

	}

	public void add(T data, int index) {

		if (index == 0) {
			addFirst(data);
		} else if (index > 0 && index < size()) {
			Node temp = head;
			Node n = new Node();
			n.data = data;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			n.next = temp.next;
			n.prev = temp;
			temp.next = n;

		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public void remove(int index) {
		if (index == 0) {
			head = head.next;
			head.prev = null;
		} else if (index > 0 && index < size()) {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n.next = n.next.next;
			if (n.next.next != null && n.next.next.prev != null) {
				n.next.next.prev = n;
			}
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public int size() {
		int count = 0;
		Node n = head;
		while (n != null) {
			count++;
			n = n.next;
		}
		return count;
	}

	public void show() {
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}
