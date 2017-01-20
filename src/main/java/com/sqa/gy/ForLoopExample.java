/**
 *   File Name: ForLoopExample.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 19, 2017
 *
 */

package com.sqa.gy;

/**
 * ForLoopExample Write a Java program which prints out a count from 1 to 100,
 * than prints the numbers 200-100, and finally prints 10-1000 with only numbers
 * evenly divided by 10. Use the for loop to do these and do not use the %
 * operator.
 *
 * @author Yakovenko, Galina
 */
public class ForLoopExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// method to print 1 -> 100
		printAscendingCountByFor(1, 100, 1);
		System.out.print("\n");

		// method print 200 -> 100
		printDescendingCountByFor(200, 100, 1);
		System.out.print("\n");

		// method print 10 - 1000 using i =+ 10
		printAscendingCountByFor(10, 1000, 10);
	}

	public static void printAscendingCountByFor(int minInclusive, int maxInclusive, int numToDeIncrementBy) {
		for (int i = minInclusive; i <= maxInclusive; i += numToDeIncrementBy) {
			if (i == minInclusive) {
				System.out.print(i);
			} else {
				System.out.print(", " + i);
			}
		}
		System.out.print("\n");
	}

	public static void printDescendingCountByFor(int maxInclusive, int minInclusive, int numToDeIncrementBy) {
		for (int i = maxInclusive; i >= minInclusive; i -= numToDeIncrementBy) {
			if (i == maxInclusive) {
				System.out.print(i);
			} else {
				System.out.print(", " + i);
			}
		}
		System.out.print("\n");
	}

}
