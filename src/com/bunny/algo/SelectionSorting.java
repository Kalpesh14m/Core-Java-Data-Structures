package com.bunny.algo;

public class SelectionSorting {
	private SelectionSorting() {
	}

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int pos = smallest(arr, i);
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		return arr;
	}

	public static int smallest(int[] arr, int i) {
		int small = arr[i];
		int pos = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < small) {
				small = arr[j];
				pos = j;
			}
		}
		return pos;
	}
}
