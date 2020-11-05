package com.bunny.sorting;

import com.bunny.algo.BubbleSorting;
import com.bunny.utils.InputUtility;
import com.bunny.utils.Utility;

public class BubbleSort {
	static int[] arr;

	public static void main(String[] args) {
		System.out.println("Enter limit of array");
		arr = Utility.getArrayElements(InputUtility.intVal());

		System.out.println("Before Sort: ");
		Utility.display(arr);

		System.out.println("After Sort: ");
		BubbleSorting.sort(arr);
		Utility.display(arr);
	}

}

/*
 *
 * Complexity: 
 * _____________________________________________________
 * |Complexity | Best Case | Average Case | Worst Case |
 * |-----------------------|---------------------------| 
 * |Time       | O(n^2)    | O(n)         | O(n^2)     | 
 * |Space      | O(1)      |              |            |
 * |---------------------------------------------------|
 * 
 * 
 * Algorithm :
 * 
 * Step 1: Repeat Step 2 For i = 0 to N-1 Step 2: Repeat For J = i + 1 to N - I
 * Step 3: IF A[J] > A[i] SWAP A[J] and A[i] [END OF INNER LOOP] [END OF OUTER
 * LOOP Step 4: EXIT
 */
