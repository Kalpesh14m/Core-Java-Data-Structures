package com.bunny.sorting;

import com.bunny.algo.InsertionSorting;
import com.bunny.utils.InputUtility;
import com.bunny.utils.Utility;

public class InsertionSort {
	static int[] arr;

	public static void main(String[] args) {
		System.out.println("Enter limit of array");
		arr = Utility.getArrayElements(InputUtility.intVal());

		System.out.println("Before Sort: ");
		Utility.display(arr);

		System.out.println("After Sort: ");
		InsertionSorting.sort(arr);
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
|Space 	    |  O(1)     |                |             |
|------------------------------------------------------|

Algorithm:

    Step 1: Repeat Steps 2 to 5 for K = 1 to N-1
    Step 2: SET TEMP = ARR[K]
    Step 3: SET J = K - 1
    Step 4: Repeat while TEMP <=ARR[J]
    SET ARR[J + 1] = ARR[J]
    SET J = J - 1
    [END OF INNER LOOP]
    Step 5: SET ARR[J + 1] = TEMP
    [END OF LOOP]
    Step 6: EXIT
 * */











