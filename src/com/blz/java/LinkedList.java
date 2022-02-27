package com.blz.java;

public class LinkedList {
	Node head;

	public class Node {
		Object data;
		Node ref;

		public Node(Object data) {
			this.data = data;
		}
	}

	public void addFirst(Object data) {

		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			newNode.ref = head;
			head = newNode;
		}
	}

	public void display() {
		if (head == null)
			System.out.println("No elements to display.");
		else {
			Node temp = head;
			while (temp != null) {
				if (temp.ref != null)
					System.out.print(temp.data + " -> ");
				else
					System.out.println(temp.data);
				temp = temp.ref;
			}

		}
	}
}
