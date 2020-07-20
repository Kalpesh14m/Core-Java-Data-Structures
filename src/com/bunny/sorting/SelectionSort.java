package com.bunny.sorting;

import com.bunny.utils.InputUtility;
import com.bunny.utils.Utility;

public class SelectionSort {
	static int[] arr;
	static int pos, i, temp, small, j;

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
		for (i = 0; i < arr.length; i++) {
			pos = smallest(arr, i);
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		return arr;
	}

	public static int smallest(int arr[], int i) {
		small = arr[i];
		pos = i;
		for (j = i + 1; j < arr.length; j++) {
			if (arr[j] < small) {
				small = arr[j];
				pos = j;
			}
		}
		return pos;
	}
}


/*
 * 
Complexity:
 _______________________________________________________
|Complexity | Best Case |	Average Case |	Worst Case |
|-----------------------|------------------------------|
|Time       |  Ω(n)     |    θ(n^2)      | O(n^2)      |
|Space 	    |  O(1)     |                |  O(1        |
|------------------------------------------------------|

Algorithm:

   SELECTION SORT(ARR, N)

    Step 1: Repeat Steps 2 and 3 for K = 1 to N-1
    Step 2: CALL SMALLEST(ARR, K, N, POS)
    Step 3: SWAP A[K] with ARR[POS]
    [END OF LOOP]
    Step 4: EXIT

SMALLEST (ARR, K, N, POS)

    Step 1: [INITIALIZE] SET SMALL = ARR[K]
    Step 2: [INITIALIZE] SET POS = K
    Step 3: Repeat for J = K+1 to N -1
    IF SMALL > ARR[J]
    SET SMALL = ARR[J]
    SET POS = J
    [END OF IF]
    [END OF LOOP]
    Step 4: RETURN POS
*/