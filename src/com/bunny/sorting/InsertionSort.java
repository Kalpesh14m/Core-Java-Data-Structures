package com.bunny.sorting;

import com.bunny.utils.InputUtility;
import com.bunny.utils.Utility;

public class InsertionSort {
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
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp <= arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
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











