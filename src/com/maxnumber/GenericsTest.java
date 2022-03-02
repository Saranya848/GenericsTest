package com.maxnumber;

import java.util.*;

class Maximum {

	public void GenMax(Integer first, Integer second, Integer third) { 
										
		Integer max = first; // considering first is max and assigning max to first
		String position = "first"; // for displaying the position
		if (second.compareTo(max) > 0) {
			max = second; // comparing with first max and if greater that assigning to max
			position = "second";
		}
		if (third.compareTo(max) > 0) { // comparing with max value and if greater that assigning to max
			max = third;
			position = "third";
		}
		displayMax(first, second, third, max);

	}

	private void displayMax(Integer first, Integer second, Integer third, Integer max) {
		System.out.println("***********To Find Maximum number*********");
		System.out.println("The Given Values are:- \na = " + first + "\nb = " + second + "\nc = " + third);
		System.out.println("The maximum number is : " + max);
	}
}

public class GenericsTest {
	public static void main(String[] args) { // main method to find maximum
		Scanner scan = new Scanner(System.in);
		Maximum max = new Maximum();
		System.out.print(" Enter the first value: ");
		Integer first = scan.nextInt();

		System.out.print(" Enter the second value: ");
		Integer second = scan.nextInt();

		System.out.print(" Enter the third value: ");
		Integer third = scan.nextInt();
		max.GenMax(first, second, third);
	}
}
