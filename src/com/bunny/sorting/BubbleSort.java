package com.bunny.sorting;

import com.bunny.utils.InputUtility;
import com.bunny.utils.Utility;

public class BubbleSort {
	static int[] arr;

	public static void main(String[] args) {
		System.out.println("Enter limit of array");
		int limit = InputUtility.intVal();

		arr = Utility.getArrayElements(limit);

		System.out.println("Before Sort: ");
		arr = Utility.display(arr);

		System.out.println("After Sort: ");
		arr = sort(arr);
		Utility.display(arr);
	}

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}

/*
 *
 Complexity:
 _______________________________________________________
|Complexity | Best Case |	Average Case |	Worst Case |
|-----------------------|------------------------------|
|Time       |  O(n^2)   |     O(n)       | O(n^2)      |
|Space 	    |  O(1)     |                |             |
|------------------------------------------------------|


Algorithm :

    Step 1: Repeat Step 2 For i = 0 to N-1
    Step 2: Repeat For J = i + 1 to N - I
    Step 3: IF A[J] > A[i]
    SWAP A[J] and A[i]
    [END OF INNER LOOP]
    [END OF OUTER LOOP
    Step 4: EXIT
*/
