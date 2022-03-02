package com.maxnumber;

import java.util.*;

class Maximum {

	public void GenMax(String first, String second, String third) {
		String max = first; // considering first is max and assigning max to first
		if (second.compareTo(max) > 0) {
			max = second; // comparing with first max and if greater that assigning to max
		}
		if (third.compareTo(max) > 0) { // comparing with max value and if greater that assigning to max
			max = third;
		}
		displayMax(first, second, third, max);

	}

// displaying numbers
	public void displayMax(String first, String second, String third, String max) {
		System.out.println("***********To Find Maximum number*********");
		System.out.println("The Given Values are:- \na = " + first + "\nb = " + second + "\nc = " + third);
		System.out.println("The maximum number is : " + max);
	}
}

public class GenericsTest {
	public static void main(String[] args) {
		// User input for String numbers
		Scanner scan = new Scanner(System.in);
		Maximum max = new Maximum();
		System.out.print(" Enter the first String: ");
		String first = scan.nextLine();

		System.out.print(" Enter the second String: ");
		String second = scan.nextLine();

		System.out.print(" Enter the third String: ");
		String third = scan.nextLine();
		max.GenMax(first, second, third);
		scan.close();
	}
}
