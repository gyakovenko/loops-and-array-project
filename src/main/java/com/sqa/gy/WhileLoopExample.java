/**
 *   File Name: WhileLoopExample.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 19, 2017
 *
 */

package com.sqa.gy;

/**
 * WhileLoopExample Write a Java program which prints all even number from 1 to
 * 100, then all odd numbers between 300-400, and finally prints 30-333 with
 * only numbers evenly divided by 3 . Use a while loop for this exercise. You
 * will also want to use an if condition and use the % operator to check if a
 * number % 2 is equal to 0 and print it if that is the case.
 *
 * @author Yakovenko, Galina
 *
 */

public class WhileLoopExample {

	public static void main(String[] args) {
		// While print all evens from 1 -> 100
		printAscendingCountByWhile(1, 100, 2, 0);
		System.out.println("\n");

		// While print all odd from 300 -> 400
		printAscendingCountByWhile(300, 400, 2, 1);
		System.out.println("\n");

		// While print all div by 3 from 30 ->333
		printAscendingCountByWhile(30, 333, 3, 0);
	}

	public static void printAscendingCountByWhile(int minInclusive, int maxInclusive, int divisibilityCheck,
			int remainder) {
		int currentNumber = minInclusive;
		while (currentNumber <= maxInclusive) {
			if (currentNumber % divisibilityCheck == remainder) {
				System.out.println(currentNumber);
			}
			currentNumber++;
		}
	}
}
