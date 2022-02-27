package com.blz.java;

import java.util.Scanner;

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

	public void addLast(Object data) {
		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else if (head.ref == null)
			head.ref = newNode;
		else {
			Node temp = head;

			while (temp.ref != null) {
				temp = temp.ref;
			}
			temp.ref = newNode;
		}
	}

	public void pop() {
		if (head == null)
			System.out.println("Nothing to delete..");
		else {
			head = head.ref;
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
