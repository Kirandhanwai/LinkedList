package com.blz.java;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Delete last node");
		list.addLast(56);
		list.addLast(30);
		list.addLast(70);
		list.display();
		list.popLast();
		list.display();

	}
}

	
