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
		Scanner scan = new Scanner(System.in);
		Maximum max = new Maximum();
		while (true) { // asking user to select the generic type
			System.out.println(" \n 1. Integers\n 2. Float\n 3. String\n 4. Exit");
			System.out.print(" Please enter your choise from above:  \n ");
			int opt = scan.nextInt();

			switch (opt) { // taking input from user
			case 1: {
				System.out.print(" Enter the first value: ");
				Integer first = scan.nextInt();

				System.out.print(" Enter the second value: ");
				Integer second = scan.nextInt();

				System.out.print(" Enter the third value: ");
				Integer third = scan.nextInt();
				max.GenMax(first, second, third);
				break;
			}
			case 2: {
				System.out.print(" Enter the first value: ");
				Float first = scan.nextFloat();

				System.out.print(" Enter the second value: ");
				Float second = scan.nextFloat();

				System.out.print(" Enter the third value: ");
				Float third = scan.nextFloat();
				max.GenMax(first, second, third);
				break;
			}
			case 3: {
				System.out.print(" Enter the first value: ");
				String first = scan.next();

				System.out.print(" Enter the string: ");
				String second = scan.next();

				System.out.print(" Enter the string: ");
				String third = scan.next();
				max.GenMax(first, second, third);
				break;
			}
			case 4:
				System.out.println(" You have exited from the program!!");
				scan.close();
				return;
			default:
				System.out.println("Please enter a valid input from above");
			}

		}

	}
}
