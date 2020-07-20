package com.bunny.utils;

public class Utility {
	private static int[] arr;

	public static int[] display(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
		return arr;
	}

	public static int[] getArrayElements(int limit) {
		System.out.println("Enter " + limit + " Elements: ");
		arr = new int[limit];
		for (int i = 0; i < limit; i++) {
			arr[i] = InputUtility.intVal();
		}
		return arr;
	}
}
