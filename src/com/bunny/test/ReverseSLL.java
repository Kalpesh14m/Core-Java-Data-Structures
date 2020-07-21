package com.bunny.test;

import com.bunny.singlelinklist.LinkListOperations;
import com.bunny.utils.Node;

public class ReverseSLL {
	public static void main(String[] args) {
		LinkListOperations list = new LinkListOperations();

		for (int i = 0; i < 10; i++) {
			list.insertFirst(list, i);
		}
		list.printList(list);
		System.out.println("\n\n");
		list = reverse(list);
		list.printList(list);
	}

	public static LinkListOperations reverse(LinkListOperations list) {
		Node prev = null;
		Node current = list.head;
		Node next = null;
		if (current == null) {
			System.out.println("List is Empty!!!");
		} else {
			while (current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			list.head = prev;
		}
		return list;
	}

}
