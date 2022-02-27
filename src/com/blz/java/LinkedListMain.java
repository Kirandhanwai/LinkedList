package com.blz.java;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Insert node in between");
		list.addLast(56);
		// list.addLast(30);
		list.addLast(70);
		list.display();
		list.insertNode(30);
		list.display();

	}
}

	
