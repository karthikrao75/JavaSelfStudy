package com.karthik.JavaSimpleDemo.dataStructure;

public class LinkedList<T> {

	Node<T> head;

	public void add(T data) {
		Node<T> node = new Node<T>();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	public void addFirst(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public void add(int index, T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		Node<T> temp = head;
		if (index == 0) {
			addFirst(data);
		} else {
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}

	public void remvoe(int index) {

		if (index == 0) {
			head = head.next;
		} else {
			Node<T> temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			System.out.println("deleting : " + temp.next.data);
			temp.next = temp.next.next;

		}
	}

	public void removeElement(T data) {
		if (head.data.equals(data)) {
			head = head.next;
			return;
		}

		Node n = head;

		while (n.next != null) {
			if (n.next.data != null && data != null && n.next.data.equals(data)) {
				n.next = n.next.next;
				return;
			} else {
				n = n.next;
			}
		}
	}

	public int size() {

		Node n = head;
		int count = 0;
		if (head == null) {
			return 0;
		}
		while (n != null) {
			n = n.next;
			count++;
		}
		return count;

	}

	public void show() {
		Node<T> temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}
