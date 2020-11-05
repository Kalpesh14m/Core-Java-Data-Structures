package com.bunny.sorting;

import com.bunny.algo.SelectionSorting;
import com.bunny.utils.InputUtility;
import com.bunny.utils.Utility;

public class SelectionSort {
	static int[] arr;

	public static void main(String[] args) {
		System.out.println("Enter limit of array");
		arr = Utility.getArrayElements( InputUtility.intVal());

		System.out.println("Before Sort: ");
		Utility.display(arr);

		System.out.println("After Sort: ");
		SelectionSorting.sort(arr);
		Utility.display(arr);
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