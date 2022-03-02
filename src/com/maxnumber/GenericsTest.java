package com.maxnumber;

import java.util.*;

public class GenericsTest {
	public static String GenMax(String first, String second, String third) {

		String max = first; // considering first is max and assigning max to first
		if (second.compareTo(max) > 0) {
			max = second; // comparing with first max and if greater that assigning to max
		}
		if (third.compareTo(max) > 0) { // comparing with max value and if greater that assigning to max
			max = third;
		}
		displayMax(first, second, third, max);
		return max;
	}

	// displaying numbers
	public static void displayMax(String first, String second, String third, String max) {
		System.out.println("*****To Find Maximum number******");
		System.out.println("The Given Values are:- \na = " + first + "\nb = " + second + "\nc = " + third);
		System.out.println("The maximum number is : " + max);
	}

	public static void main(String[] args) {
		// User input for String numbers
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter the first String value: ");
		String first = scan.nextLine();

		System.out.print(" Enter the second String value: ");
		String second = scan.nextLine();

		System.out.print(" Enter the third String value: ");
		String third = scan.nextLine();
		GenMax(first, second, third);
		scan.close();
	}

}
