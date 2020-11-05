package com.bunny.utils;

import java.util.Scanner;

public class InputUtility {
	private static final Scanner SC = new Scanner(System.in);

	private InputUtility() {
	}

	public static int intVal() {
		return SC.nextInt();
	}

}
