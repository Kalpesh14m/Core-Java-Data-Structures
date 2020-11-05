package com.bunny.last25thelement;

import java.util.Random;

import com.bunny.algo.SingleLinkListOperations;

public class FindLast25ThElementInSLL {

	public static void main(String[] args) {
		SingleLinkListOperations list = new SingleLinkListOperations();

		Random rand = new Random();
		for (int i = 0; i < 150; i++) {
			list.insertFirst(list, rand.nextInt(10000));
		}

		list.printList(list);
		System.out.println("\n\n");
		System.out.println("last 10th Element is: " + list.pickNth(list, list.getSize() - 10));
		System.out.println("last 25th Element is: " + list.pickNthEle(list));
	}

}
