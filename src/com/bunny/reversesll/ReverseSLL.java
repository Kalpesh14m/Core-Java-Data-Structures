package com.bunny.reversesll;

import com.bunny.algo.SingleLinkListOperations;
import com.bunny.utils.Node;

public class ReverseSLL {

	public static void main(String[] args) {
		SingleLinkListOperations list = new SingleLinkListOperations();

		for (int i = 0; i < 10; i++) {
			list.insertFirst(list, i);
		}
		list.printList(list);
		System.out.println("\n\n");
		list.printList(reverse(list));
	}

	public static SingleLinkListOperations reverse(SingleLinkListOperations list) {
		Node prev = null;
		Node current = list.getHead();
		Node next = null;
		if (current == null) {
			System.out.println("List is Empty!!!");
		} else {
			while (current != null) {
				next = current.getNext();
				current.setNext(prev);
				prev = current;
				current = next;
			}
			list.setHead(prev);
		}
		return list;
	}

}
