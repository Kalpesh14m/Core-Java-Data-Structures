package com.bunny.singlelinklist;

import com.bunny.utils.InputUtility;

public class SingleLinkListDemo {
	static int data, pos;

	public static void main(String[] args) {
		LinkListOperations list = new LinkListOperations();
		int choice = 0;
		do {
			System.out.println("\n*********Link List Operations*********");
			System.out.println("1.Add First\n2.Add Last\n3.Add Nth Location");
			System.out.println("4.Delete First\n5.Delete Last\n6.Delete Nth Location");
			System.out.println("7.Display List\n8.EXIT");

			choice = InputUtility.intVal();

			switch (choice) {
			case 1:
				System.out.println("Enter Data to insert: ");
				data = InputUtility.intVal();
				list = list.insertLast(list, data);
				break;
			case 2:
				System.out.println("Enter Data to insert: ");
				data = InputUtility.intVal();
				list = list.insertFirst(list, data);
				break;
			case 3:
				System.out.println("Enter Data to insert: ");
				data = InputUtility.intVal();
				System.out.println("Enter Position: ");
				pos = InputUtility.intVal();
				list = list.insertNth(list, data, pos);
				break;
			case 4:
				list = list.deleteFirst(list);
				break;
			case 5:
				list = list.deleteLast(list);
				break;
			case 6:
				System.out.println("Enter Position: ");
				pos = InputUtility.intVal();
				list = list.deleteNth(list, pos);
				break;
			case 7:
				list.printList(list);
				break;
			case 8:
				System.out.println("Bye...!!");
				break;
			default:
				System.out.println("Enter Valid Choice!!!");
				break;
			}
		} while (choice != 8);
	}
}