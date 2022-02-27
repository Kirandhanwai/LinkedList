package com.blz.java;

import java.util.Scanner;

public class LinkedList {
	Node head;
	Scanner scanner = new Scanner(System.in);

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

	public void popLast() {

		if (head == null)
			System.out.println("No elements to delete");
		else if (head.ref == null)
			head = null;
		else {
			Node temp = head;

			while (temp.ref.ref != null) {
				temp = temp.ref;
			}
			temp.ref = null;
		}
	}

	public void search(Object data) {

		boolean isFound = false;

		if (head == null)
			System.out.println("No elements to search");

		else if (head.data == data)
			isFound = true;

		else {

			Node temp = head;
			while (temp != null) {

				if (temp.data == data) {
					isFound = true;
					break;
				}

				temp = temp.ref;
			}
		}

		if (isFound)
			System.out.println("Data found ");
		else
			System.out.println(data + " not found");
	}

	public void insertNode(Object data) {
		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			System.out.println("Enter the data after which new data should be added");
			Object data1 = scanner.nextInt();
			while (temp.data != data1) {
				temp = temp.ref;
			}
			newNode.ref = temp.ref;
			temp.ref = newNode;
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
