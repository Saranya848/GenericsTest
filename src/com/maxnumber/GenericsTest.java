package com.maxnumber;

import java.util.*;

class Maximum {

	public <T extends Comparable<T>> void GenMax(T first, T second, T third) { // using generic type T and making the
																				// method generic.
		T max = first; // considering first is max and assigning max to first
		String position = "first"; // for displaying the position
		if (second.compareTo(max) > 0) {
			max = second; // comparing with first max and if greater that assigning to max
			position = "second";
		}
		if (third.compareTo(max) > 0) { // comparing with max value and if greater that assigning to max
			max = third;
			position = "third";
		}
		System.out.println("The maximum number is in " + position + " position and the number is : " + max);
	}

}

public class GenericsTest {
	public static void main(String[] args) { // main method to find maximum
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			Maximum max = new Maximum();
			System.out.println("---------Find Maximum-------- ");
			System.out.print(" Enter the first value: ");
			Float first = sc.nextFloat();

			System.out.print(" Enter the second value: ");
			Float second = sc.nextFloat();

			System.out.print(" Enter the third value: ");
			Float third = sc.nextFloat();
			max.GenMax(first, second, third);
		}

	}
}
