package com.maxnumber;

import java.util.*;

public class GenericsTest {

	public static Float GenMax(Float first, Float second, Float third) {

		Float max = first; // considering first is max and assigning max to first
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
	public static void displayMax(Float first, Float second, Float third, Float max) {
		System.out.println("---To Find Maximum number---");
		System.out.println("The Given Values are:- \na = " + first + "\nb = " + second + "\nc = " + third);
		System.out.println("The maximum number is : " + max);
	}

	public static void main(String[] args) {
		// User input for Float numbers
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter the first value: ");
		Float first = scan.nextFloat();

		System.out.print(" Enter the second value: ");
		Float second = scan.nextFloat();

		System.out.print(" Enter the third value: ");
		Float third = scan.nextFloat();
		GenMax(first, second, third);
		scan.close();
	}

}
